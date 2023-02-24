package OOPS;
// always initialize final keyword while declaring it 

public class WrapperExample {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 42;
        // Integer num = 45;

        Integer a = 34;
        Integer b = 85;

        swap(a, b);
        // System.out.println(a+" "+b);

        // final int  

       final A naman = new A("namam");
        naman.name = "other name";

        // when a non primitive in final, you can reassign it.
        // naman = new A("new Object"); // will throw an error

        A obj = new A("namanmnm");
        System.out.println(obj);

        for (int i = 0; i < 1000000000; i++) {
            obj = new A("random name");
        }
        
    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
    
}

class A{
    final int num = 10;
    String name;

    public A(String name){
        // System.out.println("Onject is created");
        this.name = name;
    }

    // @Override
    // protected void finalize() throws Throwable {
    //     // super.finalize();
    //     System.out.println("Object is destroyed");
    // }
}