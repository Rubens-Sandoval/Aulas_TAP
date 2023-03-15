/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.bean;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class PessoaFisica extends Pessoa{
    
    private String cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(int id) {
        super(id);
    }

    public PessoaFisica(String nome) {
        super(nome);
    }

    public PessoaFisica(String cpf, String nome) {
        super(nome);
        this.cpf = cpf;
    }

    public PessoaFisica(int id, String nome, String cpf) {
        super(id, nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        String msg = super.toString();
        
        return msg + "PessoaFisica{" + "cpf=" + cpf + '}';
    }
    
    
}
