package practicajdbc.dominio.producto;

import practicajdbc.persistencia.ProductoDAO;

public class ProductoService {

    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }

    //a) Lista el nombre de todos los productos que hay en la tabla producto.
    public void nombreProductos() throws Exception {
        try {
            System.out.println(dao.listaNombreProductos());
        } catch (Exception e) {
            throw e;
        }
    }

    //b) Lista los nombres y los precios de todos los productos de la tabla producto. 
    public void nombreYPrecioProductos() throws Exception {
        try {
            System.out.println(dao.listaNombrePrecioProductos());
        } catch (Exception e) {
            throw e;
        }
    }
    
    //c) Listar aquellos productos que su precio esté entre 120 y 202.
    public void productosEntre120y202() throws Exception {
        try {
            System.out.println(dao.precioProductosEntre120y202());
        } catch (Exception e) {
            throw e;
        }
    }
    
    //d) Buscar y listar todos los Portátiles de la tabla producto.
    public void productosPrtatiles(String contienePalabra) throws Exception {
        try {
            System.out.println(dao.portatilesProductos(contienePalabra));
        } catch (Exception e) {
            throw e;
        }
    }
    
    //e) Listar el nombre y el precio del producto más barato.
    public void productosMasBarato() throws Exception {
        try {
            System.out.println(dao.productoMasBarato());
        } catch (Exception e) {
            throw e;
        }
    }
    
    //f) Ingresar un producto a la base de datos.
    public void crearProducto(String nombre, double precio, int codigoFabricante) throws Exception {
        try {
            //Validar
            if (nombre == null) {
                throw new Exception("Debe indicar un nombre.");
            }

            if (precio == 0) {
                throw new Exception("Debe indicar un precio.");
            }

            if (codigoFabricante == 0) {
                throw new Exception("Debe indicar un código de fabricante.");
            }

            //Se crea el Producto
            Producto p = new Producto();
            p.setNombre(nombre);
            p.setPrecio(precio);
            p.setCodigo_fabricante(codigoFabricante);
            dao.guardarProducto(p);
        } catch (Exception e) {
            throw e;
        }
    }
    
    //h) Editar un producto con datos a elección
    public void editarProducto(int codigo) throws Exception {
        try {
            dao.modificarProducto(codigo);
        } catch (Exception e) {
            throw e;
        }
    }
    

}
