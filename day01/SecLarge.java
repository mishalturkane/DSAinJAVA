package day01;

import java.util.Arrays;

public class SecLarge {

    public static void secLarge(int [] array){
        Arrays.sort(array);
        System.out.println(array[array.length-2]);
    }
    public static void main(String[] args) {
        int [] arr={112,23,4,45,1,2,3,4,5};
        secLarge(arr);
    }
}
