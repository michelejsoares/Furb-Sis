import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
        new Uni6Exe05();
    }
    private int respostasR[] = new int[5], respostasM[] = new int[5], somaI = 0;
    private String perguntas[] = new String[5];

    private Uni6Exe05(){
        perguntas();
        respostasR();
        respostasM();
        contagem();
    }
    private void perguntas(){
        perguntas[0] = "Gosta de música sertaneja?";
        perguntas[1] = "Gosta de futebol?";
        perguntas[2] = "Gosta de seriados?";
        perguntas[3] = "Gosta de redes sociais?";
        perguntas[4] = "Gosta da Oktoberfest?";
    }
    private void respostasR(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Resposta Rapaz:");
        for(int i = 0; i < 5; i++){
            System.out.println(perguntas[i]+" 1 - SIM; 2 - NAO; 3 - IND (Indiferente)");
            respostasR[i] = sc.nextInt();
        }
        sc.close();
    }

    private void respostasM(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Resposta Rapaz:");
        for(int i = 0; i < 5; i++){
            System.out.println(perguntas[i]+" 1 - SIM; 2 - NAO; 3 - IND (Indiferente)");
            respostasM[i] = sc.nextInt();
        }
        sc.close();
    }

    private void contagem(){
        for(int i = 0; i < 5; i++){
            if(respostasR[i] == respostasM[i]){
                somaI+= 3;
            }else if(respostasR[i] == 3 || respostasM[i] == 3){
                if(respostasR[i] == 1 || respostasR[i] == 2 || respostasM[i] == 1 || respostasM[i] == 2){
                    somaI+= 1;
                }
            }
        }
    }
}
