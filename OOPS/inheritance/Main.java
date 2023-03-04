package OOPS.inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box1 = new Box(4,5,6);
        // Box box2 = new Box(box1);

        // System.out.println(box1.length+" "+box1.width+" "+box1.height);

        // BoxWeight box3 = new BoxWeight();
        // BoxWeight box4 = new BoxWeight(2,3,4,5);

        // System.out.println(box3.length+" "+box3.width+" "+box3.height+" "+box3.weight);

        // System.out.println(box4.length+" "+box4.width+" "+box4.height+" "+box4.weight);



        Box box5 = new BoxWeight(2,3,4,5);

        // reference variable will decide which all type of variables we access
        // here reference variable is of type Box and reference object if of type BoxWeight
        // weight is initialized but we wont be able to access it but we will be able to access it
        // we would only be able to access variable of reference variables of Box
        System.out.println(box5.length);


    }
}
