/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.examen.java.campus.modelo;

import java.util.Date;

/**
 *
 * @author camper
 */

public class Asignacion {
   
    private int empleado;
    private int proyecto;
    private int horasTrabajadas;
    private Date fechaAsignacion;
    
 
    public Asignacion(int empleado, int proyecto, int horasTrabajadas, Date fechaAsignacion) {
        this.empleado = empleado;
        this.proyecto = proyecto;
        this.horasTrabajadas = horasTrabajadas;
        this.fechaAsignacion = fechaAsignacion;
    }

    public Asignacion() {
    }

    public int getEmpleado() {
        return empleado;
    }

    public void setEmpleado(int empleado) {
        this.empleado = empleado;
    }

    public int getProyecto() {
        return proyecto;
    }

    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    @Override
    public String toString() {
        return "Asignacion{" + "empleado=" + empleado + ", proyecto=" + proyecto + ", horasTrabajadas=" + horasTrabajadas + ", fechaAsignacion=" + fechaAsignacion + '}';
    }
    
    
    
    
    
}

