class BoolNotDemo {
public static void main(String[] args){
int x = 2;
int y = 1;
boolean bl;
bl = !(x > y); // bl salah
System.out.println("x is not greater than y:"+bl);
bl = !(y > x); // bl benar
System.out.println("y is not greater than x:"+bl);
}
}