public class kelipatan7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 && i % 2 == 0) {
                System.out.print(i);
                if (i != 98) {
                    System.out.print(" - ");
                }
            }
        }
    }
}
