/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploheranca.heranca1;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Retangulo extends Figura{
    private double lado1;

    public Retangulo(String cor, double lado1, double lado2){
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }


    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    private double lado2;
    

    @Override
    public double area() {
        return this.lado1 * this.lado2;
    }
    @Override
    public String toString() {
        return "Retangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
}
