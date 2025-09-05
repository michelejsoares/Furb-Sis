package com.exemplo.ExemploArrayList;

import java.util.ArrayList;

public class Turma {
	private String nome;
	private ArrayList<Aluno> alunos;
	
	public Turma(String nome) {
		setNome(nome);
		alunos = new ArrayList();
	}
	
	public void adicionarAluno(Aluno aluno) {
		if(aluno == null) {
			throw new IllegalArgumentException("Aluno Invalido");
		}
		alunos.add(aluno);
	}
	
	public ArrayList<Aluno> listar() {
		return alunos;
	}
	
	public Aluno buscarAluno(String nome) {
		for(Aluno aluno: alunos) {
			if(aluno.getNome().equalsIgnoreCase(nome)) {
				return aluno;
			}
		}
		return null;
	}
	
	public void removerAluno(Aluno aluno) {
		if(aluno == null) {
			throw new IllegalArgumentException("Aluno Invalido");
		}
		alunos.remove(aluno);
	}
	
	public void atualizarAluno(Aluno aluno) {
		Aluno antigoAluno = buscarAluno(aluno.getNome());
		if(antigoAluno == null) {
			throw new IllegalArgumentException("Aluno não Existe");
		}
		antigoAluno.setMatricula(aluno.getMatricula());
		antigoAluno.setTurno(aluno.getTurno());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
}
