package cusojava.executavel;

import cursojava.classes.Aluno;
import cursojava.heranca.Diretor;
import cursojava.heranca.Pessoa;
import cursojava.heranca.Secretario;

public class TestendoClasseFilha {
	
	public static void main(String[] ags) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Jefferson");
		aluno.setNomeEscola("Jdev - Treinamento");
		aluno.setIdade(25);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("9876543");
		diretor.setNome("Rafael");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("12345678");
		secretario.setIdade(18);
		secretario.setNome("Bia");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
	    System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade()); 
	    System.out.println(diretor.pessoaMaiorIdade());
	    System.out.println(secretario.pessoaMaiorIdade());
	    
	    System.out.println("Salário Aluno é = " + aluno.salario());
	    System.out.println("Salário Diretor é = " + diretor.salario());
	    System.out.println("Salário Secretário é = " + secretario.salario());
	    
	teste(aluno);
	teste(diretor);
	teste(secretario);
		
	}
	
	public static void teste(Aluno aluno) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Jefferson");
		aluno1.setNomeEscola("Jdev - Treinamento");
		aluno1.setIdade(25);
		
	}

	public static double salario() {
		// TODO Auto-generated method stub
		return  1500.9;
	}


		
	

	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = " + pessoa.getNome() 
		+ " e o salário é de " + pessoa.salario());
	}

}
