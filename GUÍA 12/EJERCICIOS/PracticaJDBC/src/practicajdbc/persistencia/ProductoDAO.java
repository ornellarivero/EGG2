package practicajdbc.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import practicajdbc.dominio.producto.Producto;

public final class ProductoDAO extends DAO {
    
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    /*<<<CRUD>>>*/
    
    //CREAR
    //f) Ingresar un producto a la base de datos.
    public void guardarProducto(Producto prod) throws Exception {
        try {
            if (prod == null) {
                throw new Exception("Debe indicar un Producto");
            }

            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante)"
                    + "VALUES ( '" + prod.getNombre() + "' , " + prod.getPrecio() + " , " + prod.getCodigo_fabricante() + " );";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    //MOSTRAR
    public void mostrarProductos() throws Exception {
        try {

            String sql = "SELECT * FROM producto;";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    //MODIFICAR
    //h) Editar un producto con datos a elección.
    public void modificarProducto(int codigo) throws Exception {
        try {
            if (codigo == 0) {
                throw new Exception("Debe indicar un código para modificar producto");
            }
            System.out.print("Nuevo nombre: ");
            String nombre=leer.next();
            
            System.out.print("Nuevo precio: ");
            double precio=leer.nextDouble();
            
            String sql = "UPDATE producto SET nombre='" + nombre + "', precio=" + precio
                    + "WHERE codigo=" + codigo + ";";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    //ELIMINAR
    public void eliminarProducto(int codigo) throws Exception {
        try {

            String sql = "DELETE FROM producto WHERE codigo=" + codigo + ";";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    /*<<<CONSULTAS>>>*/
    //Consultas extra.
    public Producto buscarProductoPorCodigo(int codigo) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo=" + codigo + ";";
            consultarBase(sql);

            Producto p = null;

            while (resultado.next()) {
                p = new Producto();
                //Le seteo a mi objeto los resultados q se encuentran en mi BD.
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                p.setCodigo_fabricante(resultado.getInt(4));
            }

            desconectarBase();
            return p;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    //a) Lista el nombre de todos los productos que hay en la tabla producto. 
    public Collection<Producto> listaNombreProductos() throws Exception {
        try {
            String sql = "SELECT codigo, nombre FROM producto;";
            consultarBase(sql);

            Producto p = null;

            Collection<Producto> productos = new ArrayList<>();
            //La posición de cada seteo depende de las columnas que pida en el SELECT.
            while (resultado.next()) {
                p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                productos.add(p);
            }

            desconectarBase();
            return productos;

        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("ERROR DE SISTEMA");

        }

    }

    //b) Lista los nombres y los precios de todos los productos de la tabla producto.
    public Collection<Producto> listaNombrePrecioProductos() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto;";
            consultarBase(sql);

            Producto p = null;

            Collection<Producto> productos = new ArrayList<>();
            while (resultado.next()) {
                p = new Producto();
                p.setNombre(resultado.getString(1));
                p.setPrecio(resultado.getDouble(2));
                productos.add(p);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    //c) Listar aquellos productos que su precio esté entre 120 y 202.
    public Collection<Producto> precioProductosEntre120y202() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto WHERE precio BETWEEN 120 AND 202;";
            consultarBase(sql);

            Producto p = null;
            Collection<Producto> productos = new ArrayList<>();

            while (resultado.next()) {
                p = new Producto();
                p.setNombre(resultado.getString(1));
                p.setPrecio(resultado.getDouble(2));
                productos.add(p);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    //d) Buscar y listar todos los Portátiles de la tabla producto. 
    public Collection<Producto> portatilesProductos(String contienePalabra) throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto "
                    + "WHERE nombre LIKE '%" + contienePalabra + "%';";
            consultarBase(sql);

            Producto p = null;
            Collection<Producto> productos = new ArrayList<>();

            while (resultado.next()) {
                p = new Producto();
                p.setNombre(resultado.getString(1));
                p.setPrecio(resultado.getDouble(2));
                productos.add(p);
            }
            desconectarBase();
            return productos;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    //e) Listar el nombre y el precio del producto más barato. 
    public Collection<Producto> productoMasBarato() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1;";
            consultarBase(sql);

            Producto p = null;
            Collection<Producto> productos = new ArrayList<>();

            while (resultado.next()) {
                p = new Producto();
                p.setNombre(resultado.getString(1));
                p.setPrecio(resultado.getDouble(2));
                productos.add(p);
            }

            desconectarBase();
            return productos;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}
