package cusojava.executavel;

import cursojava.classes.Aluno;
import cursojava.heranca.Diretor;
import cursojava.heranca.Secretario;

public class TestendoClasseFilha {
	
	public static void main(String[] ags) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Jefferson");
		aluno.setNomeEscola("Jdev - Treinamento");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("9876543");
		diretor.setNome("Rafael");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("12345678");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
	}

}
