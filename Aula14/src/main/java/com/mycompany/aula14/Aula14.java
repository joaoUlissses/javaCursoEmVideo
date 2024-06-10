package com.mycompany.aula14;
public class Aula14 {

    public static void main(String[] args) {
        //video
        Video v[] = new Video[3];                                       //("nome do filme")
        v[0] = new Video("sonic o filme ");
        v[1] = new Video("pokemon o filme");
        v[2] = new Video("aquele troco do mario que chamam de filme");
            //v[0].like(  );  
        //garfanhoto
       Garfanhoto g1 = new Garfanhoto("Joao","M",18,"sirBibit");        //(String nome, String sexo, int idade, String login)
       Garfanhoto g2 = new Garfanhoto("Pedro","M",20,"kobalt"); 
       //visualizacao integrando video com garfanhoto
       Visualizacao vis  = new Visualizacao(g1,v[0]);                    //(garfanhoto, video)
       Visualizacao vis2 = new Visualizacao(g2,v[0]);                   
       v[0].play();
       vis.avaliar(10f);
       v[0].like();
       vis2.avaliar(100.0f);
        System.out.println(vis.toString());
        v[0].like();
        System.out.println(vis2.toString());
    }
}
