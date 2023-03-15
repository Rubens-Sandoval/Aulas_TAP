/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.view;

import exemplointerface.bean.Aluno;
import exemplointerface.controller.ControllerAluno;
import exemplointerface.interfaces.CrudView;
import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ManterAluno implements CrudView{


    @Override
    public void inserir() {
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        String ra = JOptionPane.showInputDialog("Digite o ra do aluno: ");
        
        Aluno al = new Aluno(nome, ra);
        ControllerAluno contAl = new ControllerAluno();
        Aluno alSaida = (Aluno) contAl.inserir(al);
        
        System.out.println(alSaida);
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
