package dsa.stackdemo2;


public class UseStack {
    public static void main(String[] args) {
        Stack s=new Stack(5);
        int x=10;
        try{
            for(int i=1;i<=10;i++){
                s.push(x);
                System.out.println("Pushed:"+x);
                x+=10;
            }
        }
        catch(StackException ex){
            System.out.println(ex.getMessage());
        }

        try {
            for (int i = 1; i <= 6; i++) {
                x = s.pop();
                System.out.println("Popped:" + x);
            }
        }
        catch(StackException ex){
            System.out.println(ex.getMessage());
        }
    }
}
