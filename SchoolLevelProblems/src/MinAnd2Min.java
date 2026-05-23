import java.util.ArrayList;
import java.util.Scanner;

public class MinAnd2Min {

    public static ArrayList<Integer> smallestAndSecondSmallest(int [] arr){
        ArrayList res=new ArrayList<>();

        if(arr.length<2){
            res.add(-1);
            return res;
        }

        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<first){
                second=first;
                first=arr[i];
            }else if(arr[i]<second && arr[i]!= first){
                second=arr[i];
            }
        }
        res.add(first);
        if(second==Integer.MAX_VALUE){
            res.add(-1);
        }else{
            res.add(second);
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers you want to check smallest and second smallest from:- ");

        int len=sc.nextInt();

        int [] num=new int[len];
        System.out.println("Now Enter the numbers:- ");

        for(int i=0;i<len;i++){
            num[i]=sc.nextInt();
        }

        ArrayList result= new ArrayList<>();
        result=smallestAndSecondSmallest(num);

       for(int i=0;i<result.size();i++){
           System.out.println(result.get(i));
       }

    }
}
