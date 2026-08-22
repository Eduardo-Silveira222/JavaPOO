
package javapooaula02;

public class JavaPooAula02 {

    public static void main(String[] args) {
       DadosConta p1 = new DadosConta();
        
        p1.setNumconta(12345);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        
        DadosConta p2 = new DadosConta();
        p2.setNumconta(54321);
        p2.setDono("Creusa");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
