import java.util.Scanner;

public class deretBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int num = scanner.nextInt();

        System.out.print("Deret bilangan: " + num);
        do {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            System.out.print(" - " + num);
        } while (num != 1);
        scanner.close();

        System.out.println();
    }
}
