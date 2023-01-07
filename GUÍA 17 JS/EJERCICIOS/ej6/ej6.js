function respuesta() {
  const numIngresado = document.getElementById("numIngresado").value;
  if (numIngresado % 2 === 0) {
    document.getElementById("div_respuesta").style.visibility = "visible";
    document.getElementById("input_vacio").style.visibility = "hidden";
    document.getElementById("respuesta").innerHTML =
      " El  " + numIngresado + "  es PAR";
  } else {
    document.getElementById("div_respuesta").style.visibility = "visible";
    document.getElementById("input_vacio").style.visibility = "hidden";
    document.getElementById("respuesta").innerHTML =
      " El  " + numIngresado + "  es IMPAR";
  }
  if (numIngresado=="") {
    document.getElementById("div_respuesta").style.visibility = "visible";
    document.getElementById("input_vacio").style.visibility = "visible";
    document.getElementById("respuesta").innerHTML =
      " Debe ingresar un número!!";
  }
}
document.getElementById("ok").onclick = respuesta;
