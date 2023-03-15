/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.controller;

import exemplointerface.bean.Professor;
import exemplointerface.dao.DaoProfessor;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ControllerProfessor {
    DaoProfessor daoProf;

    public Professor inserir(Professor prof) {
        daoProf = new DaoProfessor();
        Professor profSaida = daoProf.inserir(prof);
        return profSaida;
    }

    public Professor alterar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Professor excluir(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Professor buscar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Professor listar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
