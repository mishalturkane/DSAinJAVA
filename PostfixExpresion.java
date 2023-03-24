package dsa.AlgoForPostexp;


import java.util.List;
import java.util.Stack;

public class PostfixExpresion {
    private static String postfix;

    public PostfixExpresion(String postfix) {
        this.postfix = postfix;
    }
    public static float evaluate(){
        Stack<Float> st=new Stack<Float>();
        float res;
        
        for(int i=0;i<postfix.length();i++){
             char ch=postfix.charAt(i);
             if(isOperand(ch)==true){
                 st.push((float)(ch-'0'));
             }
             else{
                        if(st.size()>=2) {
                            float op2 = st.pop();
                            float op1 = st.pop();
                            res = caluculate(op1, op2, ch);
                            st.push(res);
                        }
                        else {
                            System.out.println("Invalid postfix expresion");
                            return 0.0f;
                        }

             }
        }
        res=st.pop();
        return res;
    }
    public static  boolean isOperand(char ch){
        return ch>=48 && ch<=57;
    }
    public static float caluculate(float op1,float op2,char op){
        switch(op){
            case '+':
                return op1+op2;
            case '-':
                return op1-op2;
            case '*':
                return op1*op2;
            case '$':
                return (float)Math.pow(op1,op2);
            case '/':
                return op1/op2;
            case '%':
                return op1%op2;
            default: return 0.0f;
        }
    }
}
