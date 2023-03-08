/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploheranca.heranca2;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("Placa: " + this.placa + "\nAno: " + this.ano + "\nEixos: " + this.eixos + "\n--------\n");
    }
}
