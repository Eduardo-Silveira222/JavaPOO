
package javapooaula07;

public class JavaPooAula07 {

 
    public static void main(String[] args) {
       // Animal a = new Animal();
       Mamifero m = new Mamifero();
       Reptil r = new Reptil();
       Peixe p = new Peixe();
       Ave a = new Ave();
       Canguru jack = new Canguru();
       Cachorro akaza = new Cachorro();
       Cobra obanai = new Cobra();
       Tartaruga leonardo = new Tartaruga();
       GoldFish dourado = new GoldFish();
       Arara blue = new Arara();
       
       jack.locomover();
       akaza.locomover();
       akaza.emitirSom();
       leonardo.emitirSom();
       obanai.emitirSom();
       blue.emitirSom();
       dourado.soltarBolha();
    }
    
}
