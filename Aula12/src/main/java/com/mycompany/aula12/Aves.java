
package com.mycompany.aula12;
public class Aves extends Animal{
    @Override 
    public void locomover(){
        System.out.println("voar");
    }
    @Override
    public void alimentar(){
        System.out.println("comer sementes");
    }
    @Override
    public void emitirSom(){
        System.out.println("sons passarecos");
    }
    public void fazerNinho(){
        System.out.println("passaro construiu o ninho");
    }
}
