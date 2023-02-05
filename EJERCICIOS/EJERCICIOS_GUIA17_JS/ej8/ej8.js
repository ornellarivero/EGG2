var array = [];

function llenarArray() {
  var num = 1;
  while (num != 0) {
    num = prompt("Ingresar número: ");
    num = parseInt(num);
    array.push(num);
    if (num == 0) {
      array.pop();
    }
  }
  document.getElementById("numIngresados").style.visibility="visible";
  document.getElementById("numIngresados").innerHTML =
    "Núm. ingresados: " + array;
  console.log("DESORDENADO: " + array);

  function ordenar(a, b) {
    if (a > b) return 1;
    if (a == b) return 0;
    if (a < b) return -1;
  }

  // ordena array "maximo"
  array.sort(ordenar);
  document.getElementById("numOrdenados").style.visibility="visible";
  document.getElementById("numOrdenados").innerHTML =
    "Núm. ordenados: " + array;
  console.log("ARRAY ORDENADO: " + array);

  var mayor = array[array.length - 1];
  document.getElementById("max").innerHTML = mayor;
  console.log("MAYOR: " + mayor);

  var menor = array[0];
  document.getElementById("min").innerHTML = menor;
  console.log("MENOR: " + menor);

  // suma nums array
  var suma = 0;
  for (let i = 0; i < array.length; i++) {
    var suma = array[i] + suma;
    suma = suma;
  }

  var promedio = suma / array.length;
  document.getElementById("promedio").innerHTML = promedio;
}

document.getElementById("btnComenzar").onclick = llenarArray;
