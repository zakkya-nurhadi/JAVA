import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Membaca input bilangan dari pengguna
            System.out.print("Masukkan bilangan (0 untuk keluar): ");
            int bilangan = scanner.nextInt();

            // Keluar dari program jika pengguna memasukkan 0
            if (bilangan == 0) {
                System.out.println("Terima kasih, program berhenti.");
                break;
            }

            // Menentukan apakah bilangan ganjil atau genap
            if (bilangan % 2 == 0) {
                System.out.println("Genap");
            } else {
                System.out.println("Ganjil");
            }
        }

        // Menutup scanner setelah pengguna keluar dari program
        scanner.close();
    }
}
