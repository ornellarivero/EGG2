document.getElementById("llenar").onclick = () => {
  let cont = 0;
  let vector1 = [];
  let vector2 = [];
  while (cont < 5) {
    vector1.push(Math.round(Math.random() * 5) + 1);
    vector2.push(Math.round(Math.random() * 10));
    cont++;
  }
  document.getElementById("vector1").innerHTML = "Vector 1: [" + vector1 + "]";
  document.getElementById("vector2").innerHTML = "Vector 2: [" + vector2 + "]";
};
