package EASY;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LeftRotateByD {

    public static int[] rotateD(int arr[],int D){

       int k=D%arr.length;
       int temp[]= new int[k];
       for(int i=0;i<k;i++){
           temp[i]=arr[i];

       }

       for(int i=k;i<arr.length;i++){
           arr[i-k]=arr[i];
       }

       for(int i=arr.length-k;i<arr.length;i++){
           arr[i]=temp[i-(arr.length-k)];
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
        System.out.println("How many places you want me to rotate the array to?:- ");
        int D=sc.nextInt();

        rotateD(arr,D);
        Arrays.stream(arr).forEach(i->System.out.print(" "+i));
    }
}
