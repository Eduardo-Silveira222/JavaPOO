
package javapooaula08;

public class Cachorro extends Mamifero{
    @Override
    public void emitirSom() {
        System.out.println("AU!AU!AU!");
    }
    
    public void reagir(String frase){
        if (frase.equals("toma comida")  || frase.equals("ola")){
            System.out.println("Abanando o rabo");
            this.emitirSom();
        }else{
            System.out.println("rosnando");
        }
        
    }
    public void reagir(int hora, int min){
        if (hora<12){
            System.out.println("abanando o rabo");
        }else if(hora>18){
            System.out.println("ignorando");
        }else{
            System.out.println("abanando o rabo");
            this.emitirSom();
        }
    }
    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("abanondo o rabo");
            this.emitirSom();
        }else{
            System.out.println("rosnando");
        }
    }
    public void reagir(int idade, float peso){
        if(idade<5){
            if(peso<10){
                System.out.println("abanando o rabo");
            }else{
                this.emitirSom();
            }
        }else if(peso<10){
            System.out.println("rosnando");
        }else{
            System.out.println("ignorando");
        }
    }
}
