package day01;

import java.util.Scanner;

class Reverse
{
    // Complete the function
    // str: input string
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str=kb.next();
        System.out.println(reverseWord(str));
    }
    public static String reverseWord(String str)
    {
         String s="";
     for(int i=str.length()-1;i>=0;i--){
         char ch=str.charAt(i);
         s=s+ch;
     }
        return  s;
    }
}