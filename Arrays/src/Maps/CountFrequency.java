package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CountFrequency {

    public static void countingFrequency(int [] arr){
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i:arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println("the occurrence of "+entry.getKey()+" is "+entry.getValue());
        }
        map.forEach((key,value)->System.out.println("the occurrence of "+key+" is "+value));
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len = sc.nextInt();
        System.out.println("Enter the numbers:-");

        int [] arr= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();
        countingFrequency(arr);
    }
}
