/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetomecanica.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import projetomecanica.bean.Cliente;
import projetomecanica.bean.Conserto;
import projetomecanica.bean.Mecanico;
import projetomecanica.bean.Veiculo;
import projetomecanica.dao.DaoConserto;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ControllerConserto {
    DaoConserto DaoCon;
    ControllerCliente conC;
    ControllerMecanico conM;
    ControllerVeiculo conV;
    
    public Conserto inserir(Conserto conEnt) throws SQLException, ClassNotFoundException {
        DaoCon = new DaoConserto();
        Conserto conSaida = DaoCon.inserir(conEnt);
        return conSaida;
    }
    
    public Conserto alterar(Conserto conEnt) throws SQLException, ClassNotFoundException {
        DaoCon = new DaoConserto();
        Conserto conSaida = DaoCon.alterar(conEnt);
        return conSaida;
    }
    
    public Conserto excluir(Conserto conEnt) throws SQLException, ClassNotFoundException {
        DaoCon = new DaoConserto();
        Conserto conSaida = DaoCon.excluir(conEnt);
        return conSaida;
    }
    
    public Conserto buscar(Conserto conEnt) throws SQLException, ClassNotFoundException {
        DaoCon = new DaoConserto();
        Conserto conSaida = DaoCon.buscar(conEnt);
        Cliente c = new Cliente(conSaida.getId_cliente());
        Mecanico m = new Mecanico(conSaida.getId_mecanico());
        Veiculo v = new Veiculo(conSaida.getId_veiculo());
        conC = new ControllerCliente();
        conM = new ControllerMecanico();
        conV = new ControllerVeiculo();
        conSaida.setCli(conC.buscar(c));
        conSaida.setMec(conM.buscar(m));
        conSaida.setV(conV.buscar(v));
        return conSaida;
    }
    
    public List<Conserto> listar(Conserto conEnt) throws SQLException, ClassNotFoundException {
        DaoCon = new DaoConserto();
        List<Conserto> listaConsertoAux = DaoCon.listar(conEnt);
        List<Conserto> listaConserto = new ArrayList<>();

        for (Conserto conSaida : listaConsertoAux) {
            listaConserto.add(buscar(conSaida));
        }
        return listaConserto;
    }
}
