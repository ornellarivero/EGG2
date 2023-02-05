function espaciarLetras() {
  var letrasSeparadas = document.getElementById("frase").value.split('').join(" ");
  document.getElementById("fraseConEspacio").innerHTML = letrasSeparadas;
}

document.getElementById("btnListo").onclick=espaciarLetras;
