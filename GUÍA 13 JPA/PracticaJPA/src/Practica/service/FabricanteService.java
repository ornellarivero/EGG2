package Practica.service;

import Practica.Fabricante;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FabricanteService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Fabricante crearFabricante() {
        try {
            //DEFINIR EN CADA MÉTODO
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PracticaPU");
            EntityManager em = emf.createEntityManager();

            Fabricante fabricante1 = new Fabricante();
            //Garantiza q el ID sea único
            fabricante1.setId(UUID.randomUUID().toString());

            System.out.print("-Códgo Fabricante: ");
            fabricante1.setCodigo(leer.nextInt());

            System.out.print("-Nombre Fabricante: ");
            fabricante1.setNombre(leer.next());

            //Iniciar Transacción ya sea para eliminar, modificar, etc un objeto.
            em.getTransaction().begin();
            //Para guardar el objeto Fabricante
            em.persist(fabricante1);
            //Se confirma esa persistencia (cambios)
            em.getTransaction().commit();
            return fabricante1;

        } catch (Exception e) {
            throw e;
        }
    }

    //CONSULTAS
    public List mostrarFabricantePorCodigo() {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PracticaPU");
            EntityManager em = emf.createEntityManager();

            System.out.print("\nBUSCAR FABRICANTE POR CÓDIGO...\n-Ingrese código: ");
            int codigo = leer.nextInt();

            List<Fabricante> f = em.createQuery("SELECT f FROM Fabricante f WHERE f.codigo = :codigo").setParameter("codigo", codigo).getResultList();
            System.out.println(f);
            return f;
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Fabricante> mostrarTodosLosFabricantes() {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PracticaPU");
            EntityManager em = emf.createEntityManager();

            System.out.print("\nFABRICANTES...");

            List<Fabricante> f = em.createQuery("SELECT f FROM Fabricante f").getResultList();

            for (Fabricante fabricante : f) {
                System.out.println(fabricante + "\n----------------------");
            }
            return f;
        } catch (Exception e) {
            throw e;
        }
    }

    //MODIFICACIONES
    public void modificarFabricantePorId() throws Exception {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PracticaPU");
            EntityManager em = emf.createEntityManager();

            System.out.print("\nBUSCAR FABRICANTE POR ID...\n-Ingrese ID: ");
            String id = leer.next(); //Copiar id desde BD xq es un string largo. La próx. usar id Long.

            Fabricante f = em.find(Fabricante.class, id);
            System.out.println("\n-FABRICANTE A MODIFICAR: ");

            System.out.println(">> " + f.getNombre() + " <<");

            System.out.print("\n-Modificar nombre: ");
            f.setNombre(leer.next());

            System.out.println("\n-Fabricante Modificado");

            System.out.println(">> " + f.getNombre() + " <<");

            em.getTransaction().begin();
            em.merge(f);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarFabricantePorId() throws Exception {
        try {
             EntityManagerFactory emf = Persistence.createEntityManagerFactory("PracticaPU");
            EntityManager em = emf.createEntityManager();

            System.out.print("\nBUSCAR FABRICANTE POR ID...\n-Ingrese ID: ");
            String id = leer.next(); //Copiar id desde BD xq es un string largo. La próx. usar id Long.

            Fabricante f = em.find(Fabricante.class, id);
            System.out.println("\n-FABRICANTE A ELIMINAR: ");

            System.out.println(">> " + f.getNombre() + " <<");

            System.out.println("\n-Fabricante Modificado");
            
            em.getTransaction().begin();
            em.remove(f);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }

}
