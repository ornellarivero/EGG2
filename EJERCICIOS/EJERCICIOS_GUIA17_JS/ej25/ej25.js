var formulario=document.getElementById("form1").textContent.value;
console.log("formulario: ",formulario);
function getFormValores(){
    var nombre =document.getElementById("nombre").value;
    var apellido =document.getElementById("apellido").value;
    prompt("nombre: ",nombre);
    prompt("apellido: ",apellido);
};