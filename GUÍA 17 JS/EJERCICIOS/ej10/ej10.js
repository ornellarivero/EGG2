// -------------------------------------------------------------------
// °°°FUNCIÓN NORMAL°°°

// function textoInvertido() {
//   document.getElementById("textoInvertido").innerHTML=document.getElementById("texto").value.split("").reverse().join("");
// }
// -------------------------------------------------------------------


// -------------------------------------------------------------------
// °°°FUNCIÓN CON FLECHA°°°

// const textoInvertido = () => {
//   var palabra = document.getElementById("texto").value;
//   document.getElementById("textoInvertido").innerHTML = palabra.split("").reverse().join("");
// };
// -------------------------------------------------------------------


// -------------------------------------------------------------------
// °°°SIMPLIFICANDO FUNCIÓN DENTRO DE EVENTO°°°

document.getElementById("btnListo").onclick = () => {
    var palabra = document.getElementById("texto").value;
    document.getElementById("textoInvertido").innerHTML = palabra.split("").reverse().join("");
  };
  // -------------------------------------------------------------------
