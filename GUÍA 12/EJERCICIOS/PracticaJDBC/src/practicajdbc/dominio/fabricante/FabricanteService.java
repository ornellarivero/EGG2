package practicajdbc.dominio.fabricante;

import practicajdbc.persistencia.FabricanteDao;

public class FabricanteService {

    private FabricanteDao dao;

    public FabricanteService() {
        this.dao = new FabricanteDao();
    }

    public void crearFabricante(String nombre) throws Exception {
        try {
            if (nombre == null) {
                throw new Exception("Debe ingresar un nombre para Fabricante");
            }
            Fabricante f = new Fabricante();
            f.setNombre(nombre);
            dao.guardarFabricante(f);

        } catch (Exception e) {
            throw e;
        }

    }

}
