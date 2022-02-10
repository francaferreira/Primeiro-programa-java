package cursojava.heranca;

import java.util.ArrayList;
import java.util.List;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class Aluno extends Pessoa {
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public Aluno() { //Cria os dados na memoria - Sendo padr�o do Java// 
	}
public Aluno(String nomePadrao) {
	nome = nomePadrao;
}

public Aluno(String nomePadrao, int idadePadrao) {
	nome = nomePadrao;
	idade = idadePadrao;
	
}



//Veremos o metodos SETTERS e GETTERS do objetos//
//SET � para adicionar ou receber dados para os atributos//
//GET � para resgatar ou abter o valor do atributo//


//Recebe dados//
public void setNome (String nome) {
	this.nome = nome;
}

//Obter o valor//
public String getNome () {
	return nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public String getDataNascimento() {
	return dataNascimento;
}
public void setDataNascimento(String dataNascimento) {
	this.dataNascimento = dataNascimento;
}
public String getNumeroCpf() {
	return numeroCpf;
}
public void setNumeroCpf(String numeroCpf) {
	this.numeroCpf = numeroCpf;
}
public String getNomeMae() {
	return nomeMae;
}
public void setNomeMae(String nomeMae) {
	this.nomeMae = nomeMae;
}
public String getNomePai() {
	return nomePai;
}
public void setNomePai(String nomePai) {
	this.nomePai = nomePai;
}
public String getDataMatricula() {
	return dataMatricula;
}
public void setDataMatricula(String dataMatricula) {
	this.dataMatricula = dataMatricula;
}
public String getNomeEscola() {
	return nomeEscola;
}
public void setNomeEscola(String nomeEscola) {
	this.nomeEscola = nomeEscola;
}
public String getSerieMatriculado() {
	return serieMatriculado;
}
public void setSerieMatriculado(String serieMatriculado) {
	this.serieMatriculado = serieMatriculado;
}
public String getRegistroGeral() {
	return registroGeral;
}
public void setRegistroGeral(String registroGeral) {
	this.registroGeral = registroGeral;
}


//M�todo que retorna a m�dia do aluno//
public double getMediaNota() {
	double somaNotas = 0.0;
	for (Disciplina disciplina : disciplinas)
		somaNotas += disciplina.getNota();
	return somaNotas / disciplinas.size();
}

//M�todo que retorna true para aprovado e false para reprovado//
public boolean getAlunoAprovado() {
	double media = this.getMediaNota();
	if (media >= 70) { //Aprovado//
		return true;
	}else {
		return true;//Reprovado//
	}
}

public String getAlunoAprovado2() {
	double media = this.getMediaNota();
	if (media >= 50) {
		if (media >=70) {
			return StatusAluno.APROVADO;
		}else {
			return StatusAluno.RECUPERACAO;
		}
		
	}else {
		return StatusAluno.REPROVADO;
	}
}



@Override
public String toString() {
	return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
			+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
			+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
			+ serieMatriculado + ", disciplina=" +"]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((nome == null) ? 0 : nome.hashCode());
	result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Aluno other = (Aluno) obj;
	if (nome == null) {
		if (other.nome != null)
			return false;
	} else if (!nome.equals(other.nome))
		return false;
	if (numeroCpf == null) {
		if (other.numeroCpf != null)
			return false;
	} else if (!numeroCpf.equals(other.numeroCpf))
		return false;
	return true;
}

@Override //Indentifica m�todo sobreescrito//
public boolean pessoaMaiorIdade() {
	
	return idade >= 21;
}

public String msgMaiorIdade() {
	return this.pessoaMaiorIdade() ? "Obaa aluno � maior de idade" : "Ixii vc � menor de idade";
}

@Override
public double salario() {
	// TODO Auto-generated method stub
	return 1500.90;
}
}


