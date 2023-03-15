/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.view;

import exemplointerface.bean.PessoaFisica;
import exemplointerface.controller.ControllerPessoaFisica;
import exemplointerface.interfaces.CrudView;
import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ManterPessoaFisica implements CrudView{


    @Override
    public void inserir() {
        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa fisica: ");
        String cpf = JOptionPane.showInputDialog("Digite o cpf da pessoa fisica: ");
        
        PessoaFisica pf = new PessoaFisica(nome, cpf);
        ControllerPessoaFisica contPf = new ControllerPessoaFisica();
        PessoaFisica pfSaida = (PessoaFisica) contPf.inserir(pf);
        
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
