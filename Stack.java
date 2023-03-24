package dsa.stackdemo2;

public class Stack {
    private int [] arr;
    private int tos;
    private int size;
    public Stack(int size){
        arr=new int[size];
        tos=-1;
        this.size=size;
    }
    public void push(int x){
        if(tos==size-1) {
            StackException obj=new StackException("Stack Overflow");
            throw obj;

        }

        tos++;
        arr[tos]=x;
    }
    public int pop(){
        if(tos==-1)
            throw new StackException("Stack Underflow");

        int x=arr[tos];
        --tos;
        return x;
    }
    public int peek(){
        if(tos==-1){
            throw new  StackException("Stack Underflow");

        }
        int x=arr[tos];
        return x;
    }
}

