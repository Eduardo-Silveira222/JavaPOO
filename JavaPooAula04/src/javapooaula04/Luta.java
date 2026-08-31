
package javapooaula04;

import java.util.Random;

public class Luta {
    
    /*ATRUBUTOS*/
    private Lutador Desafiante;
    private Lutador Desafiado;
    private int Rounds;
    private boolean aprovada;
    
    /*MÉTODOS*/
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.Desafiado = l1;
            this.Desafiante = l2;
        }else{
            this.aprovada = false;
            this.Desafiado = null;
            this.Desafiante = null;
        }
    }
    public void Lutar(){
        if(this.aprovada){
            System.out.println("###DESAFIADO###");
            this.Desafiado.apresentar();
            System.out.println("###DESAFIANTE###");
            this.Desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);//0 1 2
            System.out.println("============================");
            System.out.println("============================");
            System.out.println("=========Resultado==========");
            switch(vencedor){
                case 0://empate
                    System.out.println("Empatou");
                    this.Desafiado.empatarLuta();
                    this.Desafiante.empatarLuta();
                    break;
                case 1://vitoria do desafiado
                    System.out.println("Vitoria do "+ this.Desafiado.getNome());
                    this.Desafiado.ganharLuta();
                    this.Desafiante.perderLuta();
                    break;
                case 2://vitoria do desafiante
                    System.out.println("Vitoria do "+ this.Desafiante.getNome());
                    this.Desafiante.ganharLuta();
                    this.Desafiado.perderLuta();
                    break;
            }
            System.out.println("===========================");
            System.out.println("===========================");
            
        }else{
            System.out.println("A luta não pode acontecer");
        }
    }
    
    /*MÉTODOS ESPECIAIS*/

    public Lutador getDesafiante() {
        return Desafiante;
    }

    public void setDesafiante(Lutador Desafiante) {
        this.Desafiante = Desafiante;
    }

    public Lutador getDesafiado() {
        return Desafiado;
    }

    public void setDesafiado(Lutador Desafido) {
        this.Desafiado = Desafido;
    }

    public int getRounds() {
        return Rounds;
    }

    public void setRounds(int Rounds) {
        this.Rounds = Rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
