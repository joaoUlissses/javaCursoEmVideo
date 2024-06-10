package com.mycompany.aula11;
public class Tecnico extends Aluno{
    private int registroTecnico;
    
    public void praticar(){
        System.out.println(this.getNome()+" ta ganhando xp >:)");
    }

    public int getRegistroTecnico() {
        return registroTecnico;
    }

    public void setRegistroTecnico(int registroTecnico) {
        this.registroTecnico = registroTecnico;
    }
}
