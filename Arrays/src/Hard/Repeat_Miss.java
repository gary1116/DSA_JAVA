package Hard;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Repeat_Miss {

    public static int[] find_repeating_missing(int [] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        int [] result=new int[2];
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=1;i<=arr.length;i++){

            int frequency=map.getOrDefault(i,0);
            if(frequency==2){
                result[0]=i;
            }
            if(frequency==0){
                result[1]=i;
            }

        }

        return result;
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

        int [] result= find_repeating_missing(arr);
        for(int value:result){
            System.out.println(value);
        }

    }

}
