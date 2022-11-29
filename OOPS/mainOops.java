package OOPS;
import java.util.Arrays;

// create own datatype using class

public class mainOops {
    public static void main(String[] args) {
        // store 5 roll nos
        int [] numbers = new int[5];

        // store 5 names
        String [] names = new String[5];

        // data of 5 students: {roll no, name, marks}

        int [] rollno = new int[5];
        String[] name = new String [5];
        float[] marks = new float[5];

        Student[] students;
        students = new Student[5]; // dynamically allocates memory & returns a reference to it and this reference is stored in variable;

        Student naman = new Student(21, "Vijyant rana", 78.f);

        // naman.rollno = 4;
        // naman.name = "Naman Sharma";
        // naman.marks = 45.5f;

        // naman.changeName("Rahul");
        // naman.greeting();

        // System.out.println(naman.rollno);
        // System.out.println(naman.name);
        // System.out.println(naman.marks);


        // Student random = new Student(naman);
        // System.out.println(random.name);

        Student anyone = new Student();
        // System.out.println(anyone.name);


        Student one = new Student();

        Student two = one;

        one.name = "Something Something";

        System.out.println(two.name);
    }
}

//create a class
// for every single student
class Student{
    int rollno;
    String name;
    float marks = 90.7f;

    void greeting(){
        System.out.println("Good Morning..." + this.name);
    }

    // we need a way to add values of the above
    // properties object by object

    // we need one word to access every object

    void changeName(String name){
        this.name = name;
    }

    Student (Student other){
        this.rollno = other.rollno;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student(){
        // this is how you call a constructor from another constructor
        // internally: new Student(13,"default person",100.0f);
        this(13,"default person",100.0f);
    }

    Student(int roll, String naam, float marksNo){
        this.rollno = roll;
        this.name = naam;
        this.marks = marksNo;
    }


    
}