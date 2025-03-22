import java.util.Scanner;

public class Uni4Exe16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idadeH1 = 0, idadeH2 = 0, idadeM1 = 0, idadeM2 = 0, idadeHV = 0, idadeHN = 0, idadeMV = 0, idadeMN = 0, soma = 0 , produto = 0;
		System.out.print("Idade dos homens: ");
		idadeH1 = sc.nextInt();
		idadeH2 = sc.nextInt();
		System.out.print("Idade das mulheres: ");
		idadeM1 = sc.nextInt();
		idadeM2 = sc.nextInt();
		if(idadeH1 > idadeH2){
			idadeHV = idadeH1;
			idadeHN = idadeH2;
		}else{
			idadeHV = idadeH2;
			idadeHN = idadeH1;
		}
		if(idadeM1 > idadeM2){
			idadeMV = idadeM1;
			idadeMN = idadeM2;
		}else{
			idadeMV = idadeM2;
			idadeMN = idadeM1;
		}
		soma = idadeHV + idadeMN;
		produto = idadeHN * idadeMV;
		System.out.println("Soma: "+soma);
		System.out.println("Produto: "+produto);
		sc.close();
	}
}
