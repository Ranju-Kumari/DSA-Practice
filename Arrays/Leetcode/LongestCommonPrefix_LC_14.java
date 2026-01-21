package dsa_learning.Arrays.Leetcode;

import java.util.Arrays;

public class LongestCommonPrefix_LC_14 {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] { "auto","autotest","automation" }));
    }



    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==1 ){
            return strs[0];
        }
        // Firstly, sorting the array because then if a prefix is present is common in
        // the first and the last strings of the array, then it's surely present in the
        // rest of the strings between the 1st and the last strings of the string array.
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];

        int count = 0;

        //Now, comparing the 1st and the last string of the string array
        // to check how many prefix letters are same in those strings
        for(int i=0;i<=s1.length()-1;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                count++;
            }else {
                break;//break from the loop now since we found that
                // now no more letters in the strings are matching
            }
        }
        if(count==0){
            return "";
        }else{
           return s1.substring(0,count);
        }
        // return empty string if there was no common prefix
        // else return the substring of length 0 till the common
        //prefixed index.
    }

   /* // (Brute Force - Character Comparison)
    public class longestCommonPrefixCharByChar {
        public static String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) return "";

            for (int i = 0; i < strs[0].length(); i++) {
                char c = strs[0].charAt(i);

                for (int j = 1; j < strs.length; j++) {
                    // If index exceeds current string length or mismatch found
                    if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                        return strs[0].substring(0, i);
                    }
                }
            }

            return strs[0];  // all characters matched
        }

        public static void main(String[] args) {
            String[] input = {"flower", "flow", "flight"};
            System.out.println("Longest Common Prefix: " + longestCommonPrefix(input));
        }
    } */

}
