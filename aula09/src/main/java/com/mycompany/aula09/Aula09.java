package com.mycompany.aula09;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];
        p[0] = new Pessoa("Maria",19,"mulher");
        p[1] = new Pessoa("Pedro",18,"Homem");
        l[0] =  new Livro("enigma do principe","JK holing",300,p[0]);
        l[1] = new Livro("reliquias da morte","JK holing",500,p[1]);
        
        //fazendo a magica
        System.out.println(l[0].detalhes());
        l[0].abrir();
        l[0].folhear(20);
        System.out.println(l[0].detalhes());
    }
}
