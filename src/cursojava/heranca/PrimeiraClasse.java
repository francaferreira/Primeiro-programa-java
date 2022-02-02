package cursojava.heranca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasse {
	

	//Digitar main, Teclado Ctrl + space aparece método main//
	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Digite o login");
		String senha = JOptionPane.showInputDialog("Digite a senha");
		
		if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
		
		
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		//É uma lista que dentro dela temos uma chave que identifica uma sequencia de valores também//
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		/*List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovado = new ArrayList<Aluno>();*/
		
		for (int qtd = 1; qtd <= 3; qtd++) {
		
		//New Aluno() é uma instancia (criação de objeto)//
		//aluno1 é um referencia para o objeto aluno//
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+" ?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade? ");
		String dataNascimento = JOptionPane.showInputDialog("Data Nascimento? ");
		String rg = JOptionPane.showInputDialog("Registro Geral? ");
		String cpf = JOptionPane.showInputDialog("Numero CPF? ");
		String nomeMae = JOptionPane.showInputDialog("Nome da Mãe? ");
		String nomePai = JOptionPane.showInputDialog("Nome do Pai?");
		String dataMatricula = JOptionPane.showInputDialog("Data da Matricula? ");
		String nomeEscola = JOptionPane.showInputDialog("Nome da Escola?");
		String serieMatricula = JOptionPane.showInputDialog("Série da Matricula?");*/
		
	
		
		
		Aluno aluno1 = new Aluno();//Aqui será o joão//
		
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serieMatricula);*/
		
		for (int pos = 1; pos <= 1; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+"?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+"?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		/*int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		if (escolha == 0) {// *opção SIm é ZERO //
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while (continuarRemover == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover ?");
		}
		}*/
		alunos.add(aluno1);
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new  ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) {//Separei em Listas//
			
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else { 
				maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			
			System.out.println("--------------Lista dos Aprovados-----------------");
			for (Aluno aluno1 : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Nome do aluno = " + aluno1.getNome() + " Resultado = " + aluno1.getAlunoAprovado2() + " com média de = " + aluno1.getMediaNota());
			}
			
			System.out.println("--------------Lista dos Recuperados----------------");
			for (Aluno aluno1 : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Nome do aluno " + aluno1.getNome() + " Resultados = " + aluno1.getAlunoAprovado2() + " com média de = " + aluno1.getMediaNota());
				}
			
			System.out.println("---------------Lista dos Reprovados------------------");
			for (Aluno aluno1 : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Nome do aluno " + aluno1.getNome() + " Reprovado = " + aluno1.getAlunoAprovado2() + " com media de = " + aluno1.getMediaNota());
			}
		}
		
		/*for (int pos = 0; pos < alunos.size(); pos++) {
			
			Aluno aluno = alunos.get(pos);
			
			if (aluno.getNome().equalsIgnoreCase("Alex")) {
				
				Aluno trocar = new Aluno();
				trocar.setNome("Aluno foi trocado");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Matemática");
				disciplina.setNota(96);
				
				trocar.getDisciplinas().add(disciplina);
				
				alunos.set(pos, trocar);
				aluno = alunos.get(pos);
				
				}
			
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Média do aluno " + aluno.getMediaNota());
			System.out.println("Resultado " + aluno.getAlunoAprovado2());
			System.out.println("----------------------------------------------");
			
			
			
			for (int posd = 0; posd < aluno.getDisciplinas().size(); posd ++) {
				
			Disciplina disc = aluno.getDisciplinas().get(posd);	
			System.out.println("Materia = " + disc.getDisciplina() + "Nota = " + disc.getNota());	
			}
			
			}*/
			
			/*for (Disciplina disc : aluno.getDisciplinas()) {
				System.out.println("Materia = " + disc.getDisciplina() + "Nota = " + disc.getNota());
			}
		}*/
		
		/*for (Aluno aluno : alunos) {
			
			if (aluno.getNome().equalsIgnoreCase("alex")) {
				
			alunos.remove(aluno);
			break;
			}else {
				System.out.println(aluno); //Descrição do objeto na memoria//
				System.out.println("Média do aluno = " + aluno.getMediaNota());
				System.out.println("Resultado = " + aluno.getAlunoAprovado());
				System.out.println("Resultado = " + aluno.getAlunoAprovado2());
				System.out.println("-----------------------------------------------");
			}
			
		}*/
		
		/*for (Aluno aluno : alunos) {
			System.out.println("Aluno que sobram na lista");
			System.out.println(aluno.getNome());
			System.out.println("Sua materias são");
			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}
		}*/
	
	
	
	
	//Equals e hashcode (Diferenciar objetos)//
	
	/*Aluno aluno1 = new Aluno();
	aluno1.setNome("Jefferson");
	aluno1.setNumeroCpf("123");
	
	Aluno aluno2 = new Aluno();
	aluno2.setNome("Jefferson");
	aluno2.setNumeroCpf("123");
	
	if (aluno1.equals(aluno2)) {
		System.out.println("Alunos são iguais");
	}else {
		System.out.println("Alunos não são iguais");
	}*/
	
	
		}
	}

}
