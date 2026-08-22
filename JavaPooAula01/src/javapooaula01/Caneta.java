
package javapooaula01;

public class Caneta {
    
   public Caneta(String m, String c,float p){ //Método Construtor
       this.tampar();
       this.setCor(c);
       this.setModelo(m); 
       this.setPonta(p);
   }
   
   private String modelo;
   private String cor;
   private float ponta;
   protected int carga;
   private boolean tampada;
    
   public void status(){
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: "+ this.getPonta());
        System.out.println("carga: "+ this.carga +" %");
        System.out.println("Esta tampada? "+ this.tampada);
    }
   protected void escrever(){
       if(this.tampada == true){
           System.out.println("'Erro'Nao posso escrever!");
       }else{
           System.out.println("Estou escrevendo!");
       }
   }
   private void rabiscar(){
        if(this.tampada == true){
            System.out.println("'ERRO' Nao posso rabiscar!");
        }else{
            System.out.println("Etou rabiscando!");
        }
    }
   public void tampar(){
        this.tampada = true;
    }
   public void destampar(){
        this.tampada = false;
    }
    public float getPonta(){
       return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    
}