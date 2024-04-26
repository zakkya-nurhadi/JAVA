public class Array2D {
    public static void main(String[] args) {
        
        // membuat array 2d
        int[][] a = {
        {1, 2, 3},
        {4, 5, 6, 9},
        {7},
        };
        
        // hitung panjang setiap baris array
        System.out.println("Panjang baris ke-1: " + a[0].length);
        System.out.println("Panjang baris ke-2: " + a[1].length);
        System.out.println("Panjang baris ke-3: " + a[2].length);
    }
}