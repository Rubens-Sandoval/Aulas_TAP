/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.view;

import exemplointerface.bean.PessoaJuridica;
import exemplointerface.controller.ControllerPessoaJuridica;
import exemplointerface.interfaces.CrudView;
import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ManterPessoaJuridica implements CrudView{
   

    @Override
    public void inserir() {
        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa juridica: ");
        String cnpj = JOptionPane.showInputDialog("Digite o cnpj da pessoa juridica: ");
        
        PessoaJuridica pj = new PessoaJuridica(nome, cnpj);
        ControllerPessoaJuridica contPj = new ControllerPessoaJuridica();
        PessoaJuridica pfSaida = contPj.inserir(pj);
        
        System.out.println(pfSaida);   
    }

    @Override
    public void menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void alterar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
