package dsa_learning.hashmap.leetCode;

import java.util.HashMap;

public class ValidAnagram_LC_242 {

    public static void main(String [] args){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t){

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<Character,Integer>();

        for(char c : s.toCharArray()){
            // The below line is key to building a character frequency map in Java. It means:
            // "For character c, either increment its count by 1 if it exists, or set it to 1 if it's not in the map yet."
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }

            map.put(c, map.get(c)-1);
            if(map.get(c)==0){
                map.remove(c);//Remove the key when count reaches zero
            }
        }
        return map.isEmpty();//If the map is empty that means all the characters
                                // are matched in both the strings
    }


    //O(n^2) approach
    /*
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();
        int flag=0;
        for(int  i=0;i<=c1.length-1;i++){
            flag=0;
            for(int j=0;j<=c2.length-1;j++){
                if(c1[i]==c2[j]){
                    c2[j]='$';
                    flag=1;
                    break;
                }
            }
        }

        if(flag!=1){
            return false;
        }
        return true;
    }
     */
}
