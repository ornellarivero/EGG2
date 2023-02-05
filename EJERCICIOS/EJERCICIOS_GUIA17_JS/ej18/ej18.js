var valores = [true, 5, false, "hola", "adios", 2];
console.log("ARRAY: "+ valores);
// a) Determinar cual de los dos elementos de texto es mayor.
if (valores[3].length > valores[4].length) {
  console.log(
    ">>> El string '" + valores[3] + "' es mayor que '" + valores[4] + "'."
  );
} else {
  console.log(
    ">>> El string '" + valores[4] + "' es mayor que '" + valores[3] + "'."
  );
}
// b) Utilizando exclusivamente los dos valores booleanos del array, determinar los operadores necesarios para obtener un resultado true y otro resultado false.
var arrayBooleans = [];
valores.forEach((valor) => {
  if (typeof valor == "boolean") {
    arrayBooleans.push(valor);
  }
});
console.log(
  ">>> Valores booleanos existentes en el array: " + arrayBooleans.toString()+"."
);
// c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los dos elementos numéricos.
var suma = 0;
var resta = 0;
var multiplicar = 1;
var numeros = [];

valores.forEach((valor) => {
  if (typeof valor == "number") {
    suma = suma + valor;
    resta = valor - resta;
    multiplicar = multiplicar * valor;
    numeros.push(valor);
  }
});
console.log(">>> Operaciones con los núm. del array:");

console.log(".Suma: " + suma);
console.log(".Resta: " + resta * -1);
console.log(".Multiplica: " + multiplicar);
console.log(".Divide: " + numeros[0] / numeros[numeros.length - 1]);
console.log(".Potencia: " + Math.pow(numeros[0], numeros[numeros.length - 1]));
