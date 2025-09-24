package Questao1;

public class Aluno {
	private int matricula;
	private String nome;
	private double notaEnem;
	
	public Aluno(String nome, int matricula, double notaEnem) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaEnem = notaEnem;
    }
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNotaEnem() {
		return notaEnem;
	}
	public void setNotaEnem(double notaEnem) {
		this.notaEnem = notaEnem;
	}
}
