package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Check_Frequency {

    public static boolean checkFrequencyOfArrays(int[] arr1, int[] arr2){

        if(arr1.length != arr2.length){
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        // Add frequencies from arr1
        for(int num : arr1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Subtract frequencies from arr2
        for(int num : arr2){
            map.put(num, map.getOrDefault(num, 0) - 1);
        }

        // Every frequency difference must be zero
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of arrays:-");
        int len= sc.nextInt();
        System.out.println("enter the values of array1:-");
        int [] arr1=new int[len];
        for(int i=0;i<len;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("enter the values of array2:-");
        int [] arr2=new int[len];
        for(int i=0;i<len;i++){
            arr2[i]=sc.nextInt();
        }

        boolean result=checkFrequencyOfArrays(arr1,arr2);

        System.out.println("Are both arrays have same values?:- "+result);


    }
}
