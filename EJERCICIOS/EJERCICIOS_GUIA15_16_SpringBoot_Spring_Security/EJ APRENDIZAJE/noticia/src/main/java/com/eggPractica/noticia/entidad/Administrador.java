package com.eggPractica.noticia.entidad;

import com.eggPractica.noticia.enumeraciones.Rol;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Administrador extends Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Administrador(String nombreUsuario, String password, Rol rol) {
        super(nombreUsuario, password, rol);
    }

}
