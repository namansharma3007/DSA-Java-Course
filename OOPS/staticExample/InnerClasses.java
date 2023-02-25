package OOPS.staticExample;

// outside classes cannot be static 

// this will give an error
// static public class InnerClasses {

// class Test {
//     static String name;

//     public Test(String name) {
//         Test.name = name;
//     }
// }

public class InnerClasses {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // will throw an error
        // cannot refer a non static from a static one
        // Test a = new Test("Naman Sharma");

        // for it to work we need to declare the class as static

        Test a = new Test("Naman Sharma");
        Test b = new Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
