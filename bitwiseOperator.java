public class bitwiseOperator {
    public static void main(String[] args){
        int a=20,b=30;
        System.out.println(a | b); // 11110 -> 30
        System.out.println(a & b); // 10100 -> 20
        System.out.println(a ^ b); // 01010 -> 10

        System.out.println(~a);
        System.out.println(~b);

        System.out.println(a<<1); // 40
        System.out.println(a<<2); // 80

        System.out.println(b>>1); // 15
        System.out.println(b>>2); // 7
    }
}
