/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.bean;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class PessoaJuridica extends Pessoa{
    
    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(int id) {
        super(id);
    }

    public PessoaJuridica(String nome) {
        super(nome);
    }

    public PessoaJuridica(int id, String nome, String cnpj) {
        super(id, nome);
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        String msg = super.toString();
        return msg + "PessoaJuridica{" + "cnpj=" + cnpj + '}';
    }
    
    
}
