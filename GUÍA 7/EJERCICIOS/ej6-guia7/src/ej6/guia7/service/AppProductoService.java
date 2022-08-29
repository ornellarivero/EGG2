/*Iintroducir un elemento, modificar su precio, 
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas.*/
package ej6.guia7.service;

import ej6.guia7.entidad.AppProducto;
import java.util.HashMap;
import java.util.Scanner;

public class AppProductoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    AppProducto app = new AppProducto();

    public HashMap<String, Integer> agregarProducto(AppProducto app) {
        String sn;
        System.out.println("\n*** AGREGAR PRODUCTO ***");
        do {
            System.out.print("Producto: ");
            String prod = leer.next();
            System.out.print("Precio: ");
            int precio = leer.nextInt();
            app.setProducto(prod, precio);

            System.out.print("\nDESEA AGREGAR OTRO PRODUCTO? S/N >>> ");
            sn = leer.next();
        } while (sn.equalsIgnoreCase("si") || sn.equalsIgnoreCase("s"));
        return app.getListaProductos();
    }

    public void modificarPrecio(AppProducto app) {
        System.out.println("\n*** MODIFCAR PRECIO DE PRODUCTO ***");
        String sn;
        System.out.println("\nLISTA ACTUAL:");
        System.out.println(app.getListaProductos().toString());

        do {
            System.out.print("\nEscriba producto a modificar: ");
            String prod = leer.next();
            if (app.getListaProductos().containsKey(prod)) {
                System.out.print("\nEscriba precio del producto sin el signo pesos: ");
                app.getListaProductos().put(prod, leer.nextInt());
                System.out.println("\nEl precio del producto '" + prod.toUpperCase() + "' se actualizó.");
                System.out.println("\nLISTA ACTUAL: ");
                System.out.println(app.getListaProductos().toString());
//                return app.getListaProductos();
            } else {
                System.out.print("\nEl producto '"+prod.toUpperCase()+ "' no se encuentra, desea agregarlo a la lista? S/N >>> ");
                sn = leer.next();
                if (sn.equalsIgnoreCase("si") || sn.equalsIgnoreCase("s")) {
                    agregarProducto(app);
                }
            }
            System.out.print("\nQuiere actualizar precio de otro producto? S/N >>> ");
            sn = leer.next();
        } while (sn.equalsIgnoreCase("si") || sn.equalsIgnoreCase("s"));
//        return app.getListaProductos();
    }

    public void eliminarProducto(AppProducto app) {
        System.out.println("\n*** ELIMINAR UN PRODUCTO ***");
        String sn;
        do {
            System.out.print("Producto: ");
            String producto = leer.next();
            if (app.getListaProductos().containsKey(producto)) {
                app.getListaProductos().remove(producto);
                System.out.println("El producto '" + producto.toUpperCase() + "' fue eliminado.");
            } else {
                System.out.println("//El producto '" + producto.toUpperCase() + "' no exite//");
            }
            System.out.print("\nQuiere eliminar otro producto? S/N >>> ");
            sn = leer.next();
        } while (sn.equalsIgnoreCase("si") || sn.equalsIgnoreCase("s"));
        System.out.println(app.getListaProductos().toString());
    }

    public void verLista(AppProducto app) {
        System.out.println("\n*** LISTA ACTUAL ***");
        System.out.println(app.getListaProductos());
    }

    public void menu(AppProducto app) {
        System.out.println("*** BIENVENIDO A LA APP DE PRODUCTOS ***");
        System.out.println("\nMenú...");
        String sn;
        do {
            System.out.print("A- 'AGREGAR PRODUCTO'\nB- 'MODIFICAR PRECIO'\nC- 'ELIMINAR PRODUCTO'\nD- 'VER LISTA'\nOpción: ");
            String opcion = leer.next().toLowerCase();
            switch (opcion) {
                case "a":
                    agregarProducto(app);
                    break;
                case "b":
                    modificarPrecio(app);
                    break;
                case "c":
                    eliminarProducto(app);
                    break;
                case "d":
                    verLista(app);
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
            System.out.print("\nSalir? S/N >>> ");
            sn = leer.next();
        } while (sn.equalsIgnoreCase("no") || sn.equalsIgnoreCase("n"));
        System.out.println("\nLISTA ACTUAL:" + app.getListaProductos().toString());
    }

}
