package com.mycompany.aula04;
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("nic","amarela",0.4f);
        //c1.setModelo("bic");
        //c1.setPonta(0.5f);
        c1.destampar();
        c1.status();
        System.out.println("-----------------");
        Caneta c2 = new Caneta("kkk","azul",0.6f);
        c2.status();
    }
}
