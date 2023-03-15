/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplointerface;

import exemplointerface.bean.Pessoa;
import exemplointerface.bean.PessoaFisica;
import exemplointerface.bean.Professor;
import exemplointerface.view.ManterAluno;
import exemplointerface.view.ManterPessoaFisica;
import exemplointerface.view.ManterPessoaJuridica;
import exemplointerface.view.ManterProfessor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Exemplointerface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        List<Object> listaObjt = new ArrayList<Object>();
       
        Pessoa p = new Pessoa(1, "Fulano");
        PessoaFisica pf = new PessoaFisica(2, "Beltrano", "13827");
        Professor prof = new Professor(3, "Ciclano", "12312", "213421");
        
        listaObjt.add(p);
        listaObjt.add(pf);
        listaObjt.add(prof);
        
        listaObjt.forEach(o -> {
            System.out.println(o);
        }); 
        */
        
        int op = Integer.parseInt(JOptionPane.showInputDialog("CADASTRO\n\n"
                + "Quem deseja cadastrar?\n\n"
                + " 1 - Pessoa Fisica\n"
                + " 2 - Pessoa juridica\n"
                + " 3 - Professor\n"
                + " 4 - Aluno\n"
                + " 5 - Sair\n"));
        
        switch (op){
            case 1:
                ManterPessoaFisica mpf = new ManterPessoaFisica();
                mpf.inserir();
                main(null);
                break;
               
            case 2:
                ManterPessoaJuridica mpj = new ManterPessoaJuridica();
                mpj.inserir();
                main(null);
                break;
                
            case 3:
                ManterProfessor mp = new ManterProfessor();
                mp.inserir();
                main(null);
                break;
                
            case 4:
                ManterAluno mal = new ManterAluno();
                mal.inserir();
                main(null);
                break;
                
            case 5:
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "Escolha uma opção válida!!!");
                main(null);
        }
    }
    
}
