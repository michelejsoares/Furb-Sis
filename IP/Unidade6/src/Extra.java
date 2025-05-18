public class Extra {
	public static void main(String[] args) {
		final int NUM = 4;
		int X[] = {1,2,3,4};
		int resultado = 0;
		for(int i =0; i < NUM; i++){
			resultado = 1;
			for(int j = 2; j<= i; j++){
				resultado *= X[j];
			}
		}
		System.out.print(resultado + " ");
	}
}
