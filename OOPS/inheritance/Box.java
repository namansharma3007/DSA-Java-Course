package OOPS.inheritance;

public class Box {
    double length;
    double height;
    double width;

    Box(){
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }

    //cube
    Box(double side){
        this.length = side;
        this.height = side;
        this.width = side;
    }

    //cuboid
    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(Box old){
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }

    public void information(){
        System.out.println("Running the box...");
    }
}
