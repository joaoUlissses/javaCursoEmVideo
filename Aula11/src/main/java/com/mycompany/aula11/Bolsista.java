package com.mycompany.aula11;
public class Bolsista extends Aluno{
    public int bolsa;
    
    //metodos
    @Override 
        public void pagarMensalidade(){
        System.out.println(this.getNome()+" paga mensalidade com desconto de "+this.getBolsa()+"%");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
}
