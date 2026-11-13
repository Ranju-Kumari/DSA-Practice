package dsa_learning.strings.random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MostFrequentWordOrCharacter {
    public static void main(String [] args){
        String s =  "Bob hit a ball, the hit BALL flew far after it was hit.";
        System.out.println(mostFrequentWordOrChar(chars(s)));
        System.out.println(mostFrequentWordOrChar(words(s)));
    }

    public static String mostFrequentWordOrChar(List<String> tokens){
        String mostFrequent ="";
        int maxCount=0;
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : tokens){
            if(map.containsKey(str)){
                map.put(str, map.get(str)+1);
            }else{
                map.put(str, 1);
            }
            int count = map.get(str);
            if(count>maxCount){
                maxCount = count;
                mostFrequent = str;
            }
        }
        return mostFrequent;
    }

    public static List<String> chars(String s){
        List<String> charsToListOfStrings = new ArrayList<>();
        for(char ch : s.toLowerCase().toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                charsToListOfStrings.add(String.valueOf(ch));
            }
        }
        return charsToListOfStrings;
    }

    public static List<String> words(String str){
        List<String> wordsToListOfStrings = new ArrayList<>();
        for(String s : str.toLowerCase().split("[^a-z0-9]+")){
            wordsToListOfStrings.add(s);
        }
        return wordsToListOfStrings;
    }

}
