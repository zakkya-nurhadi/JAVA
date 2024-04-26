import java.util.Scanner;

public class hariDalamBulan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input
        System.out.print("Masukkan nomor bulan (1-12): ");
        int bulan = scanner.nextInt();
        System.out.print("Masukkan tahun: ");
        int tahun = scanner.nextInt();
        System.out.println("==========================================================\n");

        int[] hariDalamBulan = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Cek apakah tahun kabisat
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            hariDalamBulan[1] = 29; // Februari = 29 hari jika tahun kabisat
        }
        
        // Menampilkan jumlah hari dalam bulan yang dimasukkan
        System.out.println("Jumlah hari dalam bulan " + bulan + ", tahun " 
        + tahun + " adalah " + hariDalamBulan[bulan - 1] + " hari.");
        scanner.close();
    }
}
