/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetomecanica.bean;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Mecanico {
    private int id;
    private String nome;
    private String cpf;
    private String ctt;

    public Mecanico(int id) {
        this.id = id;
    }

    public Mecanico(int id, String nome, String cpf, String ctt) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.ctt = ctt;
    }
    
    
    public Mecanico(String nome, String cpf, String ctt) {
        this.nome = nome;
        this.cpf = cpf;
        this.ctt = ctt;
    }

    public Mecanico(String nome) {
        this.nome = nome;
    }

    public Mecanico() {
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
        return "Mecanico{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", ctt=" + ctt + '}';
    }
    
    
    
}
