package EASY;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LinearSearch {

    public static int searchValue(int arr[],int value){
        int k=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                k=i;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len=sc.nextInt();
        System.out.println("Enter the value:-");
        int arr[]= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();
        System.out.println("which value yuo wanty to find:-");
        int value=sc.nextInt();

        int k=searchValue(arr,value);
        System.out.println("the value is at index:- "+k);
    }
}
