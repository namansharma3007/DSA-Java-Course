package OOPS.Singleton;


// A class in which we can create only one object
public class Singleton {
    
    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance(){
        // check weather 1 Object is created or not
        if(instance == null){
            instance = new Singleton();
        }

        return instance; 
    }
}
