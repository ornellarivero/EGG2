// Guarda elemento html
var elemento = document.getElementById("texto");
console.log(elemento);
// Guarda el contenido del elemento (en este caso un texto)
var elementoContenido = elemento.innerHTML;
console.log(elementoContenido);
// Genera un array separando cada contenido (palabra) por coma
var arrayPalabras = elementoContenido.split(/[\s,\.,\?,\"]+/);
console.log(arrayPalabras);
arrayPalabras.forEach((palabra) => {
  if (palabra.length > 8) {
    console.log(palabra);
    // Reemplaza la palabra original por la q está en "bold", al dividir el texto por la palabra buscada y volviéndolo a unir con la palabra en "bold"
    elementoContenido = elementoContenido
      .split(palabra)
      .join(`<b>${palabra}</b>`);
    console.log(elementoContenido);
   elemento.innerHTML = elementoContenido;
  }
});
