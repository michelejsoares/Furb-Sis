public class Uni5Exe02 {
	public static void main(String[] args) {
		int somaPar = 0, somaImpar = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 0){
				somaPar += i;
			}else{
				somaImpar += i;
			}
		}
		System.out.println("Soma dos numeros pares: "+somaPar);
		System.out.println("Soma dos numeros ímpares: "+somaImpar);
	}
}
