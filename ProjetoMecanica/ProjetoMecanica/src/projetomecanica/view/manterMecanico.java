/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetomecanica.view;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import static projetomecanica.ProjetoMecanica.main;
import projetomecanica.bean.Mecanico;
import projetomecanica.controller.ControllerMecanico;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class manterMecanico {
    
    public static void menu() throws SQLException, ClassNotFoundException{
        String msg = "O que deseja fazer?\n"
                    + "1 - Cadastrar mecânico\n"
                    + "2 - Atualizar mecânico\n"
                    + "3 - Excluir mecânico\n"
                    + "4 - Procurar mecânico\n"
                    + "5 - Listar mecânicos";
        int opc = Integer.parseInt(JOptionPane.showInputDialog(msg));
        
        switch (opc){
            case 1:
                inserir();
                break;
            case 2:
                atualizar();
                break;
            case 3:
                excluir();
                break;
            case 4:
                buscar();
                break;
            case 5:
                listar();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                main(null);
                break;
        }
                
        
    }

    private static void inserir() throws SQLException, ClassNotFoundException {
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String cpf = JOptionPane.showInputDialog("Digite o cpf: ");
        String ctt = JOptionPane.showInputDialog("Digite o contato: ");
        Mecanico mecEnt = new Mecanico(nome, cpf, ctt);
        ControllerMecanico contMec = new ControllerMecanico();
        Mecanico mecSaida = contMec.inserir(mecEnt);
        JOptionPane.showMessageDialog(null,mecSaida.toString());        
    }

    private static void atualizar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id: "));
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String cpf = JOptionPane.showInputDialog("Digite o cpf: ");
        String ctt = JOptionPane.showInputDialog("Digite o contato: ");
        Mecanico mecEnt = new Mecanico(id, nome, cpf, ctt);
        ControllerMecanico contMec = new ControllerMecanico();
        Mecanico mecSaida = contMec.alterar(mecEnt);
        JOptionPane.showMessageDialog(null,mecSaida.toString());
    }

    private static void excluir() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id: "));
        Mecanico mecEnt = new Mecanico(id);
        ControllerMecanico contMec = new ControllerMecanico();
        Mecanico mecSaida = contMec.excluir(mecEnt);
        JOptionPane.showMessageDialog(null,mecSaida.toString());
    }

    private static void buscar() throws SQLException, ClassNotFoundException {
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        Mecanico mecEnt = new Mecanico(nome);
        ControllerMecanico contMec = new ControllerMecanico();
        Mecanico mecSaida = contMec.buscar(mecEnt);
        JOptionPane.showMessageDialog(null,mecSaida.toString());
    }

    private static void listar() throws SQLException, ClassNotFoundException {
        Mecanico mecEnt = new Mecanico();
        ControllerMecanico contPes = new ControllerMecanico();
        List<Mecanico> listaMec = contPes.listar(mecEnt);
        listaMec.forEach(mecSaida -> {
            JOptionPane.showMessageDialog(null,mecSaida.toString());
        });
    }
    
}
