package associado;

import associado.Funcionario;

public class Livro {
    private String titulo;
    private String genero;
    private String autor;
    private int id;
    private int ano;
    private Funcionario funcionario;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
   public Livro (){
       super ();
    
}
   public Livro (String titulo, int id){
       super();
       this.titulo = titulo;
       this.id = id;
		
   }
   public Livro (String titulo, int id, String genero){
       super();
       this.titulo = titulo;
       this.id = id;
       this.genero = genero;
   }
   public Livro (String titulo, int id, String genero, String autor){
       super();
       this.titulo = titulo;
       this.id = id;
       this.genero = genero;
       this.autor = autor;
   }
   public Livro (String titulo, int id, String genero, String autor, int ano){
       super();
       this.titulo = titulo;
       this.id = id;
       this.genero = genero;
       this.autor = autor;
       this.ano = ano;
   }
   public Livro (String titulo, int id, String genero, String autor, int ano, Funcionario funcionario){
       super();
       this.titulo = titulo;
       this.id = id;
       this.genero = genero;
       this.autor = autor;
       this.ano = ano;
       this.funcionario = funcionario;
   }
   








}