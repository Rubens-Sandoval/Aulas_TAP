/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetomecanica.controller;

import java.sql.SQLException;
import java.util.List;
import projetomecanica.bean.Cliente;
import projetomecanica.dao.DaoCliente;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ControllerCliente {
    DaoCliente daoCli;
    
    public Cliente inserir(Cliente pesEnt) throws SQLException, ClassNotFoundException {
        daoCli = new DaoCliente();
        Cliente cliSaida = daoCli.inserir(pesEnt);
        return cliSaida;
    }
    
    public Cliente alterar(Cliente pesEnt) throws SQLException, ClassNotFoundException {
        daoCli = new DaoCliente();
        Cliente cliSaida = daoCli.alterar(pesEnt);
        return cliSaida;
    }
    
    public Cliente excluir(Cliente pesEnt) throws SQLException, ClassNotFoundException {
        daoCli = new DaoCliente();
        Cliente cliSaida = daoCli.excluir(pesEnt);
        return cliSaida;
    }
    
    public Cliente buscar(Cliente pesEnt) throws SQLException, ClassNotFoundException {
        daoCli = new DaoCliente();
        Cliente cliSaida = daoCli.buscar(pesEnt);
        return cliSaida;
    }
    
    public List<Cliente> listar(Cliente mecEnt) throws SQLException, ClassNotFoundException {
        daoCli = new DaoCliente();
        List<Cliente> listaCliente = daoCli.listar(mecEnt);
        return listaCliente;
    }
}
