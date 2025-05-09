/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.examen.java.campus.controller;

import com.examen.examen.java.campus.modelo.Cliente;
import com.examen.examen.java.campus.modeloDAO.ClienteDao;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author camper
 */
public class ClienteController {
    
    private final ClienteDao clienteDao;

    public ClienteController() {
        this.clienteDao = new ClienteDao();
    }


    public List<Cliente> obtenerTodosClientes() throws SQLException {
        return clienteDao.encontrarTodos();
    }


    


    public void guardarCliente(Cliente cliente) throws SQLException {
        clienteDao.guardar(cliente);
    }


    
    public Cliente crearCliente(String nombre, String representante, String correo, String telefono, String direccion, String sector) throws SQLException {
        Cliente cliente = new cliente(nombre, representante, correo, telefono, direccion, sector);
        clienteDao.guardar(cliente);
        return proyecto;
    }


    
}

   
