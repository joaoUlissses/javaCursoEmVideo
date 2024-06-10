
package com.mycompany.aula14;

public class Video implements AcoesVideo{
    public String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzido;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzido = false;
    }
    
    //metodos
    @Override
    public void play() {
        setReproduzido(true);
        System.out.println("video iniciado");
    }

    @Override
    public void pause() {
        setReproduzido(false);
        System.out.println("video pausado");
    }

    @Override
    public void like() { 
        setViews(views+1);
        setCurtidas(curtidas+1);
    }
    //metodos especiais

    public String getRTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int)((this.avaliacao+avaliacao)/this.views);
        
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzido() {
        if (reproduzido) {
            System.out.println("o video esta sendo reproduzido");
        } else {
            System.out.println("o video nao esta sendo reproduzido");
            
        }
        return reproduzido;
    }

    public void setReproduzido(boolean reproduzido) {
        this.reproduzido = reproduzido;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + 
                    ", avaliacao=" + avaliacao + 
                        ", views=" + views + 
                            ", curtidas=" + curtidas + 
                                ", reproduzido=" + reproduzido + '}';
    }
    
    
}
