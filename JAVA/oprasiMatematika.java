public class oprasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println("\nOperator Matematikan\n");
        System.out.println("a + b: " +(a+b));
        System.out.println("a - b: " + (a-b));
        System.out.println("a * b: " + (a*b));
        System.out.println("a / b: "+(a/b));
        System.out.println("a % b: "+(a%b));

        System.out.println("\nOperator Augmented\n");
        int c = 100;

        c += 10;
        System.out.println("c +=: " +c);
        c -= 10;
        System.out.println("c -=: " +c);
        c *= 10;
        System.out.println("c *=: " +c);
        c /= 10;
        System.out.println("c /=: " +c);
        c %= 10;
        System.out.println("c %=: " +c);

        System.out.println("\nOperator Increment dan Decrement\n");
        int d = 100;

        d ++;
        System.out.println("d++: "+d);
        d --;
        System.out.println("d--: "+d);

    }
}
