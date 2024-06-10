package com.mycompany.aula07;
public class Lutador {
    //atributos
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private int altura;
    private int peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    //metodos
    public void apresentar(){
        System.out.println("o lutador "+nome);
        System.out.println("com a altura de "+altura);
        System.out.println("pesando "+peso+" quilos");
        System.out.println("na categoria: "+ categoria);
        System.out.println("com "+vitorias+" vitorias");
        System.out.println("e "+derrotas+" derrotas");
        System.out.println("alem de "+empates+" empates");
    }
    public void status(){
        System.out.println("o lutador "+this.getNome());
        System.out.println("ja vencer "+this.getVitorias());
        System.out.println("na categoria "+this.getCategoria());
        System.out.println("e ja perdeu "+this.getDerrotas()+" lutas");
        System.out.println("e teve "+this.getEmpates()+" empates");
    }
    
    public void ganhaLuta(){
        this.setVitorias(getVitorias()+1);
    }
    public void perdeLuta(){
        this.setDerrotas(getDerrotas()+1);
    }
    public void empataLuta(){
        this.setEmpates(getEmpates()+1);
    }
    //metodos especiais

    public Lutador(String no,String na,int id, int al, int pe,int vi,int de,int em) {
        this.nome           = no;
        this.nacionalidade  = na;
        this.idade          = id;
        this.altura         = al;
        this.setPeso(pe)        ;
        this.vitorias       = vi;
        this.derrotas       = de;
        this.empates        = em;
    }

  

    public String getNome() {
        return this.nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }
    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }
     public String getCategoria() {
        
        return categoria;
    }

    private void setCategoria() {
        if (peso<53) {
            this.categoria = " inapto";
        } else if(peso <=73) {
            this.categoria = "peso pena";
        }else if (peso<=83){
            this.categoria = "peso medio";
        }else{
            this.categoria = "peso pesado";
        }
    }
    
}
