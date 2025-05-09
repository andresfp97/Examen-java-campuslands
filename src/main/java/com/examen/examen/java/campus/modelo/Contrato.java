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

public class Contrato {
    
    private int id;
    private int cliente;
    private int servicio;
    private Date fechaInicio;
    private Date fechaFin;
    private double costoTotal;
    private String estado; 

    public Contrato() {
    }

    public Contrato(int id, int cliente, int servicio, Date fechaInicio, Date fechaFin, double costoTotal, String estado) {
        this.id = id;
        this.cliente = cliente;
        this.servicio = servicio;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoTotal = costoTotal;
        this.estado = estado;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getServicio() {
        return servicio;
    }

    public void setServicio(int servicio) {
        this.servicio = servicio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Contrato{" + "id=" + id + ", cliente=" + cliente + ", servicio=" + servicio + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", costoTotal=" + costoTotal + ", estado=" + estado + '}';
    }

    
    

   
}

