/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetomecanica;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import projetomecanica.view.manterCliente;
import projetomecanica.view.manterConserto;
import projetomecanica.view.manterMecanico;
import projetomecanica.view.manterVeiculo;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ProjetoMecanica {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws SQLException, ClassNotFoundException {
        menu();        
    }

    public static void menu() throws SQLException, ClassNotFoundException {
        String msg = " 0 - Sair \n 1 - Mecânico \n 2 - Cliente \n 3 - Veiculo \n 4 - Conserto\n";
        int num = Integer.parseInt(JOptionPane.showInputDialog(msg));
        switch (num) {
            case 0:
                int sair = JOptionPane.showConfirmDialog(null,"Deseja Sair");
                if (sair > 0) menu();
                break;
            case 1:
                manterMecanico.menu();
                break;
            case 2:
                manterCliente.menu();
                break;
            case 3:
                manterVeiculo.menu();
                break;
            case 4:
                manterConserto.menu();
                break;
            default:
                System.out.println("Opção inválido");
        }
    }
    
}
