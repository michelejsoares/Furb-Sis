package Questao1;

public class App {
    public static void main(String[] args) {
        Turma turma = new Turma("Sistemas De informação");

        Aluno a1 = new Aluno("Maria", 2025001, 720.5);
        Aluno a2 = new Aluno("João", 2025002, 680.0);
        Aluno a3 = new Aluno("Carla", 2025003, 725.5);

        turma.incluirAluno(a1);
        turma.incluirAluno(a2);
        turma.incluirAluno(a3);
        int nAluno = 1;
        System.out.println("Alunos na turma:");
        for (Aluno a : turma.getAlunos()) {
        	System.out.println("Aluno "+nAluno+": ");
            System.out.println("Nome: " + a.getNome()); 
            System.out.println("Matrícula: " + a.getMatricula());
            System.out.println("Nota ENEM: " + a.getNotaEnem());
            System.out.println("\n");
            nAluno++;
        }

        Aluno melhor = turma.obterAlunoMelhorNotaEnem();
        if (melhor != null) {
            System.out.println("\nAluno com melhor nota no ENEM:");
            System.out.println("Nome: " + melhor.getNome());
            System.out.println("Matrícula: " + melhor.getMatricula());
            System.out.println("Nota ENEM: " + melhor.getNotaEnem());
        }
    }
}
