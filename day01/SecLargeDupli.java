package day01;

import java.util.Arrays;

public class SecLargeDupli {

    public static int secLarge(int [] array){
        Arrays.sort(array);
      for(int i= array.length-1;i>0;i--){
          if(array[i]!=array[i-1])
             return  array[i-1];
      }
        return Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        int [] arr={2,2,2,2,6,9};
        System.out.println(secLarge(arr));
    }
}
