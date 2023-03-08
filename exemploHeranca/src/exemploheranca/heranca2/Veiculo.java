/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploheranca.heranca2;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Veiculo {
    protected String placa;
    protected int ano;
    
    public Veiculo(String placa, int ano){
        this.ano = ano;
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void exibirDados(){
        System.out.println("Placa: " + this.placa + "\nAno: " + this.ano + "\n--------\n");
    }
}
