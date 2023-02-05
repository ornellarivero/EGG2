package practicajdbc.persistencia;

import practicajdbc.dominio.fabricante.Fabricante;

public final class FabricanteDao extends DAO {

    /*<<<CRUD>>>*/
    
    //CREAR
    //g) Ingresar un fabricante a la base de datos
    public void guardarFabricante(Fabricante f) throws Exception {
        try {
            if (f == null) {
                throw new Exception("Debe indicar un Fabricante");
            }

            String sql = "INSERT INTO fabricante (nombre) VALUES('" + f.getNombre() + "');";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    //MOSTRAR
    public void mostrarFabricantes() throws Exception {
        try {
            String sql = "SELECT * FROM fabricante;";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    //MODIFICAR
    public void modificarFabricante(Fabricante f) throws Exception {
        try {
            if (f == null) {
                throw new Exception("Debe indicar un Fabricante para modificar");
            }

            String sql = "UPDATE fabricante SET nombre='" + f.getNombre() + "' WHERE codigo=" + f.getCodigo() + ";";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    //ELIMINAR
    public void eliminarFabricante(int codigo) throws Exception {
        try {
            if (codigo == 0) {
                throw new Exception("Debe indicar un código para eliminar Fabricante.");
            }
            String sql = "DELETE FROM fabricante WHERE codigo=" + codigo + ";";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    /*<<<CONSULTAS>>>*/
}
