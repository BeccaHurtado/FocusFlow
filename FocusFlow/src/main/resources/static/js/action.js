
// {
//   "id": "6565931c7929c96650eb2822",
//   "name": "Date feature",
//   "description": "testing the date to not be a   string",
//   "priority": "Medium",
//   "date": "Wed Dec 31 20:07:52 MST 1969"
// }

 // to event-handling functions.
(function bindEvents(){
    console.log('Binding events...');
    document.getElementById('clickableButton').addEventListener('click', buttonClicked);
})();

function buttonClicked(){
    let taskNameInput = document.getElementById('tasknameinput').value;
    let taskDescInput = document.getElementById('desinput').value;
    let taskDateInput = document.getElementById('dateinput').value;
    let taskPriority = document.getElementById('pselect').value;

    addTask(taskNameInput, taskDescInput, taskDateInput, taskPriority)
    
}


// fetch all task function
async function getAllTask(url = "http://localhost:8080/tasks") {
  const response = await fetch(url, {
    method: "GET", 
    mode: "no-cors", 

    headers: {
      "Content-Type": "application/json",
      "Access-Control-Allow-Origin" : "*"
    }
   
  });
  //console.log(response)
  return response.json()
}

async function addTask(data = {name, description, dueDate, priority}) {
  const response = await fetch("http://localhost:8080/create", {
    method: "POST", 
    mode: "no-cors",


    headers: {
      "Content-Type": "application/json",
      "Access-Control-Allow-Origin" : "*"
    },
    
  body: JSON.stringify(data)

  })
}



async function renderData() {
  var container = document.querySelector('#overallTaskSpace');
  var data = await getAllTask();

  //console.log(data);
  if (!data) {
    return;
  }
  for (let i =0; i < data.length; i++) {
    console.log(data[i])
    var card = document.createElement('div');
    card.classList.add('card');

    console.log(card);
    var divTaskName = document.createElement('div');
    divTaskName.innerHTML = data[i].name;
    divTaskName.classList.add('taskTitle')
    card.appendChild(divTaskName);
    
    var divTaskDescription = document.createElement('div');
    divTaskDescription.innerHTML = data[i].description;
    card.appendChild(divTaskDescription);
    
    var divTaskDue = document.createElement('div');
    divTaskDue.innerHTML = data[i].dueDate;
    card.appendChild(divTaskDue);
    
    var divTaskPriority = document.createElement('div');
    divTaskPriority.innerHTML = data[i].priority;
    card.appendChild(divTaskPriority);

    container.appendChild(card);
  }
}

renderData();

// for each function
// function displayTasks(array) {
//   array.forEach(element => {
//     const name = document.createElement("p")
//     const node = document.createTextNode(element.name)
//     console.log(element.name)
//     name.appendChild(node)
//   });
//   }
  
//   (function pageLoad() {
//     console.log("page load")
//     displayTasks(getAllTask())
//     console.log("test")
//   }
//   )();

// open form
function openForm() {
  document.getElementById("formPopup").style.display = "block";
}

// close form
function closeForm() {
  document.getElementById("formPopup").style.display = "none";
}







