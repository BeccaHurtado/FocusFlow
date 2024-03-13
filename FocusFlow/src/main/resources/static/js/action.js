
// {
//   "id": "6565931c7929c96650eb2822",
//   "name": "Date feature",
//   "description": "testing the date to not be a   string",
//   "priority": "Medium",
//   "date": "Wed Dec 31 20:07:52 MST 1969"
// }

 // to event-handling functions.
// (function bindEvents(){
//     console.log('Binding events...');
//     document.getElementById('clickableButton').addEventListener('submit', buttonClicked);
// })();

// function buttonClicked(){
//     let taskNameInput = document.getElementById('tasknameinput').value;
//     let taskDescInput = document.getElementById('desinput').value;
//     let taskDateInput = document.getElementById('dateinput').value;
//     let taskPriority = document.getElementById('pselect').value;

//     addTask(taskNameInput, taskDescInput, taskDateInput, taskPriority)
    
// }

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



async function renderData() {
  var container = document.querySelector('.container');
  var data = await getAllTask();

  //console.log(data);
  if (!data) {
    return;
  }
  for (let i =0; i < data.length; i++) {
    console.log(data[i])
    var card = document.createElement('div');
    card.classList.add('card');

    var cardBody = document.createElement('div');
    cardBody.classList.add('cardBody')
    
    console.log(card);
    var divTaskName = document.createElement('div');
    divTaskName.innerHTML = data[i].name;
    divTaskName.classList.add('taskTitle')
    cardBody.appendChild(divTaskName)
    
    var divTaskDue = document.createElement('span');
    divTaskDue.innerHTML = data[i].dueDate;
    divTaskDue.classList.add('dateDue')
    cardBody.appendChild(divTaskDue)
    
    var divTaskPriority = document.createElement('span');
    divTaskPriority.innerHTML = data[i].priority;
    divTaskPriority.classList.add('taskPriority');
    cardBody.appendChild(divTaskPriority)

    var divTaskDescription = document.createElement('p');
    divTaskDescription.innerHTML = data[i].description;
    divTaskDescription.classList.add('descText')
    cardBody.appendChild(divTaskDescription) 

    // button div
    var buttonDiv = document.createElement('div');
    buttonDiv.classList.add('buttonDiv')
    // done button
    var doneBtn = document.createElement('button');
    doneBtn.textContent = 'Done'
    doneBtn.classList.add('doneBtn')
    // edit button
    var editBtn = document.createElement('button');
    editBtn.textContent = 'Edit'
    editBtn.classList.add('editBtn')
    // add both buttons to div
    buttonDiv.appendChild(doneBtn)
    buttonDiv.appendChild(editBtn)
    cardBody.appendChild(buttonDiv)
    
    // add container to card
    container.appendChild(card);
    card.appendChild(cardBody)
    // add button div to card
  }
}

renderData();


// open form
function openForm() {
  document.getElementById("formPopup").style.display = "block";
}

// close form
function closeForm() {
  document.getElementById("formPopup").style.display = "none";
}







