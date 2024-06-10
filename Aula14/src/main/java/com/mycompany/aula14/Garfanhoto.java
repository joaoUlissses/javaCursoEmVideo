
package com.mycompany.aula14;

public class Garfanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Garfanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.totAssistido=0;
        this.login = login;
    }
    
    public void viuMaisUm(){
        this.totAssistido++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Garfanhoto{" +super.toString()+ "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}
