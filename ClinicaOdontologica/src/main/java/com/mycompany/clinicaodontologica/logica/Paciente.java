package com.mycompany.clinicaodontologica.logica;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona{
    //private int id;
    private boolean tieneOS;
    private String obraSocial;
    private String tipoSangre;
    @OneToOne
    private Responsable responsable;
    @OneToMany(mappedBy = "paciente")
    private List<Turno> listaTurnos;

    public Paciente() {
    }

    public Paciente(boolean tieneOS, String obraSocial, String tipoSangre, Responsable responsable, List<Turno> listaTurnos, int id, String dni, String nombre, String apellido, Date fechaNacimiento, String telefono, String direccion) {
        super(id, dni, nombre, apellido, fechaNacimiento, telefono, direccion);
        this.tieneOS = tieneOS;
        this.obraSocial = obraSocial;
        this.tipoSangre = tipoSangre;
        this.responsable = responsable;
        this.listaTurnos = listaTurnos;
    }

    public boolean isTieneOS() {
        return tieneOS;
    }

    public void setTieneOS(boolean tieneOS) {
        this.tieneOS = tieneOS;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
 
}
