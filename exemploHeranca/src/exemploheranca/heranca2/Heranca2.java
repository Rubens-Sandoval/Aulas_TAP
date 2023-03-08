/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploheranca.heranca2;

import java.util.ArrayList;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Heranca2 {
    public static void main(String[] args){
        ArrayList<Veiculo> veiculos= new ArrayList<Veiculo>();
        veiculos.add(new Veiculo("XPO-8972", 2010));
        veiculos.add(new Veiculo("XPO-8972", 2010));
        veiculos.add(new Caminhao("XPO-8972", 2010, 5));
        veiculos.add(new Onibus("XPO-8972", 2010, 60));
        
        ArrayList<Caminhao> caminhoes= new ArrayList<Caminhao>();
        caminhoes.add(new Caminhao("XPO-8972", 2010, 7));
        caminhoes.add(new Caminhao("XPO-8972", 2010, 5));

        veiculos.forEach(veiculo -> {
            veiculo.exibirDados();
        }); 
        
        caminhoes.forEach(caminhao -> {
            caminhao.exibirDados();
        });
        
        
    }
}
