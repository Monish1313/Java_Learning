class Person {
    
    // Step 1: Private variables (hidden data)
    private String name;
    private int age;

    // Step 2: Public getter and setter methods
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age > 0) {              // validation logic
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
}

public class T17_Encapsulation {
    public static void main(String[] args) {
        
        Person p = new Person();
        
        p.setName("Monish");
        p.setAge(25);
        
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
