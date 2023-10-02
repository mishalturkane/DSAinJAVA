package day01;

public class SwapAssi {
    public static void swapAssi(int [] arr){
        for(int i=0;i<arr.length-2;i=i+2){
            int temp;
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={2,3,4,5,6,7,1};
        swapAssi(arr);
    }
}
