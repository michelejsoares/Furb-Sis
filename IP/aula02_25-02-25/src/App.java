import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*int valor1 = 0;
        int valor2 = 0;
        int total = 0; 
        
        System.out.println("Informe o 1º valor: ");
        valor1 = sc.nextInt();
        System.out.println("Informe o 2º valor: ");
        valor2 = sc.nextInt();

        total = valor1 + valor2;
        System.out.println("O valor da soma é: "+total);*/

        /*float[] nota = new float[3];
        float soma = 0;
        float media = 0;
        int countNota = 1;

        for(int i = 0; i < 3; i++){
            System.out.println("A "+countNota+"ª nota é: ");
            nota[i] = sc.nextFloat();
            soma += nota[i];
            countNota++;
        }
        media = soma / 3;
        System.out.println("A media do aluno é: "+media);*/

        /*float n1 = 0;
        float n2 = 0;
        float n3 = 0;
        
        System.out.println("A primeira nota é: ");
        n1 = sc.nextFloat();
        System.out.println("A segunda nota é: ");
        n2 = sc.nextFloat();
        System.out.println("A terceira nota é: ");
        n3 = sc.nextFloat();

        float media = (n1+n2+n3) / 3;
        System.out.println("Media: "+media);*/

        /*float c1 = -8.78469475556f;
        float c2 = 1.61139411f;
        float c3 = 2.33854883889f;
        float c4 = -0.14611605f;
        float c5 = -0.012308094f;
        float c6 = -0.0164248277778f;
        float c7 = 0.002211732f;
        float c8 = 0.00072546f;
        float c9 = -0.000003582f;
        float t = 0;
        float h = 0;
        float sensacao = 0;

        System.out.println("Temperatura: ");
        t = sc.nextFloat();
        System.out.println("Umidade: ");
        h = sc.nextFloat();
        if(t < 27){
            System.out.println("Não é possível calcular a sensacao termica!");
            sc.close();
            return;
        }
        if(h < 40){
            System.out.println("Não é possível calcular a sensacao termica!");
            sc.close();
            return;
        }

        sensacao = (c1 + c2*t + c3*h + c4*t*h + c5*(t*t) + c6*(h*h) + c7*(t*t)*h + c8*t*(h*h) + c9*(t*t)*(h*h));

        System.out.println("Sensação térmica: " + sensacao);*/

        /*float largura = 0;
        float comprimento = 0;
        float area = 0;

        System.out.println("Informe a largura:");
        largura = sc.nextFloat();
        System.out.println("Informe o comprimento:");
        comprimento = sc.nextFloat();
        area = largura * comprimento;
        System.out.println("A area é : "+area);*/

        /*float pi = 3.1415f;
        float r = 0;
        double area = 0;

        System.out.println("Informe o raio:");
        r = sc.nextFloat();
        area = pi * Math.pow(r, 2);
        System.out.println("A area é: "+area);*/

        int numeroFuncionario = 0;
        int numeroHoras = 0;
        int valorHora = 0;
        int salario = 0;

        System.out.println("Numero funcionario: ");
        numeroFuncionario = sc.nextInt();
        System.out.println("Numero Horas: ");
        numeroHoras = sc.nextInt();
        System.out.println("Valor Horas: ");
        valorHora = sc.nextInt();
        
        salario = numeroHoras * valorHora;

        System.out.println("O Numero do funcionario é: "+numeroFuncionario+" e o Salario recebido é: "+salario);

        sc.close();

    }
}
