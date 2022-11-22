package com.eggPractica.noticia.entidad;

import com.eggPractica.noticia.enumeraciones.Rol;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombreUsuario;
    private String password;
    
    @Enumerated(EnumType.STRING)
    private Rol rol;
    
    @OneToOne
    private FotoPerfil foto;

    public Usuario(String nombreUsuario, String password, Rol rol) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.rol = rol;
    }

}
