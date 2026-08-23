package EASY;

import java.util.Scanner;
import java.util.stream.IntStream;

public class IsSorted {

    public static boolean sorted(int arr[]){
        if(arr.length==1)
            return true;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len=sc.nextInt();
        System.out.println("Enter the value:-");
        int arr[]= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        boolean isSort=sorted(arr);

        System.out.println("is it sorted?"+isSort);
    }
}
