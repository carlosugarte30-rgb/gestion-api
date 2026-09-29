package com.charly.modelo;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Paciente extends PanacheEntity {
    public String nombre;
    public String apellido;
    public String dni;
    public int edad;
}
