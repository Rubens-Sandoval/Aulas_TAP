/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.controller;

import exemplointerface.bean.Aluno;
import exemplointerface.dao.DaoAluno;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ControllerAluno {
    DaoAluno daoAl;

    public Aluno inserir(Aluno al) {
        daoAl = new DaoAluno();
        Aluno alSaida = daoAl.inserir(al);
        return alSaida;
    }

    public Aluno alterar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Aluno excluir(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Aluno buscar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Aluno listar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
