import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, idade = 0, qtdAlunosMais20 = 0;
        String nome, nome18 = null, virgula = null;
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Nome:");
            nome = sc.next();
            System.out.println("Idade:");
            idade = sc.nextInt();
            if(idade > 20){
                qtdAlunosMais20++;
            }else{
                if(nome18 == null){
                    if(virgula == null){
                        nome18 = nome;
                    }
                }else{
                    nome18 += virgula + nome;
                }
            }
            virgula = " e ";
        }
        System.out.println("Nomes dos alunos que tem 18 anos: "+nome18);
        System.out.println("Quantidade de alunos que tem idade acima de 20 anos: "+qtdAlunosMais20);

        sc.close();
    }
}
