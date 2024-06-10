
package com.mycompany.aula12;

public abstract class Animal {
            
    protected int peso;
    protected int idade;
    protected int membros;
    protected String especie;
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    //metodo especial

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
}
