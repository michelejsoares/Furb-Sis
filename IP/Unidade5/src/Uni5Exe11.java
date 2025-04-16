public class Uni5Exe11 {
    public static void main(String[] args) {
        int total = 0, quebrados = 1;

        for (int i = 1; i <= 16; i++) {
            total += quebrados;
            quebrados *= 3;
        }
        System.out.println("Biscoitos quebrados: "+total);
    }
}
