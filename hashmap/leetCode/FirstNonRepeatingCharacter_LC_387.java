package dsa_learning.hashmap.leetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter_LC_387 {

    public static void main(String [] args){
        String s ="leetcode";
        System.out.print(getFirstNonRepeatingCharacter(s));
    }

    public static Character getFirstNonRepeatingCharacter(String s){
        char [] ch = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0;i<=ch.length-1;i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i], map.get(ch[i])+1);
            }else{
                map.put(ch[i],1);
            }
        }

        for(int i=0;i<=ch.length-1;i++){
            if(map.get(ch[i])==1){
                return ch[i];
            }
        }

/*
        for(Map.Entry<Character,Integer> entry : map.entrySet()){  //This approach is wrong because:
            if(entry.getValue()==1){                               //HashMap does not preserve insertion order:
                return entry.getKey();                             // When you iterate over map.entrySet() (line 24),
            }                                                     //HashMap iterates in hash-table bucket order,
        }                                                      // not in the order characters appeared in the original string.
                                                 //For example, in "leetcode", map.entrySet() might check 'c' or 'e' before 'l', returning the wrong character.
*/                                                //Fix: Keep HashMap for counting frequencies, but iterate back through the original string or array to preserve character order:



        return null;
    }


    //using LinkedHashMap
    public static Character getFirstNonRepeatingCharacterUsingLinkedHashMap(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }
}
