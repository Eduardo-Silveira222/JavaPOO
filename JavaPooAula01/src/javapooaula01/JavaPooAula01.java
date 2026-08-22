
package javapooaula01;

public class JavaPooAula01 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta("CIC","Amarela",0.4f);
        /*
        //c1.modelo = "BIC";
        c1.setModelo("BIC");
        
        //c1.ponta = 0.5f;
        c1.setPonta(0.5f);
        
        //System.out.println("Modelo: "+ c1.modelo);
        System.out.println("Modelo: "+ c1.getModelo());
        //System.out.println("Ponta: "+ c1.ponta);
        System.out.println("Ponta: "+ c1.getPonta());
        
        */
        System.out.println("Esse é o Status geral.");
        c1.status();
    }
    
}