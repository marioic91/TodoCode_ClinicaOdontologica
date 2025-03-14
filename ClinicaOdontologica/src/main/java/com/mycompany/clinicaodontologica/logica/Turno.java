package com.mycompany.clinicaodontologica.logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Turno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Enum tipoAtencion;
    @Temporal(TemporalType.DATE)
    private LocalDate fecha;
    @Temporal(TemporalType.TIME)
    private LocalTime hora;
    @ManyToOne
    @JoinColumn(name = "idTurno")
    private Odontologo odontologo;
    @ManyToOne
    @JoinColumn(name = "idTurno2")
    private Paciente paciente;

    public Turno() {
    }

    public Turno(int id, Enum tipoAtencion, LocalDate fecha, LocalTime hora, Odontologo odontologo, Paciente paciente) {
        this.id = id;
        this.tipoAtencion = tipoAtencion;
        this.fecha = fecha;
        this.hora = hora;
        this.odontologo = odontologo;
        this.paciente = paciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Enum getTipoAtencion() {
        return tipoAtencion;
    }

    public void setTipoAtencion(Enum tipoAtencion) {
        this.tipoAtencion = tipoAtencion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
