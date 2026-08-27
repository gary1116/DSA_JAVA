package EASY;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class findUnique {

    public static int findUniqueValue(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
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

        int unique=findUniqueValue(arr);

        System.out.println("the unique amongst duplicate is:- "+unique);
    }
}
