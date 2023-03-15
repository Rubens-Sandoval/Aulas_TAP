/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.controller;

import exemplointerface.bean.PessoaJuridica;
import exemplointerface.dao.DaoPessoaJuridica;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ControllerPessoaJuridica {
    
    DaoPessoaJuridica daoPj;

    public PessoaJuridica inserir(PessoaJuridica pj) {
        daoPj = new DaoPessoaJuridica();
        PessoaJuridica pjSaida = daoPj.inserir(pj);
        return pjSaida;
    }

    public PessoaJuridica alterar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PessoaJuridica excluir(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PessoaJuridica buscar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PessoaJuridica listar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
