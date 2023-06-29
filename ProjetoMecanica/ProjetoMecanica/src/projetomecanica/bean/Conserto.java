/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetomecanica.bean;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Conserto {
    private int id;
    private int id_cliente;
    private int id_mecanico;
    private int id_veiculo;
    private Cliente cli;
    private Mecanico mec;
    private Veiculo v;
    private String data_entrada;
    private String data_entrega;

    public Conserto(int id, int id_cliente, int id_mecanico, int id_veiculo, String data_entrada, String data_entrega) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.id_mecanico = id_mecanico;
        this.id_veiculo = id_veiculo;
        this.data_entrada = data_entrada;
        this.data_entrega = data_entrega;
    }

    public Conserto(int id) {
        this.id = id;
    }

    public Conserto(int id_cliente, int id_mecanico, int id_veiculo, String data_entrada, String data_entrega) {
        this.id_cliente = id_cliente;
        this.id_mecanico = id_mecanico;
        this.id_veiculo = id_veiculo;
        this.data_entrada = data_entrada;
        this.data_entrega = data_entrega;
    }

    public Conserto(String data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Conserto() {
    }

    public Conserto(int id_cliente, int id_veiculo) {
        this.id_cliente = id_cliente;
        this.id_veiculo = id_veiculo;
    }

    public int getId() {
        return id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public int getId_mecanico() {
        return id_mecanico;
    }

    public int getId_veiculo() {
        return id_veiculo;
    }

    public String getData_entrada() {
        return data_entrada;
    }

    public String getData_entrega() {
        return data_entrega;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setId_mecanico(int id_mecanico) {
        this.id_mecanico = id_mecanico;
    }

    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public void setData_entrada(String data_entrada) {
        this.data_entrada = data_entrada;
    }

    public void setData_entrega(String data_entrega) {
        this.data_entrega = data_entrega;
    }

    public Cliente getCli() {
        return cli;
    }

    public Mecanico getMec() {
        return mec;
    }

    public Veiculo getV() {
        return v;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public void setMec(Mecanico mec) {
        this.mec = mec;
    }

    public void setV(Veiculo v) {
        this.v = v;
    }
    
    
    @Override
    public String toString() {
        return "Conserto{" + "id=" + id + ", id_cliente=" + id_cliente + ", id_mecanico=" + id_mecanico + ", id_veiculo=" + id_veiculo + ", data_entrada=" + data_entrada + ", data_entrega=" + data_entrega + '}';
    }
    
    
}
