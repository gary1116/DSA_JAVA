package EASY;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MajorityElement {

    public static int majority(int[] arr){
        int halfLen=arr.length/2;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>halfLen){
                return arr[i];
            }
        }
        return -1;

    }

    public static int majority2(int[] arr){
        HashMap<Integer,Integer> map= new HashMap<>();
        int halfLen=arr.length/2;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>=halfLen){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len = sc.nextInt();
        System.out.println("Enter the numbers:-");

        int [] arr= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        int num=majority(arr);

        majority2(arr);

       System.out.println("The majority element is :- "+num);

    }
}
