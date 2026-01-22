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

    /*
    public static int lengthOFLongestSubstring(String s){
        int maxLen = 0, count = 0;
        HashMap<String, Integer>  map = new HashMap<>();
        for(int i = 0;i<=s.length()-1;i++){
            int leftPointer =i;
            if(map.containsKey(s.charAt(i))){
                while(s.charAt(leftPointer)!=s.charAt(i)){
                    leftPointer++;
                    count= (i-leftPointer)+1;
                }
            }else{
                map.put(String.valueOf(s.charAt(i)),i);
                count= (i-leftPointer)+1;

            }
            count= (i-leftPointer)+1;
            maxLen = Math.max(count,maxLen);
        }
        return maxLen;
    }

     */
}