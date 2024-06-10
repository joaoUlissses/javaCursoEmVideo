
package com.mycompany.aula13;

public class Cachorro extends Lobo{
    public void emitirSom(){
        System.out.println("au! au! au!");   
    }
    
    public void reagir(String frase){
        if("toma comida".equals(frase)|| "Ola".equals(frase)){
            System.out.println("abanar e latir");
        }else{
            System.out.println("rosnar");
        }
    }
    public void reagir(int hora, int minuto){
        if (hora>12) {
            System.out.println("abanar");
        } else if (hora>=18) {
            System.out.println("ignorar");
        } else {
            System.out.println("abanar e latir");
        }
{
        }
    }
    public void reagir(boolean dono){
        if (dono) {
            System.out.println("abanar");
        } else {
            System.out.println("rosnar");
        }
    }
    public void reagir(int idade, float peso){
        if (idade<5) {
            if (peso<10) {
                System.out.println("abanar");
            } else {
                System.out.println("latir");
            }
        } else {
            if (peso<10) {
                System.out.println("rosnar");
            } else {
                System.out.println("ignorar");
            }
        }
    }
}
