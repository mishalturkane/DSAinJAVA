package day01;

public class Largest {
    public static int getLargest(int[] arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int x: arr){
            if( max<x){
                max=x;
            }
            if(min>x){
                min=x;
            }
            sum=min+max;
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr={1,3,56,4};
        System.out.println( getLargest(arr));
    }
}
