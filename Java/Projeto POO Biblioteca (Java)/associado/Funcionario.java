
package associado;

import associado.Associado;
import biblioteca.ControladorFuncionario;

public class Funcionario extends Associado implements ControladorFuncionario {
    //Atributos
    private int numRegistro;
    // Método Construtor
    public Funcionario() {
    this.nome = "";
    this.CPF = 00000000000;
    this.endereco = "";
    this.numRegistro = 0000;
    }
    //Métodos GET e SET
    public int getNumRegistro() {
        return numRegistro;
    }
    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }
    //Métodos Abstratos
    @Override
    public void cadastrarLivro() {
        System.out.println("Livro cadastrado com sucesso!! Número do registro é " + this.getNumRegistro());
    }
    

  
}  
    
    
        
        
        

