/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetomecanica.view;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import static projetomecanica.ProjetoMecanica.main;
import projetomecanica.bean.Cliente;
import projetomecanica.controller.ControllerCliente;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class manterCliente {
    public static void menu() throws SQLException, ClassNotFoundException{
        String msg = "O que deseja fazer?\n"
                    + "1 - Cadastrar cliente\n"
                    + "2 - Atualizar cliente\n"
                    + "3 - Excluir cliente\n"
                    + "4 - Procurar cliente\n"
                    + "5 - Listar clientes";
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
        Cliente cliEnt = new Cliente(nome, cpf, ctt);
        ControllerCliente contCli = new ControllerCliente();
        Cliente cliSaida = contCli.inserir(cliEnt);
        JOptionPane.showMessageDialog(null,cliSaida.toString());        
    }

    private static void atualizar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id: "));
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String cpf = JOptionPane.showInputDialog("Digite o cpf: ");
        String ctt = JOptionPane.showInputDialog("Digite o contato: ");
        Cliente cliEnt = new Cliente(id, nome, cpf, ctt);
        ControllerCliente contCli = new ControllerCliente();
        Cliente cliSaida = contCli.alterar(cliEnt);
        JOptionPane.showMessageDialog(null,cliSaida.toString());
    }

    private static void excluir() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id: "));
        Cliente cliEnt = new Cliente(id);
        ControllerCliente contCli = new ControllerCliente();
        Cliente cliSaida = contCli.excluir(cliEnt);
        JOptionPane.showMessageDialog(null,cliSaida.toString());
    }

    private static void buscar() throws SQLException, ClassNotFoundException {
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        Cliente cliEnt = new Cliente(nome);
        ControllerCliente contCli = new ControllerCliente();
        Cliente cliSaida = contCli.buscar(cliEnt);
        JOptionPane.showMessageDialog(null,cliSaida.toString());
    }

    private static void listar() throws SQLException, ClassNotFoundException {
        Cliente cliEnt = new Cliente();
        ControllerCliente contCli = new ControllerCliente();
        List<Cliente> listaCli = contCli.listar(cliEnt);
        listaCli.forEach(cliSaida -> {
            JOptionPane.showMessageDialog(null,cliSaida.toString());
        });
    }
}
