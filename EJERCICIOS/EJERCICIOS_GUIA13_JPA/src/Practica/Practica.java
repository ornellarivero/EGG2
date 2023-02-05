package Practica;

import Practica.service.FabricanteService;
import Practica.service.ProductoService;

public class Practica {

    public static void main(String[] args) throws Exception {

        ProductoService ps = new ProductoService();
        FabricanteService fs = new FabricanteService();

//        ps.crearProducto();
//        fs.mostrarFabricantePorCodigo();
//        fs.mostrarTodosLosFabricantes();
//        fs.modificarFabricantePorId();
        fs.eliminarFabricantePorId();
    }

}
