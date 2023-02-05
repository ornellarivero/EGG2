var personas = [];

function creandoPersona() {
  function Persona(nombre, edad, sexo, peso, altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
  }

  var nombre = document.getElementById("nombre").value;
  var edad = document.getElementById("edad").value;
  var sexo = document.getElementById("sexo").value;
  var peso = document.getElementById("peso").value;
  var altura = document.getElementById("altura").value;

  var perso = new Persona(nombre, edad, sexo, peso, altura);
  personas.push(perso);

  var recorrerArray = personas.map(function (perso) {
    return (
      "<li>" +
      perso.nombre +
      " " +
      perso.edad +
      " " +
      perso.sexo +
      " " +
      perso.peso +
      " " +
      perso.altura +
      "</li>"
    );
  });

  document.getElementById("personas").innerHTML = recorrerArray;
}

document.getElementById("crear").onclick = creandoPersona;
