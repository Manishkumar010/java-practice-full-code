class Calc 
{
    public int add(int a, int b) 
    {
        return a + b;
    }
    public  int sub(int n1, int n2)
    {
        return n1 - n2;
    }
}

 class AdvCalc extends Calc
{
    public int multi(int n1, int n2)
    {
        return n1 * n2;
    }
    public int div(int n1, int n2)
    {
        return n1 / n2;
    }
}

public class inheritance
{
    public static void main(String a[]){
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(10, 20);
        int r2 = obj.sub(20, 10);
        int r3 = obj.multi(10, 20);
        int r4 = obj.div(20, 10);

        System.out.println("Addition: " + r1);
        System.out.println("Subtraction: " + r2);
        System.out.println("Multiplication: " + r3);
        System.out.println("Division: " + r4);
    }
}