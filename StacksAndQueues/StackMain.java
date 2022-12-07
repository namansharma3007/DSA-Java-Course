package StacksAndQueues;

public class StackMain {
    public static void main(String[] args) throws StackException {
        // CustomStack stack = new CustomStack(5);

        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        // stack.push(5);
        

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());


        DynamicStack dstack = new DynamicStack(5);

        dstack.push(1);
        dstack.push(2);
        dstack.push(3);
        dstack.push(4);
        dstack.push(5);
        dstack.push(6);
        dstack.push(7);
        dstack.push(8);

        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());
        System.out.println(dstack.pop());

    }
}
