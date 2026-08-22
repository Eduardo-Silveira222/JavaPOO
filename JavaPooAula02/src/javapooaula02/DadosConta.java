
package javapooaula02;

public class DadosConta {
    //ATRIBUTOS
    
    public int numConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;

    //MÉTODO CONSTRUTOR
    
    public DadosConta(){
        this.saldo = 0;
        this.status = false;
    }
    
    //MÉTODOS
    
    public void estadoAtual(){
        System.out.println("-------------------------");
        System.out.println("Numero da Conta: "+this.getNumconta());
        System.out.println("Tipo: "+this.getTipoConta());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
        System.out.println("-------------------------");
    }
    
    public void abrirConta(String t){
        this.setTipoConta(t);
        this.setStatus(true);
        
        if(t == "CC"){
            this.setSaldo(50);
        }else{
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro.");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta em débito.");
        }else{
            this.setStatus(false);
        }
        System.out.println("Conta fechada com sucesso");
    }
    public void depositar(float v){
        if(this.getStatus()== true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesseo na conta de "+ this.getDono());
        }else{
            System.out.println("Impossivel depositar.");
        }
    }
    public void sacar(float v){
         if(this.getStatus()== true){
             if(this.getSaldo() >= v){
                 this.setSaldo(this.getSaldo() - v);
                 System.out.println("Saque realizado com sucesso na conta de "+ this.getDono());
             }else{
                 System.out.println("Saldo insuficiente.");
             }
         }else{
             System.out.println("Impossivel sacar.");
         }
    }
    public void pagarMensalidade(){
        int v =0;
        if(this.getTipoConta()== "CC"){
            v = 12;
        }else if(this.getTipoConta()== "CP"){
            v = 20;
        }
        
        if(this.getStatus()== true){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo()- v);
                System.out.println("Mensalidade paga com sucesso");
            }else{
                System.out.println("Saldo insuficiente.");
            }        
        }else{
            System.out.println("Impossivel pagar.");
        }
    }
    
    //MÉTODOS ESPECIAIS
    public int getNumconta(){
        return this.numConta;
    }
    public void setNumconta(int n){
        this.numConta = n;
    }
    public String getTipoConta(){
        return this.tipoConta;
    }
    public void setTipoConta(String t){
        this.tipoConta = t;
    }
    public String getDono(){
        return this.dono;
    }
    public void setDono(String nd){
        this.dono = nd;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean st){
        this.status = st;
    }
}
