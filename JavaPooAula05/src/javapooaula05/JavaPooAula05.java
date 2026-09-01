
package javapooaula05;

public class JavaPooAula05 {

    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 20, "masc");
        p[1] = new Pessoa("Maria", 18, "fem");
        
        l[0] = new Livro("JAVA do Zero", "Gustavo", 300, p[0]);
        l[1] = new Livro("JAVA POO", "Gustavo", 400, p[1]);
        l[2] = new Livro("Exercicios de JAVA", "Gustavo", 500, p[0]);
        
        l[0].Abrir();
        l[0].Folhear(10);
        System.out.println(l[0].detalhes());
        l[0].avancarPag();
        
        l[1].Abrir();
        l[1].Folhear(200);
        
        
        System.out.println(l[0].detalhes());
        System.out.println(l[2].detalhes());
        System.out.println(l[1].detalhes());
        
    }
    
}
