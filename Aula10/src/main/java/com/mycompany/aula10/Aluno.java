package com.mycompany.aula10;
public class Aluno extends Pessoa{  
    private boolean matricula=true;
    private String curso;

     //metodos
    public void cancelarMatricula(){
        this.setMatricula(matricula = false);
    }
    
    //metodos especiais

    /**
     *
     * @return
     */
    public String Status(){
        return " Aluno: " + "matricula=" + matricula + ", curso=" + curso + "}";
    }
    

    public boolean getMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
