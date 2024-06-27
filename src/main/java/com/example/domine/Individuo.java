package com.example.domine;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="individuo")
public class Individuo implements Serializable {
    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_individuo;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String edad;

}
