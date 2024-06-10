
package com.mycompany.aula10;
public class Professor extends Pessoa{
    private String especialidade;
    private int salario;
    
    //metodos
    public void receberAumento(int aum){
        this.salario+=aum;
    }

    public String Status() {
        return " Professor{" + "especialidade=" + especialidade + ", salario=" + salario + '}';
    }
    //metodos especiais    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
