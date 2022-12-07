package StacksAndQueues;

public class DynamicStack extends CustomStack {
    public DynamicStack(){
        super(); // this willc call CustomStack();
    }

    
    public DynamicStack(int size){
        super(size); // this willc call CustomStack(int size);
    }

    @Override
    public boolean push(int item) throws StackException{
        // this takes care of it being full
        if(this.isFull()){
            // double the array size
            int [] temp = new int[data.length * 2];

            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            //or
            // System.arraycopy(data, 0, temp, 0, data.length);


            data = temp;
        }

        //at this point we lnow tjat array is not full
        // insert item normally

        return super.push(item);
    }
}
