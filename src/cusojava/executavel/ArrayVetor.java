package cusojava.executavel;

import java.util.Iterator;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	
	//Usado para executar códgo//
	public static void main(String[] args) {
		
		double[] notas = {8.8, 9.7, 7.6, 6.8};
		double[] notasLogica = {7.1, 5.7, 9.6, 7.8};
		
		//Criação do aluno//
		Aluno aluno = new Aluno();
		aluno.setNome("Jefferson Franca");
		aluno.setNomeEscola("JDev Treinamentos");
		
		//Criação da disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Curso de programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Eva Pereira");
		aluno1.setNomeEscola("JDev Treinamentos 2");
		
		//Criação da disciplina
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Curso de Css");
		disciplina1.setNota(notas);
		
		aluno1.getDisciplinas().add(disciplina1);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Curso de Html");
		disciplina3.setNota(notasLogica);
		
		aluno1.getDisciplinas().add(disciplina3);
		
		Aluno[] arrayAlunos = new Aluno[2];
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno1;
		
		for (int pos = 0; pos < arrayAlunos.length; pos++) {
			System.out.println("Nome do aluno é: " + arrayAlunos[pos].getNome());
			
			System.out.println("-----------------------------------" );
			
			for (Disciplina disc : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina é:" + disc.getDisciplina());
				
			System.out.println("-----------------------------------");
				
				for (int posnota = 0; posnota < disc.getNota().length; posnota++) {
					System.out.println("A nota número: " + posnota + " é igual = " + disc.getNota()[posnota]);
				}
			}
		}
		
		
		/*Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Curso de programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		System.out.println("nome do aluno = " + aluno.getNome() + ", inscrito no curso: " + aluno.getNomeEscola() + ".");
		System.out.println("\n-------Disciplina do Aluno------------");
		
		for (Disciplina disc : aluno.getDisciplinas()) {
			
			System.out.println("\n Disciplina: " + disc.getDisciplina());
			System.out.println("\n A notas da disciplina são: ");
			
			double notaMax = 0.0;
			for (int i = 0; i < disc.getNota().length; i++) {
				System.out.println("Nota " + (i + 1) + " é igual = " + disc.getNota()[i]);
				
				if (i == 0) {
					notaMax = disc.getNota()[i];
				}else {
					if (disc.getNota()[i] > notaMax) {
						notaMax = disc.getNota()[i];
					}
				}
			}
			
			double notaMenor = 0.0;
			for (int i = 0; i < disc.getNota().length; i++) {
				System.out.println("Nota " + (i + 1) + " é igual = " + disc.getNota()[i]);
				
				if (i == 0) {
					notaMenor = disc.getNota()[i];
				}else {
					if (disc.getNota()[i] < notaMenor) {
						notaMenor = disc.getNota()[i];
					}
				}
			}
			System.out.println("A maior nota da disciplina = " + disc.getDisciplina() + " e de valor: " + notaMax);
			System.out.println("A menor nota da disciplina = " + disc.getDisciplina() + " e de valor: " + notaMenor);
		}*/
		
		/*String[] valores = {"Jefferson","78.5","Curso de Java","90"};
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Valor na posição " + i + " é igual = " + valores[i]);
		}*/
		
		
		//Array pode ser de todos os tipos de dados e objetos também//
		
		/*String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter? ");
		
		//Array sempre deve ter a quantidade de posições definidas//
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		for (int i = 0; i < notas.length; i++) {
			
			String valor = JOptionPane.showInputDialog("Qual o valor da posição = " + i);
			notas[i] = Double.valueOf(valor);
		}
		
		//Atrbuir valor nas posições do arrays//
	  /*notas[0] = 7.8;
		notas[1] = 8.7;
		notas[2] = 9.7;
		notas[3] = 9.9;*/
		
	  /*System.out.println("Notas 1 = " + notas[0]);
		System.out.println("Notas 2 = " + notas[1]);
		System.out.println("Notas 3 = " + notas[2]);
		System.out.println("Notas 4 = " + notas[3]);*/
		
		/*for (int i = 0; i < notas.length; i++) {
			System.out.println("notas " + (i + 1) + " é " + notas[i]);
		}*/
		
	}

}
