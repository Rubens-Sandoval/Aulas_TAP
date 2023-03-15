/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplointerface.bean;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Professor extends PessoaFisica{
    
    private String funcional;

    public Professor() {
    }

    public Professor(int id) {
        super(id);
    }

    public Professor(String nome) {
        super(nome);
    }

    public Professor(String funcional, String nome) {
        super(nome);
        this.funcional = funcional;
    }

    public Professor(int id, String nome, String cpf, String funcional) {
        super(id, nome, cpf);
        this.funcional = funcional;
    }

    public String getFuncional() {
        return funcional;
    }

    public void setFuncional(String funcional) {
        this.funcional = funcional;
    }

    @Override
    public String toString() {
        String msg = super.toString();
        return msg + "Professor{" + "funcional=" + funcional + '}';
    }
    
    
}
