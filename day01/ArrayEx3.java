package day01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        int [] arr=new int [5];
        Scanner kb=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter "+(i+1)+" Number");
            arr[i]=kb.nextInt();
        }
        for(int x:arr){
            System.out.println(x);
        }
    }
}
