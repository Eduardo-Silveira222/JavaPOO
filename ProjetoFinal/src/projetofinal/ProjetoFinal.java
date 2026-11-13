
package projetofinal;

public class ProjetoFinal {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        
        v[0] = new Video("Aula 01 de Java Poo");
        v[1] = new Video("Aula 02 de Java Poo");
        v[2] = new Video("Aula 03 de Java Poo");
        
        Gafanhoto g[] = new Gafanhoto[2];
        
        g[0] = new Gafanhoto("jubileu", 17, "masc", "jubileu.gafanhoto");
        g[1] = new Gafanhoto("cleide", 16, "fem", "cleide.gafanhoto");
        
        Visualizacao vis[] = new Visualizacao[5];
        
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(80.5f);
        System.out.println(vis[1].toString());
        
        vis[2] = new Visualizacao(g[1],v[0]);
        vis[0].avaliar(80.5f);
        System.out.println(vis[2].toString());
        /*
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
        */
    }
    
}
