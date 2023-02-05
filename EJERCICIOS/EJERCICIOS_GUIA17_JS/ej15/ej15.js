document.getElementById("btncalcular").onclick = () => {
  var radio = document.getElementById("radio").value;

  document.getElementById("area").innerHTML =
    "Área: " + Math.PI * Math.pow(radio, 2);

  document.getElementById("perimetro").innerHTML =
    "Perímetro: " + 2 * Math.PI * radio;
};
