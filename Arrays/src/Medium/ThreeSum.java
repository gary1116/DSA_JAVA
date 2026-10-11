package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ThreeSum {

    public static List<List<Integer>> find_Three_Sum(int [] arr){
        List<List<Integer>> result = new ArrayList<>();
        int n=arr.length;

        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

        for(int i=0;i<n;i++){
            int left=i+1;
            int right=arr.length-1;

            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum<0){
                    left++;
                } else if (sum>0) {
                    right--;
                }else {
                    result.add(Arrays.asList(arr[i]+arr[left]+arr[right]));
                    left++;
                    right--;
                }
            }

        }
    }

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("mention the length of array");
            int len= sc.nextInt();

            int [] arr= IntStream.range(0,len)
                    .map(i->sc.nextInt())
                    .toArray();

            List<List<Integer>> list= find_Three_Sum(arr);

    }
}
