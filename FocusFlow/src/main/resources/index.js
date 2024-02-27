// This specific pattern of parenthesis and curly braces 
// make this function fire when the document is loaded.
// This specific function binds HTML elements and their events

//  to event-handling functions.
(function bindEvents(){
    console.log('Binding events...');
    document.getElementById('clickableButton').addEventListener('click', buttonClicked);
})();

function buttonClicked(){
    console.log('The button has been clicked!')
    alert('Clicked')
}




// (function getAllTask() {

//         const options = {
//             method: 'GET',
//             headers: {'Content-Type': 'application/json', 'Access-Control-Allow-Origin' : '*', 'Access-Control-Allow-Methods': 'GET', 'Access-Control-Allow-Headers': 'Content-Type'}
//           };
          
//           fetch('http://localhost:8080/', options)
//             .then(response => response.json())
//             .then(response => console.log(response))
//             .catch(err => console.error(err));
//      console.log(response.json())
//     })();

//Example POST method implementation:
// async function getAllTask(url = "http://localhost:8080/tasks", data={}) {
//   // Default options are marked with *
//   const response = await fetch(url, {
//     method: "GET", // *GET, POST, PUT, DELETE, etc.
//     mode: "no-cors", // no-cors, *cors, same-origin
//     //cache: "no-cache", // *default, no-cache, reload, force-cache, only-if-cached
//    // credentials: "same-origin", // include, *same-origin, omit
//     headers: {
//       "Content-Type": "application/json",
//       "Access-Control-Allow-Origin" : "*"
//       // 'Content-Type': 'application/x-www-form-urlencoded',
//     },
//     //redirect: "follow", // manual, *follow, error
//     //referrerPolicy: "no-referrer", // no-referrer, *no-referrer-when-downgrade, origin, origin-when-cross-origin, same-origin, strict-origin, strict-origin-when-cross-origin, unsafe-url
//     body: JSON.stringify(data), // body data type must match "Content-Type" header
//   });
//   console.log(response);
//   return response.json(); // parses JSON response into native JavaScript objects
// }

// getAllTask().then((data) => {
//   console.log(data); // JSON data parsed by `data.json()` call
// });

// function getAllTask() {
//   try {
//     var getAllTaskUrl = "https://127.0.0.1:8080/";
//     var xhttp = new XMLHttpRequest();
//     xhttp.onreadystatechange = function() {
//       try {
//         if (this.readyState == 4) {
//           var response = this.responseText;
//           document.getElementById("taskId").innerHTML = response;
//         }
//       }
//       catch (erMS)
//       {
//         document.getElementById("taskId").innerHTML = erMS;
//       }
//     };
//     xhttp.open("GET", getAllTaskUrl, true);
//     xhttp.setRequestHeader('Content-Type', 'text/plain');
//     xhttp.send();
//   }
//   catch(erMsg) {
//     document.getElementById("taskId").innerHtml = erMsg;
//   }
// }


