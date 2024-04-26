public class TipeDataNumber {
    public static void main(String[] args) {
        
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000000;
        Long iniLong = 1000000000L;
        Long iniLong2 = 1000000000000000000L;

        float iniFloat = 10.10f;
        double iniDouble = 10.10;

        int decimalInt = 34;
        int hexaDecimal = 0xffffff;
        int binaryDecimal = 0b10101010;

        int amount = 1_000_000_000;

        System.out.println("ini byte: " + iniByte);
        System.out.println("ini short: " + iniShort);
        System.out.println("ini int: " + iniInt);
        System.out.println("ini long: " + iniLong);
        System.out.println("ini long2: " + iniLong2);
        System.out.println("ini float: " + iniFloat);
        System.out.println("ini double: " + iniDouble);
        System.out.println("ini decimalInt: " + decimalInt);
        System.out.println("ini hexaDecimal: " + hexaDecimal);
        System.out.println("ini binaryDecimal: " + binaryDecimal);
        System.out.println("ini amount: " + amount);
    }          
}
