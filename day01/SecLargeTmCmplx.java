package day01;
public class SecLargeTmCmplx {

    public static int secLarge(int [] array) {

        int max,secMax;
        max=secMax=Integer.MIN_VALUE;
        for(int x: array){
            if (x > max) {
                secMax=max;
                max=x;
            }
            else {
                if(x>secMax)
                  secMax=x;
            }
        }
        return secMax;
    }
    public static void main(String[] args) {
        int [] arr={2,8,5,6,9};
        System.out.println(secLarge(arr));
    }
}
