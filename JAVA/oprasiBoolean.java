public class oprasiBoolean {
    public static void main(String[] args) {
        var absen = 59;
        var nilaiAkhir = 60;
        boolean lulusAbsen = absen >= 70;
        boolean lulusNilai = nilaiAkhir >= 70;
        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}
