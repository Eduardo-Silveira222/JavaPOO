
package javapooaula05;

public class Livro implements Publicacao {
    
    /*Atributos*/
    private String Titulo;
    private String Autor;
    private int TotPaginas;
    private int PagAtual;
    private boolean Aberto;
    private Pessoa Leitor;
    
    /*Método Contrutor*/

    public Livro(String Titulo, String Autor, int TotPaginas, Pessoa Leitor) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.TotPaginas = TotPaginas;
        this.Aberto = false;
        this.PagAtual = 0;
        this.Leitor = Leitor;
    }
    
    
    /*Métodos Publicos*/

    public String detalhes() {
        return "Livro{" + "Titulo= " + Titulo +
                ", Autor= " + Autor +
                "\n TotPaginas= " + TotPaginas +
                ", PagAtual= " + PagAtual +
                "\n Aberto= " + Aberto +
                "\n Leitor= " + Leitor.getNome() + '}';
    }

    /*Métodos Especiais*/
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String t) {
        this.Titulo = t;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String a) {
        this.Autor = a;
    }

    public int getTotPaginas() {
        return TotPaginas;
    }

    public void setTotPaginas(int tp) {
        this.TotPaginas = tp;
    }

    public int getPagAtual() {
        return PagAtual;
    }

    public void setPagAtual(int pa) {
        this.PagAtual = pa;
    }

    public boolean getAberto() {
        return Aberto;
    }

    public void setAberto(boolean aberto) {
        this.Aberto = aberto;
    }

    public Pessoa getLeitor() {
        return Leitor;
    }

    public void setLeitor(Pessoa l) {
        this.Leitor = l;
    }

    @Override
    public void Abrir() {   
        this.Aberto = true;
    }

    @Override
    public void Fechar() {
        this.Aberto = false;
    }

    @Override
    public void Folhear(int p) {
        if(p > this.TotPaginas){
            this.PagAtual = 0;
        }else{
            this.PagAtual = p;
        }
       }

    @Override
    public void avancarPag() {
        this.PagAtual++;
       }

    @Override
    public void voltarPag() {
        this.PagAtual--;
       }
    
    
}
