/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetomecanica.view;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import static projetomecanica.ProjetoMecanica.main;
import projetomecanica.bean.Conserto;
import projetomecanica.controller.ControllerConserto;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class manterConserto {
    public static void menu() throws SQLException, ClassNotFoundException{
        String msg = "O que deseja fazer?\n"
                    + "1 - Cadastrar conserto\n"
                    + "2 - Atualizar conserto\n"
                    + "3 - Excluir conserto\n"
                    + "4 - Procurar conserto\n"
                    + "5 - Listar consertos";
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
        int id_mecanico = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do mecanico: "));
        int id_veiculo = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do veiculo: "));
        String data_entrada = JOptionPane.showInputDialog("Digite a data de entrada do veiculo: ");
        String data_entrega = JOptionPane.showInputDialog("Digite a previsão de entrega do veiculo: ");
        Conserto conEnt = new Conserto(id_cliente, id_mecanico, id_veiculo, data_entrada, data_entrega);
        ControllerConserto contCon = new ControllerConserto();
        Conserto conSaida = contCon.inserir(conEnt);
        JOptionPane.showMessageDialog(null,conSaida.toString());        
    }

    private static void atualizar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id: "));
        int id_cliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente: "));
        int id_mecanico = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do mecanico: "));
        int id_veiculo = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do veiculo: "));
        String data_entrada = JOptionPane.showInputDialog("Digite a data de entrada do veiculo: ");
        String data_entrega = JOptionPane.showInputDialog("Digite a previsão de entrega do veiculo: ");
        Conserto conEnt = new Conserto(id, id_cliente, id_mecanico, id_veiculo, data_entrada, data_entrega);
        ControllerConserto contCon = new ControllerConserto();
        Conserto conSaida = contCon.alterar(conEnt);
        JOptionPane.showMessageDialog(null,conSaida.toString());
    }

    private static void excluir() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id: "));
        Conserto conEnt = new Conserto(id);
        ControllerConserto contCon = new ControllerConserto();
        Conserto conSaida = contCon.excluir(conEnt);
        JOptionPane.showMessageDialog(null,conSaida.toString());
    }

    private static void buscar() throws SQLException, ClassNotFoundException {
        int id_cliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do cliente: "));
        int id_veiculo = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do veiculo: "));
        Conserto conEnt = new Conserto(id_cliente, id_veiculo);
        ControllerConserto contCon = new ControllerConserto();
        Conserto conSaida = contCon.buscar(conEnt);
        JOptionPane.showMessageDialog(null,conSaida.toString());
    }

    private static void listar() throws SQLException, ClassNotFoundException {
        Conserto conEnt = new Conserto();
        ControllerConserto contV = new ControllerConserto();
        List<Conserto> listaCon = contV.listar(conEnt);
        listaCon.forEach(conSaida -> {
            JOptionPane.showMessageDialog(null,conSaida.toString());
        });
    }
}
