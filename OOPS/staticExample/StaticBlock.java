package OOPS.staticExample;

// this is demo to shiow initialization of static variables
public class StaticBlock {
    static int a = 4;
    static int b;


    // this will run as soon as an object is created of this class
    // will only run once, when the first obj is created i.e when the class is loaded for the first time
    static{
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock block = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        
        StaticBlock.b+=3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        
    }
}
