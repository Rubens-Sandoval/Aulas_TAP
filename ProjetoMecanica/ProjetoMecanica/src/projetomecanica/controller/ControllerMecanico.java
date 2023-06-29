/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetomecanica.controller;

import java.sql.SQLException;
import java.util.List;
import projetomecanica.bean.Mecanico;
import projetomecanica.dao.DaoMecanico;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ControllerMecanico {
    DaoMecanico daoMec;
    
    public Mecanico inserir(Mecanico mecEnt) throws SQLException, ClassNotFoundException {
        daoMec = new DaoMecanico();
        Mecanico mecSaida = daoMec.inserir(mecEnt);
        return mecSaida;
    }
    
    public Mecanico alterar(Mecanico mecEnt) throws SQLException, ClassNotFoundException {
        daoMec = new DaoMecanico();
        Mecanico mecSaida = daoMec.alterar(mecEnt);
        return mecSaida;
    }
    
    public Mecanico excluir(Mecanico mecEnt) throws SQLException, ClassNotFoundException {
        daoMec = new DaoMecanico();
        Mecanico mecSaida = daoMec.excluir(mecEnt);
        return mecSaida;
    }
    
    public Mecanico buscar(Mecanico mecEnt) throws SQLException, ClassNotFoundException {
        daoMec = new DaoMecanico();
        Mecanico mecSaida = daoMec.buscar(mecEnt);
        return mecSaida;
    }
    
    public List<Mecanico> listar(Mecanico mecEnt) throws SQLException, ClassNotFoundException {
        daoMec = new DaoMecanico();
        List<Mecanico> listaMecanico = daoMec.listar(mecEnt);
        return listaMecanico;
    }
}
