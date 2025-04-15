public class extra {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i != 0 && i < 2){
                    if(j == 0){
                        System.out.println(); 
                    }
                }
                if(i != 2){
                    if(j < 2){
                        System.out.print("_|");
                    }else{
                        System.out.print("_");
                    }
                }else{
                    if(j == 0){
                        System.out.println(" ");
                    }else{
                        System.out.print("|");
                    }
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) { // Colunas
                if (i < 2) {
                    // Para as duas primeiras linhas, desenha com "_|"
                    if (j < 2) {
                        System.out.print("_|");
                    } else {
                        System.out.print("_"); // Último elemento da linha (sem "|")
                    }
                } else {
                    // Última linha, desenha com " |"
                    if (j < 2) {
                        System.out.print(" |");
                    } else {
                        System.out.print(" "); // Último elemento da linha (sem "|")
                    }
                }
            }
            System.out.println(); // Quebra de linha no final de cada linha
        }
    }
}
