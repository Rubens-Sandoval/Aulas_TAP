/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.view;

import exemplointerface.bean.Professor;
import exemplointerface.controller.ControllerProfessor;
import exemplointerface.interfaces.CrudView;
import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ManterProfessor implements CrudView{


    @Override
    public void inserir() {
        String nome = JOptionPane.showInputDialog("Digite o nome do professor: ");
        String funcional = JOptionPane.showInputDialog("Digite a funcionaldo professor: ");
        
        Professor prof = new Professor(nome, funcional);
        ControllerProfessor contProf = new ControllerProfessor();
        Professor profSaida = contProf.inserir(prof);
        
        System.out.println(profSaida);   
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
