package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LeadersInAnArray {

    public static int[] leaders(int [] arr){
        int n=arr.length;
        List<Integer> list= new ArrayList<>();

        for(int i=0;i<n;i++){
            boolean leader=true;
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    leader=false;
                    break;
                }
            }
            if (leader){
                list.add(arr[i]);
            }
        }
        return list.stream().
                mapToInt(Integer::intValue).
                toArray();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:-");
        int len = sc.nextInt();
        System.out.println("Enter the numbers:-");

        int [] arr= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        int [] temp= leaders(arr);
        Arrays.stream(temp).forEach(i->System.out.println(i));
    }
}
