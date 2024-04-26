import java.util.Random;
import java.util.Scanner;

public class UlarTanggaDuaPemain {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int posisiPemain1 = 1;
        int posisiPemain2 = 1;
        int akhirPapan = 100;
        boolean giliranPemain1 = true;
        
        System.out.println("Selamat datang di permainan Ular Tangga!\n");
        System.out.println("Tujuan Anda adalah mencapai kotak nomor " + akhirPapan);
        
        while (posisiPemain1 < akhirPapan && posisiPemain2 < akhirPapan) {
            System.out.println("Giliran " + (giliranPemain1 ? "Pemain 1" : "Pemain 2") + ". Tekan 'L' untuk melempar dadu.");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("L")) {
                int lemparDadu = random.nextInt(6) + 1;
                if (giliranPemain1) {
                    posisiPemain1 += lemparDadu;
                    posisiPemain1 = periksaUlarDanTangga(posisiPemain1, akhirPapan);
                    System.out.println("Pemain 1 melempar dadu dan mendapatkan angka: " + lemparDadu);
                    System.out.println("Posisi Pemain 1 sekarang: " + posisiPemain1+"\n");
                } else {
                    posisiPemain2 += lemparDadu;
                    posisiPemain2 = periksaUlarDanTangga(posisiPemain2, akhirPapan);
                    System.out.println("Pemain 2 melempar dadu dan mendapatkan angka: " + lemparDadu);
                    System.out.println("Posisi Pemain 2 sekarang: " + posisiPemain2+"\n");
                }
                
                giliranPemain1 = !giliranPemain1; // Ganti giliran
                
                // Tunda untuk efek dramatis
                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            } else {
                System.out.println("Input tidak dikenali. Silakan coba lagi.");
            }
        }
        scanner.close();
        
        if (posisiPemain1 >= akhirPapan) {
            System.out.println("Selamat! Pemain 1 telah mencapai akhir papan dan memenangkan permainan!");
        } else {
            System.out.println("Selamat! Pemain 2 telah mencapai akhir papan dan memenangkan permainan!");
        }
    }
    
    private static int periksaUlarDanTangga(int posisi, int akhirPapan) {
        if (posisi > akhirPapan) {
            posisi = akhirPapan - (posisi - akhirPapan); // Jika melebihi akhir, mundur
        }
        
        // Contoh sederhana untuk tangga dan ular
        switch (posisi) {
            case 8:
                posisi = 15; // Tangga ke atas
                System.out.println("Anda menemukan tangga! Naik ke kotak " + posisi);
                break;
            case 16:
                posisi = 6; // Ular ke bawah
                System.out.println("Oh tidak, Anda digigit ular! Turun ke kotak " + posisi);
                break;
            case 26:
                posisi = 5; // Ular ke bawah
                System.out.println("Oh tidak, Anda digigit ular! Turun ke kotak " + posisi);
                break;
            case 34:
                posisi = 1; // Ular ke bawah
                System.out.println("Oh tidak, Anda digigit ular! Kembali ke start!");
                break;
            case 47:
                posisi = 19; // Ular ke bawah
                System.out.println("Oh tidak, Anda digigit ular! Turun ke kotak " + posisi);
                break;
            }
        return posisi;
    }
}