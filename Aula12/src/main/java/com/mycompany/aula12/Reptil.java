package com.mycompany.aula12;
public class Reptil extends Animal{
    @Override
    public void locomover(){
        System.out.println("rastejando");
    }
    @Override
    public void alimentar(){
        System.out.println("come insetos e vegetais");
    }
    @Override
    public void emitirSom(){
        System.out.println("sons reptilianos");
    }
    
}
