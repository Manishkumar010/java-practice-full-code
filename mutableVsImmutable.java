public class mutableVsImmutable {
    public  static void main(String[] args){
        
        String name = new String();
        name = name+"John";
        System.out.println("hello " + name);

        String s1 = "navin;";
        String s2 = "navin";

        System.out.println(s1 == s2);
    }
}
