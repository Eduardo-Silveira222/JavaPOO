
package javapooaula04;

public class Lutador {
    
    /*ATRIBUTOS*/
        
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    /*MÉTODO CONTRUTOR*/

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    
    
    /*MÉTODOS PUBLICOS*/
    
    public void apresentar(){
        System.out.println("--------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador "+ this.getNome());
        System.out.println("Diretamente de "+ this.getNacionalidade());
        System.out.println("com "+ this.getIdade()+" anos e "+ this.getAltura());
        System.out.println("pesando "+ this.getPeso());
        System.out.println(this.getVitorias()+" Vitorias, "+ this.getDerrotas()+" derrostas e "+ this.getEmpates() +" empates.");
    } 
    public void status(){
        System.out.println(this.getNome() +" é um peso "+ this.getCategoria());
        System.out.println("Ganhou "+ this.getVitorias() +" vezes");
        System.out.println("Perdeu "+ this.getDerrotas() +" vezes");
        System.out.println("Empatou "+ this.getEmpates() +" vezes");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
    
    /*MÉTODOS ESPECIAIS*/

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nac) {
        this.nacionalidade = nac;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float a) {
        this.altura = a;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float p) {
        this.peso = p;
        this.setCategoria();
        
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }else if (this.peso<= 70.3){
            this.categoria = "Leve";
        }else if(this.peso<= 83.9){
            this.categoria = "Médio";
        }else if(this.peso<= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vit) {
        this.vitorias = vit;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int der) {
        this.derrotas = der;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int emp) {
        this.empates = emp;
    }
    
}
