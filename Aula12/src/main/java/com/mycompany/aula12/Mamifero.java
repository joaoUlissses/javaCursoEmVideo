
package com.mycompany.aula12;

public class Mamifero extends Animal {
    private String corPelo;
    
    @Override
    public void locomover(){
        System.out.println("correndo");
    }
    @Override
    public void alimentar(){
        System.out.println("mamando");
    }
    @Override
    public void emitirSom(){
        System.out.println("sons mamiferos");
    }     
}

