/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen.examen.java.campus.modeloDAO;

import com.examen.examen.java.campus.modelo.Cliente;
import com.examen.examen.java.campus.util.DatabaseConnection;
import com.examen.examen.java.campus.modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camper
 */
public class ClienteDao {
    

    // Consultas SQL como constantes para fácil mantenimiento
    private static final String CONSULTA_TODOS = "SELECT * FROM cliente";
    private static final String INSERTAR = "INSERT INTO cliente(nombre, representante, correo, direccion, sector) VALUES(?,?,?,?,?)";
    private static final String ACTUALIZAR = "UPDATE cliente SET nombre=?, representante=?, correo=?, direccion=?, sector=? WHERE id=?";

   
    public List<Cliente> encontrarTodos() throws SQLException {
        List<Cliente> clientes = new ArrayList<>();

        try (Connection conexion = DatabaseConnection.getConnection();
             Statement declaracion = conexion.createStatement();
             ResultSet resultado = declaracion.executeQuery(CONSULTA_TODOS)) {

            while (resultado.next()) {
                clientes.add(crearCliente(resultado));
            }
        }

        return clientes;
    }

    public void guardar(Cliente cliente) throws SQLException {
        if (cliente.getId() > 0) {
            actualizarCliente(cliente);
        } else {
            insertarCliente(cliente);
        }
    }


    private void insertarCliente(Cliente cliente) throws SQLException {
        try (Connection conexion = DatabaseConnection.getConnection();
             PreparedStatement declaracion = conexion.prepareStatement(INSERTAR, Statement.RETURN_GENERATED_KEYS)) {

            establecerParametrosCliente(declaracion, cliente);
            declaracion.executeUpdate();

            // Obtener el ID generado
            try (ResultSet clavesGeneradas = declaracion.getGeneratedKeys()) {
                if (clavesGeneradas.next()) {
                    cliente.setId(clavesGeneradas.getInt(1));
                }
            }
        }
    }

      
    private Cliente crearCliente(ResultSet resultado) throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setId(resultado.getInt("id"));
        cliente.setNombre(resultado.getString("nombre"));
        cliente.setRepresentante(resultado.getString("representante"));
        cliente.setCorreo(resultado.getString("correo"));
        cliente.setTelefono(resultado.getString("telefono"));
        cliente.setDireccion(resultado.getString("direccion"));
        cliente.setSector(resultado.getString("sector"));
   
        return cliente;
    }

   
    private void establecerParametrosCliente(PreparedStatement declaracion, Cliente cliente)
            throws SQLException {
      
        declaracion.setString(1, cliente.getNombre());
        declaracion.setString(2, cliente.getRepresentante());
        declaracion.setString(3, cliente.getCorreo());
        declaracion.setString(4, cliente.getTelefono());
        declaracion.setString(5, cliente.getDireccion());
        declaracion.setString(6, cliente.getSector());
    }

     private void actualizarCliente(Cliente cliente) throws SQLException {
        try (Connection conexion = DatabaseConnection.getConnection();
             PreparedStatement declaracion = conexion.prepareStatement(ACTUALIZAR)) {

            establecerParametrosCliente(declaracion, cliente);
            declaracion.setInt(6, cliente.getId());
            declaracion.executeUpdate();
        }
    }
}
    

