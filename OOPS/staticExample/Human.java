package OOPS.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;


    static void message(){
        System.out.println("Message is I am static");
        // we cannot use this keyword inside static method
        // same as we cannot access non-static from static ones
        // System.out.println(this.age); //this will give me an error

    }
    public Human(int age, String name, int salary, boolean mariage){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1;
    }


    
}
