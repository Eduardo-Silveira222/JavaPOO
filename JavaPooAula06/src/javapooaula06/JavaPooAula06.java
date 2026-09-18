
package javapooaula06;


public class JavaPooAula06 {

   
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        p1.setSexo("masc");
        p4.setSexo("fem");
        p2.setIdade(17);
        p3.setIdade(35);
        
        p3.setSalario(2850.50f);
        p4.setSetor("Estoque");
        p2.setCurso("informatica");

        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
