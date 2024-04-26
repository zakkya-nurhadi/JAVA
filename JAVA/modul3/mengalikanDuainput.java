import java.util.Scanner;

public class mengalikanDuainput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        int num1 = scanner.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int num2 = scanner.nextInt();

        int result = 0;
        boolean isNegative = num1 < 0 ^ num2 < 0;

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        for (int i = 0; i < num2; i++) {
            result += num1;
        }
        scanner.close();

        System.out.println("Hasil perkalian: " + (isNegative ? -result : result));
    }
}
