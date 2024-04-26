import java.util.Scanner;

public class gajiKaryawanPTABC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data karyawan
        System.out.print("Masukkan nama karyawan: ");
        String namaKaryawan = input.nextLine();
        System.out.print("Masukkan golongan karyawan (A/B/C/D): ");
        String golonganKaryawan = input.next().toUpperCase();
        System.out.print("Masukkan jumlah jam kerja selama seminggu: ");
        double jamKerja = input.nextDouble();
        System.out.println("=======================================================\n");
        input.close();

        // Upah per jam berdasarkan golongan
        int upahPerJam;
        switch (golonganKaryawan) {
            case "A":
                upahPerJam = 4000;
                break;
            case "B":
                upahPerJam = 5000;
                break;
            case "C":
                upahPerJam = 6000;
                break;
            case "D":
                upahPerJam = 7500;
                break;
            default:
                throw new IllegalArgumentException("Golongan tidak valid: " + golonganKaryawan);
            
        }

        // Jumlah jam kerja normal dan upah lembur
        int jamNormal = 48;
        int upahLembur = 3000;

        // Menghitung upah
        double gaji;
        if (jamKerja > jamNormal) {
            double upahNormal = jamNormal * upahPerJam;
            double upahLemburTotal = (jamKerja - jamNormal) * upahLembur;
            gaji = upahNormal + upahLemburTotal;
        } else {
            gaji = jamKerja * upahPerJam;
        }

        // Menampilkan hasil
        System.out.println("Gaji mingguan untuk " + namaKaryawan + " adalah: Rp " + gaji);
        
    }
}
