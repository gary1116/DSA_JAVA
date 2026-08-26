package EASY;

import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MissingNum {

    public static int missingNum(int arr[]){
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=1;i<=arr.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len=sc.nextInt();
        System.out.println("Enter the value:-");
        int arr[]= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        int num=missingNum(arr);
       System.out.println("the missing num from array is "+num);
    }
}
