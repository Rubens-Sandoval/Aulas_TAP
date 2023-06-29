/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetomecanica.bean;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Veiculo {
    private int id;
    private int id_cliente;
    private String modelo;
    private String placa;
    private String defeito;

    public Veiculo(int id, int id_cliente, String modelo, String placa, String defeito) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.modelo = modelo;
        this.placa = placa;
        this.defeito = defeito;
    }

    public Veiculo(int id) {
        this.id = id;
    }
    public Veiculo(String placa) {
        this.placa = placa;
    }

    public Veiculo(int id_cliente, String modelo, String placa, String defeito) {
        this.id_cliente = id_cliente;
        this.modelo = modelo;
        this.placa = placa;
        this.defeito = defeito;
    }

    public Veiculo() {
    }

    public int getId() {
        return id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", id_cliente=" + id_cliente + ", modelo=" + modelo + ", placa=" + placa + ", defeito=" + defeito + '}';
    }
    
    
}
