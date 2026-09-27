public class typeConversion {
    public static void main(String[] args) {

        byte b = 127;
        int a = b; // implicit conversion from byte to int
        System.out.println(b);
        System.out.println(a);

        byte b1 = 125;
        int a0 = b1; // implicit conversion from byte to int
        System.out.println(b1);
        System.out.println(a0);

        int aa = 257;
        byte k = (byte) aa; // explicit conversion from int to byte
        
        float f = 5.6f;
        int t = (int) f; // explicit conversion from float to int

        int a2 = 2567;
        byte b2 = (byte) a2; // explicit conversion from int to byte

        System.out.println(k);

        byte a3 = 10;
        byte b4 = 20;
        int tt = a * b;
        System.out.println(tt);
    }
}