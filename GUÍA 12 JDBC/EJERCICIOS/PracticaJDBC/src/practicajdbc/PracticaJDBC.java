package practicajdbc;

import practicajdbc.dominio.fabricante.FabricanteService;
import practicajdbc.dominio.producto.ProductoService;

public class PracticaJDBC {

    public static void main(String[] args) throws Exception {
        ProductoService ps = new ProductoService();
        FabricanteService fs = new FabricanteService();

        /*a) Lista el nombre de todos los productos que hay en la tabla producto.*/
//      ps.nombreProductos();

        /*b) Lista los nombres y los precios de todos los productos de la tabla producto.*/
//        ps.nombreYPrecioProductos();
        /*c) Listar aquellos productos que su precio esté entre 120 y 202.*/
//        ps.productosEntre120y202();

        /*d) Buscar y listar todos los Portátiles de la tabla producto.*/
//        ps.productosPrtatiles("portatil");

        /*e) Listar el nombre y el precio del producto más barato.*/
//        ps.productosMasBarato();

        /*f) Ingresar un producto a la base de datos*/
//        ps.crearProducto("NuevoProducto", 1234, 2);

        /*g) Ingresar un fabricante a la base de datos*/
//        fs.crearFabricante("POMELERO");

        /*h) Editar un producto con datos a elección*/
        ps.editarProducto(13);
    }
}
