/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploheranca.heranca1;

/**
 *
 * @author FATEC ZONA LESTE
 */
public abstract class Figura {
    private String cor;

    public Figura(String cor){
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override
    public String toString() {
        return "Figura{" + "cor=" + cor + '}';
    }
    
    public abstract double area();
}
