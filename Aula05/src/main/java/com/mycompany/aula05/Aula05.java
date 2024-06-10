package com.mycompany.aula05;

import java.util.Set;

public class Aula05 {

    public static void main(String[] args) {
        
        ContaBanco p1 = new  ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.getStatus();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(9231);
        p2.setDono("creuza");
        p2.abrirConta("CP");
        p2.getStatus(); 
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(100);
        p1.fecharConta();
        p1.sacar(150);
        p1.fecharConta();
        
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        ContaBanco p3 = new ContaBanco();
        p3.setNumConta(3929);
        p3.setDono("garibaldo");
        p3.abrirConta("CP");
        p3.estadoAtual();
    }
}
