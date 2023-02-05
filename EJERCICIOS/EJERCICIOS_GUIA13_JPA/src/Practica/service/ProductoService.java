package Practica.service;

import Practica.Fabricante;
import Practica.Producto;
import java.util.Scanner;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProductoService {

    FabricanteService fs = new FabricanteService();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Producto crearProducto() {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PracticaPU");
            EntityManager em = emf.createEntityManager();

            /*CREAR PRODUCTO*/
            Producto producto1 = new Producto();
            producto1.setId(UUID.randomUUID().toString());
            System.out.print("\n-Códgo Producto: ");
            producto1.setCodigo(leer.nextInt());

            System.out.print("-Nombre Producto: ");
            producto1.setNombre(leer.next());

            System.out.print("-Precio Producto: ");
            producto1.setPrecio(leer.nextDouble());

            System.out.print("\nDATOS FABRICANTE DEL PRODUCTO... ");
            producto1.setFabricante(fs.crearFabricante());

            em.getTransaction().begin();
            em.persist(producto1);
            em.getTransaction().commit();

            return producto1;

        } catch (Exception e) {
            throw e;
        }
    }
    
    
    
}
