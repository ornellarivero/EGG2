function fondoClima() {
    let pregunta = prompt("Cómo está el día?: ")
    let respuesta = document.getElementById("respuesta").innerHTML = "EL DÍA ESTÁ " + pregunta.toUpperCase();

    switch (pregunta) {
        case "soleado":
            document.body.style.backgroundImage = "url('../img/soleado.jpg')";
            document.body.style.backgroundSize = "cover";
            break;
        case "nublado":
            document.body.style.backgroundImage = "url('../img/nublado.jpg')";
            document.body.style.backgroundSize = "cover";
            break;
        case "frío" || "frio":
            document.body.style.backgroundImage = "url('../img/frio.jpeg')";
            break;
        case "fresco":
            document.body.style.backgroundImage = "url('../img/fresco.jpg')";
            document.body.style.backgroundSize = "cover";
            break;
        case "lluvioso":
            document.body.style.backgroundImage = "url('../img/lluvioso.jpg')";
            document.body.style.backgroundSize = "cover";
            break;
        case "caluroso":
            document.body.style.backgroundImage = "url('../img/caluroso.jpg')";
            document.body.style.backgroundSize = "cover";
            break;

        default:
            document.body.style.backgroundImage = "url('../img/clima.jpg')";
            document.body.style.backgroundSize = "cover";
            break;
    }
}
fondoClima();
document.getElementById("button").hidden = false;