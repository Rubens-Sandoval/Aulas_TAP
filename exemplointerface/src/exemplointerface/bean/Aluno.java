/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.bean;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Aluno extends PessoaFisica{
    
    private String ra;

    public Aluno() {
    }

    public Aluno(int id) {
        super(id);
    }

    public Aluno(String nome) {
        super(nome);
    }

    public Aluno(String ra, String nome) {
        super(nome);
        this.ra = ra;
    }

    public Aluno(int id, String nome, String cpf, String ra) {
        super(id, nome, cpf);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        String msg = super.toString();
        
        return msg + "Aluno{" + "ra=" + ra + '}';
    }
    
    
    
    
}
