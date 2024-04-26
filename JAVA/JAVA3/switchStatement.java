
public class switchStatement {
    public static void main(String[] args) {
    var nilai = "B";
        switch (nilai) {
        
        case "A":
            System.out.println("Wow, Anda Lulus Dengan Baik");
            break;
        case "B":
            System.out.println("Nilai Anda Baik");
            break;
        case "C":
            System.out.println("Nilai Anda Cukup Baik");
            break;
        case "D":
        case "E":
            System.out.println("Anda tidak Lulus");
            break;
        default:
            System.out.println("Mungkin Anda salah jurusan");
        }
    }
}