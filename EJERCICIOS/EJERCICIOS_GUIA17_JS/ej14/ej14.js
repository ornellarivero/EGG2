var libros = [];

// CREAR
document.getElementById("crear").onclick = () => {
  var libro = {
    ISBN: document.getElementById("ISBN").value,
    titulo: document.getElementById("titulo").value,
    autor: document.getElementById("autor").value,
    numeroPaginas: document.getElementById("numero-paginas").value,
  };
  libros.push(libro);
  console.log(libros);
};

// BUSCAR LIBRO
function buscarLibro() {
  var buscarLibro = document.getElementById("buscarLibro").value;
  var encontrados = libros.map(function (lib) {
    if (lib.titulo.toLowerCase() === buscarLibro.toLowerCase()) {
      return "<li>" + '"' + lib.titulo + '"(' + lib.autor +') // '+lib.ISBN+'//Págs: '+lib.numeroPaginas+"</li>";
    }
  });

  document.getElementById("libro").innerHTML = encontrados;
}
document.getElementById("buscar").onclick = buscarLibro;

// VER TODOS
function verTodos() {
  var verLibros = libros.map(function (libro) {
    return "<li>" + '"' + libro.titulo + '" - ' + libro.autor + "</li>";
  });

  document.getElementById("libros").innerHTML = verLibros;
}
document.getElementById("verTodos").onclick = verTodos;
