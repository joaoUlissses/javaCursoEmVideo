package com.mycompany.aula09;
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    //metodo
    public String detalhes(){
        return "Livro{ "+titulo+",\n autor: "+autor + "\n total de paginas: "+ totPaginas+", pag atual= "+pagAtual+"\n com leitor: "+leitor.getNome()+"\n aberto: "+aberto+"}";
    }
    // metodos especiais
    public Livro (String ti, String au, int tp, Pessoa leitor){
        this.titulo = ti;
        this.autor=au;
        this.aberto=false;
        this.pagAtual=0;
        this.totPaginas=tp;
        this.leitor=leitor;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // metodos abstratos
    @Override
    public void abrir() {
        this.aberto= true;
    }

    @Override
    public void fechar() {
        this.aberto=false;
    }

    @Override
    public void avancarPag() {
        this.pagAtual+=1;
    }

    @Override
    public void voltarPag() {
        this.pagAtual-=1;
    }
    public void folhear(int p){
            if(p>this.totPaginas){
                this.pagAtual=0;
            }else{
            this.pagAtual=p;
        }
    }
    
}
