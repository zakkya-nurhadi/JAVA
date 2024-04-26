import java.util.Scanner;

public class gajiKaryawanPT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input
        System.out.print("Masukkan nama karyawan: ");
        String namaKaryawan= input.nextLine();
        System.out.print("Masukkan gaji pokok karyawan: ");
        double gajiPokok = input.nextDouble();
        // Menghitung
        double tunjangan = 0.2 * gajiPokok;
        double gajiKotor = gajiPokok + tunjangan;
        double pajak = 0.15 * gajiKotor;
        double gajiBersih = gajiKotor - pajak;
        // Output
        System.out.println("\n=====================================");
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Gaji bersih karyawan adalah: Rp" + gajiBersih);
        input.close();
    }
}
