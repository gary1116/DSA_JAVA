package Medium;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CountSubArray {
    public static int countSubArrays(int []arr, int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if (sum==k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("mention the length of array");
        int len= sc.nextInt();

        int [] arr= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        System.out.println("mention the value you want subarrays from");
        int k=sc.nextInt();


        int count=countSubArrays(arr,k);
        System.out.println("teh count is:-"+count);
    }
}
