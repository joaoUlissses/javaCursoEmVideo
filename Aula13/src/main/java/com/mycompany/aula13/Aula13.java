package com.mycompany.aula13;

public class Aula13 {

    public static void main(String[] args) {
        System.out.println("polimorfismo em java hahaha");
        
        
        
        Cachorro c1 = new Cachorro();
        
        c1.idade=8;
        c1.membros=4;
        c1.peso=4;
        
        c1.emitirSom();
        System.out.println("receber um Ola");
        c1.reagir("Ola");
        System.out.println("o horario é 15hrs");
        c1.reagir(15,12);
        System.out.println("nao é seu dono");
        c1.reagir(false);
        System.out.println("pela sua idade e peso");
        c1.reagir(3,2f);
    }
}
