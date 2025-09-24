package Questao1;

import java.util.ArrayList;

public class Turma {
	private String disciplina;
	private ArrayList<Aluno> alunos;
	private Professor professor;
	private Turno turno;
	
	public void setTurno(Turno turno) {
		this.turno = turno;
	}

    public Turma(String disciplina, Turno turno, Professor professor) {
    	this.disciplina = disciplina;
        this.turno = turno;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void incluirAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public Aluno obterAlunoMelhorNotaEnem() {
        if (alunos.isEmpty()) {
            return null;
        }
        Aluno melhor = alunos.get(0);
        for (Aluno a : alunos) {
            if (a.getNotaEnem() > melhor.getNotaEnem()) {
                melhor = a;
            }
        }
        return melhor;
    }
    
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public Turno getTurno() {
        return turno;
    }

    public Professor getProfessor() {
        return professor;
    }
}
