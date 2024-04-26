public class array12 {
    public static void main(String[] args) {
        // Contoh Array 1 Dimensi
        int[] arraySatuDimensi = {1, 2, 3, 4, 5};
        
        // Menampilkan elemen array 1 dimensi
        System.out.println("Array 1 Dimensi:");
        for (int i = 0; i < arraySatuDimensi.length; i++) {
            System.out.println("Elemen ke-" + i + ": " + arraySatuDimensi[i]);
        }
        
        // Contoh Array 2 Dimensi
        int[][] arrayDuaDimensi = {
            {1, 2, 3}, // Baris 0
            {4, 5, 6}, // Baris 1
            {7, 8, 9}  // Baris 2
        };
        
        // Menampilkan elemen array 2 dimensi
        System.out.println("\nArray 2 Dimensi:");
        for (int baris = 0; baris < arrayDuaDimensi.length; baris++) {
            for (int kolom = 0; kolom < arrayDuaDimensi[baris].length; kolom++) {
                System.out.println("Elemen [" + baris + "][" + kolom + "]: " + arrayDuaDimensi[baris][kolom]);
            }
        }
    }
}
