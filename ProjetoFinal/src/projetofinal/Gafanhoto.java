
package projetofinal;


public class Gafanhoto extends Pessoa{
    
    private String login;
    private int totAssistido;
    
    
    /*METODO CONTRUTOR*/
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
        
    }
    
    
    
    /*METODOS*/
    public void viuMaisUm(){
        
    }   
    
    /*METODOS ESPECIAIS*/

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\n login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}
