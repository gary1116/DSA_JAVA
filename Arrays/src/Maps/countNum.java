package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countNum {
    public static HashMap<Integer,Integer> countingFrequency(int [] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of array:-");
        int len= sc.nextInt();
        System.out.println("enter the values of array:-");
        int [] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map=countingFrequency(arr);

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }

    }


}
