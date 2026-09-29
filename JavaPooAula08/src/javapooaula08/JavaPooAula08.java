
package javapooaula08;

public class JavaPooAula08 {

    public static void main(String[] args) {
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        
        //l.emitirSom();
        //c.emitirSom();
        c.reagir("ola");
        c.reagir("vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
        c.reagir(17, 20f);
    }
    
}
