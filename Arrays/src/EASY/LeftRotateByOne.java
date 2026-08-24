package EASY;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LeftRotateByOne {

    public static int [] rotateOne(int arr[]){
        int first=arr[0];

        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
        return  arr;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len=sc.nextInt();
        System.out.println("Enter the value:-");
        int arr[]= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        rotateOne(arr);
        Arrays.stream(arr).forEach(i->System.out.print(" "+i));

    }
}
