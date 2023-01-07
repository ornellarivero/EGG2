// isNaN= "is Not a Number"

document.getElementById("btnListo").onclick = () => {
  var dato = document.getElementById("dato").value;
  if (dato === "true" || dato === "false") {
    document.getElementById("tipodedato").innerHTML =
      "El tipo de dato ingresado es 'Boolean'";
  } else if (!isNaN(dato)) {
    document.getElementById("tipodedato").innerHTML =
      "El tipo de dato ingresado es 'Number'";
  } else if (isNaN(dato)) {
    document.getElementById("tipodedato").innerHTML =
      "El tipo de dato ingresado es 'String'";
  } else {
    document.getElementById("tipodedato").innerHTML = "Tipo de dato indefinido";
  }
};
