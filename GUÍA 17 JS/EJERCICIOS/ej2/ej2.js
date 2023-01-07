function calcular() {
    var radio = document.getElementById("radio").value;
    var perimetro =Math.round((2 * Math.PI * radio));
    var area =Math.round(Math.PI * (radio * radio));
    document.getElementById("perimetro").innerHTML = "Perímetro: " + perimetro;
    document.getElementById("area").innerHTML = "Área: " + area;
}