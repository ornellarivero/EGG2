package com.eggPractica.noticia.entidad;

import com.eggPractica.noticia.enumeraciones.Rol;
import java.util.ArrayList;
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
public class Periodista extends Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private ArrayList<Noticia> misNoticias;
    private Integer sueldoMensual;
    
    public Periodista(ArrayList<Noticia> misNoticias, Integer sueldoMensual, Long id, String nombreUsuario, String password, Rol rol) {
        super(nombreUsuario, password, rol);
        this.misNoticias = misNoticias;
        this.sueldoMensual = sueldoMensual;
    }

}
