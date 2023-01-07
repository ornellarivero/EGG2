function sumar() {
  const limite = parseInt(document.getElementById("limite").value);
  var suma = 0;
  var num = 0;

  while (suma < limite) {
    num = prompt("Ingrese número: ");
    num = parseInt(num);
    alert(suma + "+" + num);
    suma = suma + num;

    
    document.getElementById("advertencia").innerHTML = suma;
    if (num > limite || suma > limite) {
      document.getElementById("advertencia").style.color = "red";
      document.getElementById("advertencia").innerHTML =
        "El resultado supera el límite!";
    }
  }
}

document.getElementById("btnSumar").onclick = sumar;
