public class konversiNumber {
    public static void main(String[] args) {
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 1000;
        int iniByte2 = (byte) iniInt2;

        System.out.println("Ini konversi dari iniByte ke iniShort lalu ke iniInt:" +iniInt);
        System.out.println("Ini konversi dari iniInt2 ke iniByte2:" +iniByte2);
    }
    
}
