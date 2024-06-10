package com.mycompany.aula11;
public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    //metodos
    public final void aniversario(){
        this.idade++;
    }
    //metodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
