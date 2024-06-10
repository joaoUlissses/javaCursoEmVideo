package com.mycompany.aula05;
public class ContaBanco {
    //atributos
      public int numConta;
      protected String tipo;
      private String dono;
      private float saldo;
      private boolean status;
      
      public void estadoAtual(){
          System.out.println("-------------------------");
          if(this.getTipo()=="CC"){
              System.out.println("Tipo:     conta corrente");
          }else{
              System.out.println("Tipo:     conta poupanca");
          }
          System.out.println("Dono:     "+this.getDono());
          System.out.println("saldo:    "+this.getSaldo());
          
          if (this.getStatus()) {
              System.out.println("Status:   conta aberta");
          } else {
              System.out.println("Status:   conta fechada");
          }
          
      }
      // metodos
      public void abrirConta(String t){
          this.setTipo(t);
          this.setStatus(true);
          System.out.println("conta aberta com sucesso");
          if ("CC".equals(t)) {                                                                        //decide se a conta é corrente
              this.setSaldo(50);                                                                //entrega saldo inicial de 50 por ser corrente 
          } else if("CP".equals(t)){                                                                   //decide se a conta é poupanca
              this.setSaldo(150);                                                               //entrega saldo inicial de 150 por ser poupanca
          }
      }
      public void fecharConta(){
          if(this.getSaldo()!=0){
              System.out.println("conta de "+this.getDono() +" nao pode ser fechada por conta de saldo");
              this.setStatus(true);
          }else{
              System.out.println("conta de "+this.getDono() +" fechada com, sucesso");
              this.setStatus(false);
          }
      }
      public void depositar(float v){
          if(this.getStatus()){
              this.setSaldo(this.getSaldo(  )+v);
              System.out.println("------------------------------");
              System.out.println("deposido realizado com sucesso na conta de  "+ this.getDono());
              System.out.println("saldo atual de "+getDono()+"é de: "+ getSaldo());
          }
      }public void sacar(float  v){
          if(this.getStatus()){                                                                 //verifica se a conta esta aberta ou fechada
              if(this.getSaldo()>=v){                                                           //caso a conta esteja aberta ela vai verificar se tem saldo o bastante para fazer o saque
                  this.setSaldo(this.getSaldo()-v);
                  System.out.println("-------------------------");
                  System.out.println("saque realizado na conta de "+this.getDono());            //conseguiu realizar o saque e reduziu o saldo na conta
                  System.out.println("saldo atual de "+getDono()+"é de: "+ getSaldo());
              }else{
                  System.out.println("Saldo insuficiente para saque");                          //nao conseguiu realizar o saque por falta de saldo na conta
              }
          }else{
              System.out.println("impossivel sacar de uma conta fechada");                              //nao conseguiu realizar o saque pelo status da conta ser fechada
          }
          
      }
      public void pagarMensalidade(){                                                           //PAGAMENTO DE MENSALIDADE
          int v = 0 ;
          if ("CC".equals(this.getTipo())) {                                                    //se for conta corrente CC 
              v=12;
              
          } else if ("CP".equals(this.getTipo())) {                                             // se for conta poupanca 
              v = 20;
          }
          if (this.getStatus()){
              this.setSaldo(this.getSaldo()-v);
              System.out.println("mensalidade paga com sucesso por "+ this.getDono());
          }
      }
      
      // metodos especiais 
      public void ContaBanco(){
          this.saldo =0;
          this.status=false;
      }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
