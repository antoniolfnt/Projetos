package Controlador;

import Interface.AlunoInterface;
import Controlador.ControladorLivro;
import associado.Aluno;


public class ControladorAluno {
private static AlunoInterface repositorio;

public boolean estaMatriculado(Aluno aluno) {
		return true;
}

public static boolean exists(Aluno aluno) {
		return repositorio.consultar(aluno).size>0;
	}


}
