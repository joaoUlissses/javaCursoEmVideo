
package com.mycompany.aula09;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo; // se for mulher nao pode ler
    private String faixaEtaria;

    
    //metodos
    public void status(){
         System.out.println("cliente: "+nome);
         System.out.println("classificacao: "+faixaEtaria);
         if("Homem".equals(sexo)){
             System.out.println("pode ler");
         }else
             System.out.println("volta pra cozinha");
    }
    
    // metodos especiais
    public Pessoa(String no, int id,String se) {
        this.nome = no;
        this.setIdade(id);
        this.sexo = se;
    }
    
    public void aniversario(){        
            this.idade+=1;
            System.out.println(this.idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;        
    }

    public void setIdade(int id) {
        this.idade = id;
        this.setFaixaEtaria();
        
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria() {
        if (idade<=10) {
            this.faixaEtaria="infantil";
        } else if(idade <=15){
            this.faixaEtaria="infantoJuvenil";
        }else if(idade<18){
            this.faixaEtaria="juvenil";
        }else{
            this.faixaEtaria="Livre leitura";
        }
    }
            
}
