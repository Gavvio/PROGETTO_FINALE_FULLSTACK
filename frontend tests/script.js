

let bottonesignup=document.querySelector("#button_signup");

bottonesignup.addEventListener("click",()=>{
let nome=document.querySelector("#inputName").value;
let cognome=document.querySelector("#inputSurname").value;
let email=document.querySelector("#inputEmail4").value;
let password=document.querySelector("#inputPassword4").value;

var myHeaders = new Headers();
myHeaders.append("Content-Type", "application/json");

var raw = JSON.stringify({
    "name": `${nome}`,
    "username": `${cognome}`,
    "email": `${email}`,
    "password": `${password}`
  });
  
  var requestOptions = {
    method: 'POST',
    headers: myHeaders,
    body: raw,
    redirect: 'follow'
  };
  
  fetch("http://localhost:8080/api/auth/register", requestOptions)
    .then(response => response.text())
    .then(result => console.log(result))
    .catch(error => console.log('error', error));

})

bottonelogin=document.querySelector("#button_login");

bottonelogin.addEventListener("click",()=>{

    let cognome=document.querySelector("#inputSurname2").value;
    let password=document.querySelector("#inputPassword5").value;

var myHeaders = new Headers();
myHeaders.append("Content-Type", "application/json");

var raw = JSON.stringify({
  "username": `${cognome}`,
  "password": `${password}`
});

var requestOptions = {
  method: 'POST',
  headers: myHeaders,
  body: raw,
  redirect: 'follow'
};

fetch("http://localhost:8080/api/auth/login", requestOptions)
  .then(response => response.text())
  .then(result => console.log(result))
  .catch(error => console.log('error', error));
})
console.log("ciao");
