/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploheranca.heranca1;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Quadrado extends Retangulo{

    public Quadrado(String cor, double lado1, double lado2) {
        super(cor, lado1, lado2);
    }
    
    @Override
    public double area() {
        return this.getLado1() * this.getLado1();
    }

    @Override
    public String toString() {
        return "Quadrado{" + "lado=" + this.getLado1() + "}";
    }
    
    
}
