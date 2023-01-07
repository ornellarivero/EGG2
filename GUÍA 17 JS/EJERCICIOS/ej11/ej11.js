document.getElementById("btnListo").onclick = () => {
  var texto = document.getElementById("texto").value;
  var array = texto.split(" ");

  var aux = 0;
  var masLarga = "";

  for (let i = 0; i < array.length; i++) {
    if (array[i].length > aux) {
      aux = array[i].length;
      masLarga = array[i];
    }
  }
  document.getElementById("masLarga").innerHTML = "La palabra más larga es: " + masLarga;
};
