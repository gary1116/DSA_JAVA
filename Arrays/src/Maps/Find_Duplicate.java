package Maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Find_Duplicate {

    public static HashSet<Integer> findDuplicate(int [] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set=new HashSet<>();

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                set.add(entry.getKey());
            }
        }
        return set;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len=sc.nextInt();
        System.out.println("Enter the value:-");
        int arr[]= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        HashSet<Integer> set=findDuplicate(arr);
        System.out.println("the duplicate numbers are:- ");
        for(int num:set){
            System.out.println(num);
        }
    }
}
