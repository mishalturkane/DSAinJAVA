package dsa.AlgoForPostexp;

import java.util.Scanner;

public class UsePostfixExpresion {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);

            System.out.println("Please enter the valid postfix expression:");
            String exp = kb.next();
            PostfixExpresion post = new PostfixExpresion(exp);
            float res;
            res = post.evaluate();
            System.out.println("Result is: " + res);

    }
}
