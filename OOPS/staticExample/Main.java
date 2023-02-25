package OOPS.staticExample;

public class Main{
    public static void main(String[] args) {
        // Human naman = new Human(20, "Naman Sharma", 1000, false);
        // Human rahul = new Human(34, "Rahul Raja", 2000, true);
        // Human arpit = new Human(35, "Arpit Kumar", 3000, true);
        
        // // Wrong convention but will still work
        // System.out.println(rahul.population);
        // System.out.println(naman.population);
        // System.out.println(arpit.population);

        // // Correct convention it must be acessed with class variable
        // // Above one will also work but is not the correct method for working
        // System.out.println(Human.population);
        

    }
    // which is not static belongs to an object
    void greeting(){
        System.out.println("Hello world");
        fun();
    }

    static void fun(){
        // you can'y use this because it requires an instance
        // but the function you are using it in does not depends on instances
        // this will give you  an error
        // greeting();
        
        
        // you cannot access non-static stuff wothout referencing their instances in a static context
        // hence, here I an referencing
        Main obj = new Main();
        obj.greeting();

    }
}