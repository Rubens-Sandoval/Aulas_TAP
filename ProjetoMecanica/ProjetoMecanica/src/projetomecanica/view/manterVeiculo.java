/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetomecanica.view;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import static projetomecanica.ProjetoMecanica.main;
import projetomecanica.bean.Veiculo;
import projetomecanica.controller.ControllerVeiculo;


/**
 *
 * @author FATEC ZONA LESTE
 */
public class manterVeiculo {
    public static void menu() throws SQLException, ClassNotFoundException{
        String msg = "O que deseja fazer?\n"
                    + "1 - Cadastrar veiculo\n"
                    + "2 - Atualizar veiculo\n"
                    + "3 - Excluir veiculo\n"
                    + "4 - Procurar veiculo\n"
                    + "5 - Listar veiculos";
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
        int id_cliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente: "));
        String modelo = JOptionPane.showInputDialog("Digite o modelo: ");
        String placa = JOptionPane.showInputDialog("Digite o placa: ");
        String defeito = JOptionPane.showInputDialog("Digite o defeito: ");
        Veiculo vEnt = new Veiculo(id_cliente, modelo, placa, defeito);
        ControllerVeiculo contV = new ControllerVeiculo();
        Veiculo cliSaida = contV.inserir(vEnt);
        JOptionPane.showMessageDialog(null,cliSaida.toString());        
    }

    private static void atualizar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id: "));
        int id_cliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente: "));
        String modelo = JOptionPane.showInputDialog("Digite o modelo: ");
        String placa = JOptionPane.showInputDialog("Digite o placa: ");
        String defeito = JOptionPane.showInputDialog("Digite o defeito: ");
        Veiculo vEnt = new Veiculo(id, id_cliente, modelo, placa, defeito);
        ControllerVeiculo contV = new ControllerVeiculo();
        Veiculo cliSaida = contV.inserir(vEnt);
        JOptionPane.showMessageDialog(null,cliSaida.toString()); 
    }

    private static void excluir() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id: "));
        Veiculo vEnt = new Veiculo(id);
        ControllerVeiculo contV = new ControllerVeiculo();
        Veiculo cliSaida = contV.inserir(vEnt);
        JOptionPane.showMessageDialog(null,cliSaida.toString());
    }

    private static void buscar() throws SQLException, ClassNotFoundException {
        String placa = JOptionPane.showInputDialog("Digite o nome: ");
        Veiculo vEnt = new Veiculo(placa);
        ControllerVeiculo contV = new ControllerVeiculo();
        Veiculo cliSaida = contV.inserir(vEnt);
        JOptionPane.showMessageDialog(null,cliSaida.toString());
    }

    private static void listar() throws SQLException, ClassNotFoundException {
        Veiculo vEnt = new Veiculo();
        ControllerVeiculo contV = new ControllerVeiculo();
        List<Veiculo> listaV = contV.listar(vEnt);
        listaV.forEach(vSaida -> {
            JOptionPane.showMessageDialog(null,vSaida.toString());
        });
    }
}
