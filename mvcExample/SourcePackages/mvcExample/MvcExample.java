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
        Funcionario f = new Funcionario(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID: ")),
        		JOptionPane.showInputDialog("Digite o nome: "),
        		JOptionPane.showInputDialog("Digite o cargo: "),
        		Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: ")));
        
        int op = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer?\n\n"
        		+ " 1 - Calcular e dar aumento ao funcionário\n"
        		+ " 2 - Exibir informações do funcionário"));
        
        switch (op) {

        case 1:
        	f.calculaSalario();
        	confirmarSaida();
        	break;
        	
        case 2:
        	JOptionPane.showMessageDialog(null, f.toString());
        	confirmarSaida();
        	break;
        	
        default:
        	JOptionPane.showMessageDialog(null, "Escolha uma opção válida!!!");
        	main(null);
        	break;
        }
        
        //JOptionPane.showMessageDialog(null, f.toString());
        //f.setNome("Lorena");
        //f.setCargo("Segurança");
        //f.setCargo("Adm");
        //JOptionPane.showMessageDialog(null, f.toString());
        //JOptionPane.showMessageDialog(null, f.getNome());
        //f.calculaSalario();
        //JOptionPane.showMessageDialog(null, f.getSalario());
        
    }
    
    public static void confirmarSaida() {
    	String[] options = {"Sair", "Continuar"};
    	int x = JOptionPane.showOptionDialog(null, "O que deseja fazer?",
                "Escolha uma opção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    	
    	if (x == 1) {
    		main(null);
    	}
    }
}