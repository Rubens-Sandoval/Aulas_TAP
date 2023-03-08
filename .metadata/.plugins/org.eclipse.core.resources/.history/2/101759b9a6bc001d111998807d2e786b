
package mvcExample.model.bean;

public class Funcionario extends Pessoa {
    
    private String cargo;
    private Double salario;

    public Funcionario(int id) {
        super(id);
    }

    public Funcionario(String nome) {
        super(nome);
    }

    public Funcionario(String nome, String cargo, Double salario) {
        super(nome);
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(int id, String nome, String cargo, Double salario) {
        super(id, nome);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String msg = "Pessoa{" + "id=" + getId() + ", nome=" + getNome() + '}';
        msg += " Funcionario{" + "cargo=" + cargo + ", salario=" + salario + '}'; 
        return msg;
    }

    public void calculaSalario() {
        setSalario(1000.00);
        if(getCargo().equals("Adm")) {
            setSalario(getSalario() *2);
        }         
    } 

}
