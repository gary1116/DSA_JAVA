package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChar {

    public static HashMap<String,Integer>  getCountFrequency(String word){
        HashMap<String,Integer> map=new HashMap<>();

        String [] wordArray=  word.split("");

        for(String letter:wordArray){
            map.put(letter,map.getOrDefault(letter,0)+1);
        }
        return map;


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the word from which you want to count characters from :-");
        String word= sc.nextLine();

        HashMap<String,Integer> map=getCountFrequency(word);

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() +" "+entry.getValue());
        }



    }

}
