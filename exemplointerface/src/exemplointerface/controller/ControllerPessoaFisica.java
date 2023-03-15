/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.controller;

import exemplointerface.bean.PessoaFisica;
import exemplointerface.dao.DaoPessoaFisica;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ControllerPessoaFisica {
    
    DaoPessoaFisica daoPes;

    public PessoaFisica inserir(PessoaFisica pf) {
        daoPes = new DaoPessoaFisica();
        PessoaFisica pfSaida = daoPes.inserir(pf);
        return pfSaida;
    }

    public PessoaFisica alterar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PessoaFisica excluir(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PessoaFisica buscar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PessoaFisica listar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
