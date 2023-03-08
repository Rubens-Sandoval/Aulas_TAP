/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploheranca.heranca2;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Onibus extends Veiculo{
    
    private int assentos;
    
    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;   
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("Placa: " + this.placa + "\nAno: " + this.ano + "\nAssentos: " + this.assentos + "\n--------\n");
    }
}
