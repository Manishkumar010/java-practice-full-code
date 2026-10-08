class Human {

    // int age
    // private int age = 11;
    private int age;
    // String name;
    // private String name = "John Doe";
    private String name;

    // getter age 
    public  int getAge()
    {
        return age;
    };

    // setter age
    public void setAge(int a)
    {
        age = a;
    }

    // getter name
    public String getName()
    {
        return name;
    }

    // setter name
    public void setName(String n)
    {
        name = n;
    }
}

public class encapsulation {
    
    public static void main(String[] args) {
        Human h = new Human();
        h.setAge(25);
        h.setName("Alice");
        System.out.println("Age: " + h.getAge());
        System.out.println("Name: " + h.getName());
    }
}
