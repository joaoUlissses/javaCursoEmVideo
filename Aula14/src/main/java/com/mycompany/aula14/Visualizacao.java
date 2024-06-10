
package com.mycompany.aula14;

public class Visualizacao {
    private Garfanhoto espectador;
    private Video filme;
    
    
    // metodos     
    public Visualizacao(Garfanhoto espectador, Video filme){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
        int tot = 0;
        if (porc<=20) {
            tot=3;
        } else if(porc<=50){
            tot=5;
        }else if(porc <=80){
            tot = 9;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    
    //metodos especiais

    public Garfanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Garfanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
    
    
    
}
