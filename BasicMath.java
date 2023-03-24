package dsa.practic;

import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            char ch2;
            do {
                System.out.println("Enter   two int:");
                int no1 = kb.nextInt();
                int no2 = kb.nextInt();
                System.out.println("The sum is:" + (no1 + no2));
                System.out.println("Do you wanna to repeat this operation(y/n):");
                 ch2 = kb.next().charAt(0);
                System.out.println("Thank you!!!!!!!!!!!!!!");
            }while(ch2=='y');

    }
}
