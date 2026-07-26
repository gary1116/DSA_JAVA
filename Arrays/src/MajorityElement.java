import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {

    private static int majorityElement(int arr[]){
        int n=arr.length;
        int half=n/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n-1;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])>half){
                return arr[i];
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array:- ");

        int len=sc.nextInt();

        int [] arr=new int[len];
        System.out.println("Now Enter the numbers for array:- ");

        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        int majority= majorityElement(arr);

            System.out.print("The majority element is:- "+majority);
    }
}
