
package javapooaula03;


public class Controle implements Controlador {
    
    //ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //MÉTODO CONSTRUTOR

    public Controle() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    

    public int getVolume() {
        return volume;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean l) {
        this.ligado = l;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean t) {
        this.tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
            System.out.println("Esta ligado? " + this.getLigado());
            System.out.println("Esta tocando? "+ this.getTocando());
            System.out.print("Volume: "+ this.getVolume());
            for(int i=0; i <= this.getVolume(); i+=10){
                System.out.print("|");
            
        }
    }

    @Override
    public void fecharMenu() {
        if(this.getLigado()== true){
        System.out.println("Fechando Menu...");
        }
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()== true){
            this.setVolume(this.getVolume()+10);
            
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()== true){
            this.setVolume(this.getVolume()-10);
            System.out.println(this.getVolume());
           
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado()== true && this.getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado()== true && this.getVolume()== 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado()== true && !this.getTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado()== true && this.getTocando()){
            this.setTocando(false);
        }
    }
    
}
