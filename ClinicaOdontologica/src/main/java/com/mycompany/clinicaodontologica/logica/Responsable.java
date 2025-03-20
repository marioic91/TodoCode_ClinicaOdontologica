package com.mycompany.clinicaodontologica.logica;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsable extends Persona{
    //private int id;
    private String parentesco;

    public Responsable() {
    }

    public Responsable(String parentesco) {
        this.parentesco = parentesco;
    }

    public Responsable(String parentesco, int id, String dni, String nombre, String apellido, Date fechaNacimiento, String telefono, String direccion) {
        super(id, dni, nombre, apellido, fechaNacimiento, telefono, direccion);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

}
