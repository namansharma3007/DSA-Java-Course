package OOPS.inheritance;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight = -1;
    }
    BoxWeight(double weight){
        this.weight = weight;
    }
    public BoxWeight(int length, int width, int height, int weight) {
        // used to initialize values in parent class
        super(length, width, height);
        this.weight = weight;
    }
}
