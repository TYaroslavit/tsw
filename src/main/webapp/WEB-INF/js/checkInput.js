const onlyLetters = /^[A-Za-z0-9]+$/g;
const emailcheck = /^\w+(\.-]?\w+)*@\w+(\.-]?\w+)*(\.\w{2,3})+$/g;

function validate(obj){

    console.log("lol");
    return true;
}
/* var valid = true;
var nome = obj.getElementsByName("nome")[0];
var cognome = obj.getElementsByName("cognome")[0];
var email = obj.getElementsByName("email")[0];

checkNome(nome);
checkNome(cognome);
checkEmail(email);

function checkNome(Inputtext){
    if(Inputtext.value.match(onlyLetters)) Inputtext.style.backgroundColor = "red";
    return false;
}

function checkEmail(Inputtext){
    if(Inputtext.value.match(onlyLetters)) return true;
    return false;
} */