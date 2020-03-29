package associado;

import java.util.*;
import associado.Livro;

public class Aluno extends Associado {            
         private List<Livro> listarLivro;

    public List <Livro> getlistarLivro(){
            return listarLivro;
    }
    public void setListarLivro (List<Livro> listarLivro){      
        this.listarLivro = listarLivro;
    }
    public Aluno() {
		super();
		listarLivro = new ArrayList<Livro>(); 
    }
    private Aluno(int matricula, String nome) {
       super(matricula, nome);
        listarLivro = new ArrayList<Livro>(); 
        
		
	}

    
}
    
    
     
    
    


