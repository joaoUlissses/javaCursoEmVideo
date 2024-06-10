package com.mycompany.aula12;

import java.util.HashSet;
import java.util.Set;

public class Aula12 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();      
        Aves v1 = new Aves();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Canguru c = new Canguru();
        
        m.setPeso(80);
        m.setIdade(2);
        m.setMembros(4);
        
        m.locomover();
        m.alimentar();
        m.emitirSom();
        
        //ave
        v1.setIdade(55);
        v1.setPeso(4);
        v1.setMembros(2);
        
        v1.locomover();
        v1.alimentar();
        v1.emitirSom();
        
        v1.setIdade(55);
        v1.setPeso(4);
        v1.setMembros(2);
        
        v1.locomover();
        v1.alimentar();
        v1.emitirSom();
        System.out.println(v1.especie);
        System.out.println(v1.idade);   
        v1.fazerNinho();
        v1.setEspecie("pardal");
        
        c.locomover();
        c.emitirSom();
    }
}
