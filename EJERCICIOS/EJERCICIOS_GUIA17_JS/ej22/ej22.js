var mensaje="";

document.getElementById("empezar").onclick=()=>{
    mensaje=prompt("Escribe un mensaje: ");
};

document.getElementById("mostrar").onclick=()=>{
    document.getElementById("mensaje").innerHTML=mensaje;
};
