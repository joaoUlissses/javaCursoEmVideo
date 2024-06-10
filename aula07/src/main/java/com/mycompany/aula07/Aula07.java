package com.mycompany.aula07;
public class Aula07 {

    public static void main(String[] args) {
        Lutador L[] = new Lutador[6];
        L[0] = new Lutador("pretty Boy","franca",31,175,69,11,2,1);
        L[1] = new Lutador("putscript","brasil",29,168,57,14,2,3);
        L[2] = new Lutador("snapshadow","estados Unidos",35,165,80,12,2,1);
        L[3] = new Lutador("Dead code","australia",28,193,81,13,0,2);
        L[4] = new Lutador("UFOCobol","Brasil",37,170,119,5,4,3);
        L[5] = new Lutador("Nerdart","EUA",30,181,105,12,2,4);
        
        //combates 
        
        //Luta UEC01 = new Luta();
        //UEC01.marcarLuta(L[1],L[0]);
        //UEC01.lutar();
        Luta UEC02 = new Luta();
        UEC02.marcarLuta(L[2],L[3]);
        UEC02.lutar();
    }
}