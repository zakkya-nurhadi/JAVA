import java.util.Random;
import java.util.Scanner;

public class UlarTangga {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int posisiPemain = 1;
        int akhirPapan = 100;
        
        System.out.println("Selamat datang di permainan Ular Tangga!");
        System.out.println("Tujuan Anda adalah mencapai kotak nomor " + akhirPapan);
        
        while (posisiPemain < akhirPapan) {
            System.out.println("Tekan 'L' untuk melempar dadu.");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("L")) {
                int lemparDadu = random.nextInt(6) + 1;
                posisiPemain += lemparDadu;
                if (posisiPemain > akhirPapan) {
                    posisiPemain = akhirPapan - (posisiPemain - akhirPapan); // Jika melebihi akhir, mundur
                }
                
                System.out.println("Anda melempar dadu dan mendapatkan angka: " + lemparDadu);
                System.out.println("Posisi Anda sekarang: " + posisiPemain);
                
                // Contoh sederhana untuk tangga dan ular
                if (posisiPemain == 8) {
                    posisiPemain = 15; // Tangga ke atas
                    System.out.println("Anda menemukan tangga! Naik ke kotak " + posisiPemain);
                } else if (posisiPemain == 26) {
                    posisiPemain = 5; // Ular ke bawah
                    System.out.println("Oh tidak, Anda digigit ular! Turun ke kotak " + posisiPemain);
                }
                
                // Tunda untuk efek dramatis
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            } else {
                System.out.println("Input tidak dikenali. Silakan coba lagi.");
            }
        }
        
        System.out.println("Selamat! Anda telah mencapai akhir papan dan memenangkan permainan!");
    }
}
