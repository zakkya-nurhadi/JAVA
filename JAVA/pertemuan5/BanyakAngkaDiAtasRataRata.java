import java.util.Scanner;

public class BanyakAngkaDiAtasRataRata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyak angka: ");
        int n = scanner.nextInt();

        int[] angka = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("angka ke-" + (i + 1) + ": ");
            angka[i] = scanner.nextInt();
        }

        // Menghitung rata-rata
        double rataRata = 0;
        for (int nilai : angka) {
            rataRata += nilai;
        }
        rataRata /= n;

        // Menghitung berapa banyak angka di atas rata-rata
        int jumlahDiAtasRataRata = 0;
        for (int nilai : angka) {
            if (nilai > rataRata) {
                jumlahDiAtasRataRata++;
            }
        }

        // Mencetak hasil
        System.out.println("Rata-rata = " + rataRata);
        System.out.println("Banyak angka di atas rata-rata ada " + jumlahDiAtasRataRata);

        scanner.close();
    }
}
