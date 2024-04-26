public class ifElseIfStatement {
    public static void main(String[] args) {
        var nilai = 80;
        var absen = 70;

        if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70 && absen >= 70){
            System.out.println("Nilai Anda B");
        } else if (nilai >= 70 && absen >= 70){
            System.out.println("Nilai Anda C");
        } else if (nilai >= 70 && absen >= 70){
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }
    }
}
