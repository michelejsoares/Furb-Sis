package com.exemplo.ExemploArrayList;
public class Aluno {

	private String nome;
    private int matricula;
    private Turno turno;
    
    public Aluno(String nome, int matricula, Turno turno) {
        setNome(nome);
        setMatricula(matricula);
        setTurno(turno);
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        if (turno == null) {
            throw new IllegalArgumentException("Turno eh invalido");
        }
        this.turno = turno;
    }

}
