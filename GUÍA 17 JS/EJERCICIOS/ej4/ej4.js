const letra = prompt("Introduzca una letra: ");
        if ((letra.toLowerCase() === 's') || (letra.toLowerCase() === 'n')) {
            document.getElementById("mensaje").innerHTML = "CORRECTO!";
            document.getElementById("mensaje").style.color="green";
            const img = document.createElement('img');
            img.src = "../img/correcto.jpg";
            img.alt = "correcto";
            document.body.appendChild(img);
            img.setAttribute("id", "imagen");
            document.getElementById("imagen").style.width="300px";
            
        } else {
            document.getElementById("mensaje").innerHTML = "INCORRECTO!";
            document.getElementById("mensaje").style.color="red";
            const img = document.createElement('img');
            img.src = "../img/incorrecto.jpg";
            img.alt = "incorrecto";
            document.body.appendChild(img);
            img.setAttribute("id", "imagen");
            document.getElementById("imagen").style.width="300px";
        }