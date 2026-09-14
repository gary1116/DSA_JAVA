package Hard;

import java.util.*;
import java.util.stream.IntStream;

public class MajorityElement_Nby3 {

    public static int [] n_by_3(int []arr){
        int k=arr.length/3;
        List<Integer> list= new ArrayList<>();

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()>k){
                list.add(entry.getKey());
            }
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("mention the length of array");
        int len= sc.nextInt();

        int [] arr= IntStream.range(0,len)
                .map(i->sc.nextInt())
                .toArray();

        int []count=n_by_3(arr);
        Arrays.stream(count).forEach(i->System.out.print(i+" "));
    }
}
