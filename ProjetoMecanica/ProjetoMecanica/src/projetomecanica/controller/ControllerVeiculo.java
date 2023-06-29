/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetomecanica.controller;

import java.sql.SQLException;
import java.util.List;
import projetomecanica.bean.Veiculo;
import projetomecanica.dao.DaoVeiculo;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ControllerVeiculo {
    DaoVeiculo daoV;
    
    public Veiculo inserir(Veiculo vEnt) throws SQLException, ClassNotFoundException {
        daoV = new DaoVeiculo();
        Veiculo vSaida = daoV.inserir(vEnt);
        return vSaida;
    }
    
    public Veiculo alterar(Veiculo vEnt) throws SQLException, ClassNotFoundException {
        daoV = new DaoVeiculo();
        Veiculo vSaida = daoV.alterar(vEnt);
        return vSaida;
    }
    
    public Veiculo excluir(Veiculo vEnt) throws SQLException, ClassNotFoundException {
        daoV = new DaoVeiculo();
        Veiculo vSaida = daoV.excluir(vEnt);
        return vSaida;
    }
    
    public Veiculo buscar(Veiculo vEnt) throws SQLException, ClassNotFoundException {
        daoV = new DaoVeiculo();
        Veiculo vSaida = daoV.buscar(vEnt);
        return vSaida;
    }
    
    public List<Veiculo> listar(Veiculo vEnt) throws SQLException, ClassNotFoundException {
        daoV = new DaoVeiculo();
        List<Veiculo> listaVeiculo = daoV.listar(vEnt);
        return listaVeiculo;
    }
}
