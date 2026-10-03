class Calculator {
    int num = 5;
    public  int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class stackAndheap {
    public static void main(String[] args){
        int data = 10;
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();

        int result1 = obj.add(4,5);

        System.out.println("Result 1: " + result1);

        obj.num = 8;

        System.out.println("obj.num: " + obj.num);
        System.out.println("obj1.num: " + obj1.num);
    }
    

}
