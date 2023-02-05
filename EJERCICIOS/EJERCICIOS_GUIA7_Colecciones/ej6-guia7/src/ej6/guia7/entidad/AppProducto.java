/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos 
productos que venderemos y el precio que tendrán. Además, se necesita que la 
aplicación cuente con las funciones básicas. 
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas.*/
package ej6.guia7.entidad;

import java.util.HashMap;

public class AppProducto {
private String producto;
private int precio;
private HashMap<String, Integer>listaProductos=new HashMap();

    public String getProducto() {
        return producto;
    }

    public void setProd(String producto) {
        this.producto = producto;
    }
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public HashMap<String, Integer> getListaProductos() {
        return listaProductos;
    }

    public void setProducto(String prod, int pre) {
        listaProductos.put(prod, pre);
    }

    @Override
    public String toString() {
        return "{" + listaProductos + '}';
    }

    public AppProducto(String producto, int precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public AppProducto() {
    }

}
