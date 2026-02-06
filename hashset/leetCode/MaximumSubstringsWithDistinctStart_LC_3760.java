package dsa_learning.hashset.leetCode;

import java.util.HashSet;

public class MaximumSubstringsWithDistinctStart_LC_3760 {

    public static void main(String [] args){
        String s = "ababa";
        System.out.println(maxDistinct(s));
    }

    // Using HashSet
    // since HashSet doesn't store duplicates
    // so total number of characters in the set should be equal to total number of
    // substrings with distict start
    public static int maxDistinct(String s) {

        HashSet<Character> hashSet = new HashSet<>();

        for (char c : s.toCharArray()) {
            hashSet.add(c);
        }

        return hashSet.size();
    }


    /*

    // Using HashMap
    public int maxDistinct(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // If we find the total numbers of distinct characters in the map
        // that should be equal to the total number of substrings with distinct start
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map.size();//size() returns the number of key–value pairs,
                          // which is also the number of keys
    }

    */

}
