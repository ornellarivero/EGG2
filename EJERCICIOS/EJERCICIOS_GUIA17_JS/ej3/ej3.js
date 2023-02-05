var edad = prompt("Cuántos años tenés?")
            if (edad == 18) {
                document.getElementById("es_mayor").innerHTML = "Tiene " + edad + " años. Es Mayor.";
                const img = document.createElement('img');
                img.src = "../img/tiene_18.jpg";
                img.alt = "tengo_18";
                document.body.appendChild(img);
            } else if (edad > 18) {
                document.getElementById("es_mayor").innerHTML = "Tiene " + edad + " años. Es Mayor.";
                const img = document.createElement('img');
                img.src = "../img/mayor_18.jpg";
                img.alt = "mayor_18";
                document.body.appendChild(img);
            } else {
                document.body.style.backgroundImage = "url('../img/es_bebe.jpg')";
                document.body.style.backgroundSize = "cover";
                document.getElementById("es_mayor").innerHTML = "Así que soy 'menor de edad' eh...pues...";
                document.body.style.backgroundRepeat = "no-repeat";
            }