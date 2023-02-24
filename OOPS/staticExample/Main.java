package OOPS.staticExample;


public class Main{
    public static void main(String[] args) {
        Human naman = new Human(20, "Naman Sharma", 1000, false);
        Human rahul = new Human(34, "Rahul Raja", 2000, true);
        Human arpit = new Human(35, "Arpit Kumar", 3000, true);
        

        // Wrong convention but will still work
        System.out.println(rahul.population);
        System.out.println(naman.population);
        System.out.println(arpit.population);

        // Correct convention it must be acessed with class variable
        // Above one will also work but is not the correct method for working
        System.out.println(Human.population);


    }
}