package Medium;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LongestSequence {

    public static int checkSequence(int []arr){
        int count=0;
        int max=0;

        HashMap<Integer,Integer> map= new HashMap();
        for(int val:arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i]-1)){
                int current=arr[i];
                count=1;
                while(map.containsKey(current+1)){
                    current++;
                    count++;
                }
                max=Math.max(count,max);
            }
        }

        return max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("mention the length of array");
        int len= sc.nextInt();

        int [] arr= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        int count=checkSequence(arr);
        System.out.println("teh longest sequence is of numbers:-"+count);

    }
}
