package com.mycompany.aula10;

public class Aula10 {
    public static void main(String[] args) {
        Pessoa          p0 = new Pessoa();
        Aluno           p1 = new Aluno();
        Professor       p2 = new Professor();
        Funcionario     p3 = new Funcionario();
//caracteristicas como pessoas
        //genero
        p0.setSexo("M");
        p1.setSexo("F");
        p2.setSexo("M");
        p3.setSexo("F");
        
        //nomes
        p0.setNome("pedro");
        p1.setNome("Maria");
        p2.setNome("Claudio");
        p3.setNome("fabiana");
        
        //idades
        p0.setIdade(40);
        p1.setIdade(14);
        p2.setIdade(28);
        p3.setIdade(58);
        
 //caracteristicas especificas   
        
        p1.setCurso("informatica");
        p2.setSalario(2500);
        p3.setSetor("estoque");
        p2.receberAumento(500);
        p2.receberAumento(-259);
        System.out.println(p0.toString());
        System.out.println(p1.toString()+p1.Status());
        System.out.println(p2.toString()+p2.Status());
        System.out.println(p3.toString()+p3.Status());
    }
}
