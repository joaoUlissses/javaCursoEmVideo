
package com.mycompany.aula12;
public class Peixe extends Animal{
        
    @Override
    public void locomover(){
        System.out.println("nadar");
    }
    @Override
    public void alimentar(){
        System.out.println("comer outros peixes");
    }
    @Override
    public void emitirSom(){
        System.out.println("barulhos peixezes");
    }
    public void soltarBolha(){
        System.out.println("glub glub glub");
    }
}
