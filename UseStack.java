package dsa.stackdemo1;

public class UseStack {
    public static void main(String[] args) {
        Stack s=new Stack(5);
        int x=10;
        for(int i=1;i<=100;i++){
            s.push(x);
            System.out.println("Pushed:"+x);
            x+=10;
        }
        System.out.println("Top element is:"+s.peek());
        for(int i=1;i<=5;i++){
            x=s.pop();
            System.out.println("Poped :"+x);
        }
    }
}
