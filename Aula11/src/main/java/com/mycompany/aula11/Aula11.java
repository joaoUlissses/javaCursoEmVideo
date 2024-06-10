package com.mycompany.aula11;
public class Aula11 {

    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();
        a1.setNome("pedro");
        a1.setMatricula(1823);
        a1.setCurso("informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
               
        Bolsista b1 = new Bolsista();
        b1.setNome("simone");
        b1.setMatricula(3214);
        b1.setCurso("informatica");
        b1.setIdade(16);
        b1.setSexo("F");
        b1.setBolsa(15);
        b1.pagarMensalidade();
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Carlos");
        t1.setCurso("informatica");
        t1.setIdade(23);
        t1.setSexo("M");
        t1.setRegistroTecnico(9820);
        t1.praticar();
    }
}
