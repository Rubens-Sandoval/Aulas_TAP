/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploheranca;

import exemploheranca.heranca1.*;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ExemploHeranca {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado("Roxo", 12, 12);
        Triangulo triangulo = new Triangulo("Azul", 5, 12);
        Retangulo retangulo = new Retangulo("Rosa", 32, 12);
        Circulo circulo = new Circulo("Verde", 10.2);
        
        System.out.println(quadrado);
        System.out.println(triangulo);
        System.out.println(retangulo);
        System.out.println(circulo);
        
        System.out.println(quadrado.area());
        System.out.println(triangulo.area());
        System.out.println(retangulo.area());
        System.out.println(circulo.area());
    }
    
}