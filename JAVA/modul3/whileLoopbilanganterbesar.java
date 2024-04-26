import java.util.Scanner;

public class whileLoopbilanganterbesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan banyak bilangan: ");
        int n = scanner.nextInt();

        int largest = Integer.MIN_VALUE;
        int i = 1;
        while (i <= n) {
            System.out.print("Bil. ke-" + i + ": ");
            int num = scanner.nextInt();
            if (num > largest) {
                largest = num;
            }
            i++;
        }
        scanner.close();

        System.out.println("Bilangan terbesar: " + largest);
    }
}
