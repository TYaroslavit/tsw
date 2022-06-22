const LettersNum = /^[A-Za-z0-9]+$/;
const Letters = /^[A-Za-z]+$/;
const Num = /[0-9]{5}$/;
const NumCel = /^[0-9]{11}$/;
const emailcheck = /^\w+(\.-]?\w+)*@\w+(\.-]?\w+)*(\.\w{2,3})+$/;
const adress = /^via [A-Za-z ]+[0-9]{1,3}\/?[0-9A-Za-z]$/;
var valid = true;

function validate(){
    
    var nome = document.getElementsByName("nome")[0];
    var cognome = document.getElementsByName("cognome")[0];
    var indirizzo = document.getElementsByName("indirizzo")[0];
    var email = document.getElementsByName("email")[0];
    var indirizzo = document.getElementsByName("indirizzo")[0];
    var citta = document.getElementsByName("citta")[0];
    var zip = document.getElementsByName("zip")[0];
    var tel = document.getElementsByName("telefono")[0];
    var data = document.getElementsByName("data")[0];
checkNome(nome);
checkNome(cognome);
checkEmail(email);
checkIndirizzo(indirizzo);
checkCitta(citta);
checkZip(zip);
checkCel(tel);
checkEta(data);
if(!valid) document.getElementById("error_warning").innerHTML= "Controlla i campi segnati in rosso";
}



function checkNome(Inputtext){
    if(Inputtext.value.match(LettersNum)) Inputtext.style.backgroundColor = "#A9F6B1";
    else {
        Inputtext.style.backgroundColor = "#F6A9AE";
        valid = false;
    }
}



function checkEmail(Inputtext){
    if(Inputtext.value.match(emailcheck)) Inputtext.style.backgroundColor = "#A9F6B1";
    else Inputtext.style.backgroundColor = "#F6A9AE";
} 
function checkIndirizzo(Inputtext){
    if(Inputtext.value.match(adress)) Inputtext.style.backgroundColor = "#A9F6B1";
    else Inputtext.style.backgroundColor = "#F6A9AE";
}
function checkCitta(Inputtext){
    if(Inputtext.value.match(Letters)) Inputtext.style.backgroundColor = "#A9F6B1";
    else {
        Inputtext.style.backgroundColor = "#F6A9AE";
        valid = false;
    }
}
function checkZip(Inputtext){
	
    if(Inputtext.value.match(Num)) Inputtext.style.backgroundColor = "#A9F6B1";
    else {
        Inputtext.style.backgroundColor = "#F6A9AE";
        valid = false;
    }
}
function checkCel(Inputtext){
    if(Inputtext.value.match(NumCel)) Inputtext.style.backgroundColor = "#A9F6B1";
    else {
        Inputtext.style.backgroundColor = "#F6A9AE";
        valid = false;
    }
}
function checkEta(date){
    if(!date.value ==""){
        
        let dateString = date.value;

        // First check for the pattern
        if(!/^\d{1,2}\/\d{1,2}\/\d{4}$/.test(dateString))
        date.style.backgroundColor = "#F6A9AE";
    
        // Parse the date parts to integers
        var parts = dateString.split("/");
        var day = parseInt(parts[1], 10);
        var month = parseInt(parts[0], 10);
        var year = parseInt(parts[2], 10);
    
        // Check the ranges of month and year
        if(year < 1000 || year > 3000 || month == 0 || month > 12)
        date.style.backgroundColor = "#F6A9AE";
    
        var monthLength = [ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 ];
    
        // Adjust for leap years
        if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
            monthLength[1] = 29;
    
        // Check the range of the day
        date.style.backgroundColor = "#A9F6B1";
    }
    else {
        date.style.backgroundColor = "#F6A9AE";
        console.log("daw");
    }
    
    
        
    
       
        
    
}