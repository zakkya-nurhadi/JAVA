public class ArraySumAverage {
    public static void main(String[] args) {
    
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;
        
        // mengakses semua elemen menggunakan for each Loop
        // jumlahkan nilai setiap elemen dan simpan di variabel sum
        for (int number: numbers) {
        sum += number;
        
        // dapatkan banyak elemen di dalam array
        int arrayLength = numbers.length;
        
        // hitung rata-rata
        // konversi tipe data average dari int ke double
        average = ((double)sum / (double)arrayLength);
        System.out.println("sum = " + sum);
        System.out.println("Average = " + average);
        }
    }
}