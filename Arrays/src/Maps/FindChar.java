package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindChar {

    public static char findingChar(String s){
        char [] ch=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : ch){
            if(map.get(c) == 1){
                return c;
            }
        }
        return '0';

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word:-");
        String s=sc.next();

        char val= findingChar(s);
        System.out.println(val);
    }
}
