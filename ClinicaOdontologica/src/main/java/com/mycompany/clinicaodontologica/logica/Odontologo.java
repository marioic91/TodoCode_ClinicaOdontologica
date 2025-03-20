package com.mycompany.clinicaodontologica.logica;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Odontologo extends Persona{
    //private int id;
    private String matricula;
    private String especialidad;
    @OneToMany (mappedBy = "odontologo")
    private List<Turno> listaTurnos;
    @OneToOne
    private Usuario usuario;
    @OneToOne
    private Horario horario;

    public Odontologo() {
    }

    public Odontologo(String matricula, String especialidad, List<Turno> listaTurnos, Usuario usuario, Horario horario, int id, String dni, String nombre, String apellido, Date fechaNacimiento, String telefono, String direccion) {
        super(id, dni, nombre, apellido, fechaNacimiento, telefono, direccion);
        this.matricula = matricula;
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.usuario = usuario;
        this.horario = horario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

}
