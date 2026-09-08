package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharFrequency {

    public static void countFrequency(String word){

        HashMap<Character,Integer> map= new HashMap<>();
        char[] ch=word.toCharArray();

        for(int i=0;i<ch.length;i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }

        map.forEach((key,value)->System.out.println(key+" "+value));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:-");
        String word = sc.next();

        countFrequency(word);
    }
}
