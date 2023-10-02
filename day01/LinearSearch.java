package day01;

public class LinearSearch {
    public  static int linerSearch( int [] arr,int key){


           for(int i=0;i<arr.length;i++){
               if(arr[i]==key)
                   return i;
           }

        return -1;
    }

    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60};
        int key=40;
        int index=linerSearch(arr,key);
        if(index==-1){
            System.out.println("Key not present:");
        }
        else System.out.println("key is index at:"+index);
    }
}
