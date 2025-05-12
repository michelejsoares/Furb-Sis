import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
        new Uni6Exe05();
    }
    private int respostasR[] = new int[5], respostasM[] = new int[5], somaS = 0, somaN = 0, somaI = 0;
    private String perguntas[] = new String[5];

    private Uni6Exe05(){
        perguntas();
        respostas();
        contagem();
    }
    private void perguntas(){
        perguntas[0] = "Gosta de música sertaneja?";
        perguntas[1] = "Gosta de futebol?";
        perguntas[2] = "Gosta de seriados?";
        perguntas[3] = "Gosta de redes sociais?";
        perguntas[4] = "Gosta da Oktoberfest?";
    }
    private void respostas(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println(perguntas[i]+" 1 - SIM; 2 - NAO; 3 - IND (Indiferente)");
            respostas[i] = sc.nextInt();
        }
        sc.close();
    }

    private void contagem(){
        for(int i = 0; i < 5; i++){
            if(respostas[i] == 1){
                somaS++;
            }else if(respostas[i] == 2){
                somaN++;
            }else{
                somaI++;
            }
        }
    }
}
