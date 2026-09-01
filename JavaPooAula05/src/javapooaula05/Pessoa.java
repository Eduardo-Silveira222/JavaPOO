
package javapooaula05;

public class Pessoa {
    
    
    /*Atributos*/
    private String Nome;
    private int Idade;
    private String Sexo;
    
    /*Método Construtor*/

    public Pessoa(String Nome, int Idade, String Sexo) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Sexo = Sexo;
    }
    
    
    /*Métodos Publicos*/
    public void fazerAniversario(){
        this.Idade++;
    }
    
    /*Métodos Especiais*/

    public String getNome() {
        return Nome;
    }

    public void setNome(String N) {
        this.Nome = N;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int I) {
        this.Idade = I;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String S) {
        this.Sexo = S;
    }
    
    
}
