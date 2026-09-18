
package javapooaula06;

public class Professor extends Pessoa {
    private String espec;
    private float salario;
    
    /*MÉTODOS*/
    public void receberAume(float aum){
        this.salario += aum;
    }
    
    /*MÉTODOS ESPECIAIS*/

    public String getEspec() {
        return espec;
    }

    public void setEspec(String espec) {
        this.espec = espec;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    
    
    
    
}
