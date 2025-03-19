import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade1 = 0, idade2 = 0, idade3 = 0;
        idade1 = sc.nextInt();
        idade2 = sc.nextInt();
        idade3 = sc.nextInt();
        if(idade1 == idade2 && idade2 == idade3 && idade3 == idade1){
            System.out.println("TRIGÊMEOS");
        }else if (idade1 == idade2 || idade1 == idade3 || idade2 == idade3) {
            System.out.println("GÊMEOS");
        }else{
            System.out.println("APENAS IRMÃOS");
        }
        sc.close();
    }
}
