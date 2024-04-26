import java.util.Scanner;

public class BubbleSortUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah yang akan di urutkan: ");
        int n = scanner.nextInt();
        char[] alphabet = new char[n];

        System.out.println("Masukkan karakter huruf abjad:");
        for (int i = 0; i < n; i++) {
            alphabet[i] = scanner.next().charAt(0);
        }

        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (alphabet[j] > alphabet[j + 1]) {
                    // swap temp and alphabet[j]
                    char temp = alphabet[j];
                    alphabet[j] = alphabet[j + 1];
                    alphabet[j + 1] = temp;
                }
            }
        }

        // Tampilkan hasil sorting
        System.out.println("Hasil sorting:");
        for (char c : alphabet) {
            System.out.print(c + " ");
        }
        scanner.close();
    }
}
