package Maps;

import java.util.*;
import java.util.stream.IntStream;

public class FindCommon {

    public static List<Integer> findCommonAmong2Arr(int [] arr1, int [] arr2){
        List<Integer>list=new ArrayList<>();

        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            map.put(arr1[i],1);
        }

        for(int i=0;i<arr2.length;i++){
            if(map.getOrDefault(arr2[i],0)==1){
                list.add(arr2[i]);
                map.put(arr2[i],2);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array1:-");
        int len=sc.nextInt();
        System.out.println("Enter the value:-");
        int arr1[]= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        System.out.println("Enter the length of array2:-");
        int len2=sc.nextInt();
        System.out.println("Enter the value:-");
        int arr2[]= IntStream.range(0,len2)
                .map(i->sc.nextInt())
                .toArray();

        List<Integer> highFrequencyVal=findCommonAmong2Arr(arr1,arr2);

        System.out.println("the number with highest frequency is :-"+highFrequencyVal);
    }
}
