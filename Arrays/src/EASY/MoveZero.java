package EASY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MoveZero {
    public static int[] moveZeroToEnd(int arr[]){
       int j=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               j++;
           }
       }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len=sc.nextInt();
        System.out.println("Enter the value:-");
        int arr[]= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        moveZeroToEnd(arr);
        Arrays.stream(arr).forEach(i->System.out.print(" "+i));

    }
}
