// SUMAR
function sumar() {
    const num1 = document.getElementById("num1").value;
    const num2 = document.getElementById("num2").value;

    const resultado = (parseInt(num1) + parseInt(num2));

    document.getElementById("card-resultado").style.visibility = "visible";
    document.getElementById("titulo").innerHTML = "Resultado de la suma entre " + num1 + " y " + num2;
    document.getElementById("resultado").innerHTML = resultado;
    document.getElementById("resultado").style.color = "green";
}

document.getElementById("sumar").onclick = sumar;

// RESTAR
function restar() {
    const num1 = document.getElementById("num1").value;
    const num2 = document.getElementById("num2").value;

    const resultado = (num1 - num2);

    document.getElementById("card-resultado").style.visibility = "visible";
    document.getElementById("titulo").innerHTML = "Resultado de la resta entre " + num1 + " y " + num2;
    document.getElementById("resultado").innerHTML = resultado;
    document.getElementById("resultado").style.color = "red";
}

document.getElementById("restar").onclick = restar;

// DIVIDIR
function dividir() {
    const num1 = document.getElementById("num1").value;
    const num2 = document.getElementById("num2").value;

    const resultado = (num1 / num2);

    document.getElementById("card-resultado").style.visibility = "visible";
    document.getElementById("titulo").innerHTML = "Resultado de la división entre " + num1 + " y " + num2;
    document.getElementById("resultado").innerHTML = resultado;
    document.getElementById("resultado").style.color = "blue";
}

document.getElementById("dividir").onclick = dividir;

// MULTIPLICAR
function multiplicar() {
    const num1 = document.getElementById("num1").value;
    const num2 = document.getElementById("num2").value;

    const resultado = (num1 * num2);

    document.getElementById("card-resultado").style.visibility = "visible";
    document.getElementById("titulo").innerHTML = "Resultado de la multiplicación entre " + num1 + " y " + num2;
    document.getElementById("resultado").innerHTML = resultado;
    document.getElementById("resultado").style.color = "#FED049";
}

document.getElementById("multiplicar").onclick = multiplicar;