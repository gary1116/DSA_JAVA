package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class High_Frequency {

    public static int highFrequency_check(int[] arr){
        int result=0;
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int value:arr){
            map.put(value,map.getOrDefault(value,0)+1);
        }
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
           if(entry.getValue()>max){
               max=entry.getValue();
               result=entry.getKey();
           }
       }
       return result;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len=sc.nextInt();
        System.out.println("Enter the value:-");
        int arr[]= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        int highFrequencyVal=highFrequency_check(arr);

        System.out.println("the number with highest frequency is :-"+highFrequencyVal);
    }
}
