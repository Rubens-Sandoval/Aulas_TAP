package mvcExample;

import javax.swing.JOptionPane;

import mvcExample.model.bean.Funcionario;


/**
 *
 * @author FATEC ZONA LESTE
 */
public class MvcExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f = new Funcionario(1,"Bit","Prof",1000.00);
        JOptionPane.showMessageDialog(null, f.toString());
        f.setNome("Lorena");
        f.setCargo("Segurança");
        f.setCargo("Adm");
        JOptionPane.showMessageDialog(null, f.toString());
        JOptionPane.showMessageDialog(null, f.getNome());
        f.calculaSalario();
        JOptionPane.showMessageDialog(null, f.getSalario());
        
    }
    
}