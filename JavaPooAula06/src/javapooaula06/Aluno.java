
package javapooaula06;

public class Aluno extends Pessoa {
    private int matr;
    private String curso;
    
    
    /*MÉTODOS*/
    public void cancelarMatr(){
        System.out.println("Matricula será cancelada");
    }
    
    /*MÉTODOS ESPECIAIS*/

    public int getMatric() {
        return matr;
    }

    public void setMatr(int matric) {
        this.matr = matric;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
