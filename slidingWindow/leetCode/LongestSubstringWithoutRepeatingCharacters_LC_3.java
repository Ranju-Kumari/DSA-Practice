package dsa_learning.slidingWindow.leetCode;

public class LongestSubstringWithoutRepeatingCharacters_LC_3 {

    public static void main(String [] args){

        String s = "abcabcbb";
        System.out.print(lengthOfLongestSubstring(s));
    }


    public static int lengthOfLongestSubstring(String s){


        String str = "";

        for(int i=0;i<=s.length()-1;i++){
            for(int j=i;j<=s.length()-1;j++){

                str = str+s.charAt(j);
                System.out.print("String withh first char at " + i + " "+ str);
            }


        }

        return 1;

    }
}
