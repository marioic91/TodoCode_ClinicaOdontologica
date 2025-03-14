package com.mycompany.clinicaodontologica.logica;

import java.time.LocalDate;
import javax.persistence.Entity;

@Entity
public class Responsable extends Persona{
    //private int id;
    private Enum parentesco;

    public Responsable() {
    }

    public Responsable(Enum parentesco) {
        this.parentesco = parentesco;
    }

    public Responsable(Enum parentesco, int id, String dni, String nombre, String apellido, LocalDate fechaNacimiento, String telefono, String direccion) {
        super(id, dni, nombre, apellido, fechaNacimiento, telefono, direccion);
        this.parentesco = parentesco;
    }

    public Enum getParentesco() {
        return parentesco;
    }

    public void setParentesco(Enum parentesco) {
        this.parentesco = parentesco;
    }

}
