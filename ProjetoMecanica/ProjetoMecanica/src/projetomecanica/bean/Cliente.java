/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetomecanica.bean;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String ctt;

    public Cliente(int id, String nome, String cpf, String ctt) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.ctt = ctt;
    }

    public Cliente(String nome, String cpf, String ctt) {
        this.nome = nome;
        this.cpf = cpf;
        this.ctt = ctt;
    }

    public Cliente(int id) {
        this.id = id;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCtt() {
        return ctt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCtt(String ctt) {
        this.ctt = ctt;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", ctt=" + ctt + '}';
    }
    
    
}
