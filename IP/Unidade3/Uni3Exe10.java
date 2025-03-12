import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat();
        int catetoO = 0, catetoA = 0;
        double  somaCateto = 0.0, total = 0.0;
        System.out.println("Cateto oposto:");
        catetoO = sc.nextInt();
        System.out.println("Cateto adjacente:");
        catetoA = sc.nextInt();
        somaCateto = Math.pow(catetoO, 2) + Math.pow(catetoA, 2);
        total = Math.sqrt(somaCateto);
        System.out.println("A hipotenusa é: "+df_2.format(total));
        sc.close();
    }
}
