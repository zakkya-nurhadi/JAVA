public class javatiga {
    public static void main(String[] args) {
        byte iniByte = 100;
        short iniShort = 1000;
        int inilnt = 10000000;
        Long iniLong = 1000000000L;
        Long iniLong2 = 10000000000000000L;

        float iniFloat = 10.10f;
        double iniDouble = 10.10;

        int decimalint = 34;
        int hexaDecimaL = 0xffffff;
        int binaryDecimaL = 0b10101010;

        int amount = 1_000_000_000;

        System.out.println("ini byte: " + iniByte);
        System.out.println("ini short: " + iniShort);
        System.out.println("ini int: " + inilnt);
        System.out.println("ini long: " + iniLong);
        System.out.println("ini long2: " + iniLong2);
        System.out.println("ini float: " + iniFloat);
        System.out.println("ini double: " + iniDouble);
        System.out.println("ini decimalint: " + decimalint);
        System.out.println("ini hexaDecimal: " +hexaDecimaL);
        System.out.println("ini binaryDecimal: " + binaryDecimaL);
        System.out.println("ini amount: " + amount);
    }
}