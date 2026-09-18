
package javapooaula06;


public class Pessoa {
    private String Nome;
    private int Idade;
    private String Sexo;
    
    /*MÉTODOS*/
    public void fazerAniversario(){
        this.Idade ++;
    }
    
    /*MÉTODOS ESPECIAIS*/

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "Nome=" + Nome + ", Idade=" + Idade + ", Sexo=" + Sexo + '}';
    }
    
    
    
}
