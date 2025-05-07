public class ExemploOrdenacao {
    public static void main(String[] args) {
        new ExemploOrdenacao();
    }
    private int numeros[] = {5,3,8,1,2};
    private ExemploOrdenacao(){
        ordenacao();
    }
    private void ordenacao(){
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros.length - 1 - i; j++){
                if(numeros[j] > numeros[j + 1]){
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j + 1] = temp;
                }
            }
        }
        String cVirgula = "";
        for(int i = 0; i < numeros.length; i++){
            System.out.print(cVirgula+numeros[i]);
            cVirgula = ", ";
        }
    }
}
