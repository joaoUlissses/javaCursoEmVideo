package com.mycompany.aula04;
public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampado;
    
    public Caneta(String m, String c, float p){       //este é o metodo construtor 
        this.modelo =m;
        this.cor = c;
        this.ponta= p;
        this.tampar();
    }
    public String getModelo(){
         return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }public void tampar(){
        this.tampado =true;
    }
    public void destampar(){
        this.tampado =false;
    }
    public void status(){
        System.out.println("sobre a caneta: ");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("ponta:"+ this.ponta);
        System.out.println("cor: "+ this.cor);
        System.out.println("tamapa: "+ this.tampado);
    }
}
