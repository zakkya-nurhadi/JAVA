import java.util.Scanner;

public class TebakHuruf {
    public static void main(String[] args) {
        char hurufAcak = generateRandomChar();

        System.out.println("Selamat datang dalam permainan tebak huruf!");
        System.out.println("Silakan masukkan huruf tebakan:");

        Scanner scanner = new Scanner(System.in);
        char hurufTebakan = scanner.next().charAt(0);

        while (hurufTebakan != hurufAcak) {
            System.out.println("Maaf, Anda salah. Silakan coba lagi.");
            System.out.println("Masukkan huruf tebakan:");
            hurufTebakan = scanner.next().charAt(0);
        }

        System.out.println("Selamat! Anda benar. Huruf yang benar adalah: " + hurufAcak);

        scanner.close();
    }

    private static char generateRandomChar() {
        // Menghasilkan huruf acak antara 'a' dan 'z'
        return (char) ('a' + Math.random() * ('z' - 'a' + 1));
    }
}
