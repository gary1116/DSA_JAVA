import java.util.Scanner;

public class MaxSubArray {

    private static int maxSubArray(int arr[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;

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

        int maximum= maxSubArray(arr);

            System.out.print(" the maximum is :-"+maximum);
    }
}
