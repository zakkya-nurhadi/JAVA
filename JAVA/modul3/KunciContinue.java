public class KunciContinue {
    public static void main(String[] args) {
            System.out.println("Cetak Bilangan Ganjil");
            for (var counter = 1; counter <= 20; counter++) {
            if (counter % 2 == 0) {
            continue;
            }
            
            System.out.print(counter + "\t");
        }
    }
}