
package projetofinal;


public class Gafanhoto extends Pessoa{
    
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    
    /*METODO CONTRUTOR*/
    
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
    
    
}
