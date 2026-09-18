
package javapooaula06;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    /*MÉTODOS*/
    public void mudarTrab(){
        this.trabalhando = ! this.trabalhando;
    }
    
    /*MÉTODOS ESPECIAIS*/

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    
    
    
}
