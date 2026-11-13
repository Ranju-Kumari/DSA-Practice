package dsa_learning.TwoPointer.LeetCode;

public class ValidPalindrome_LC_125 {

    public static void main(String [] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindromeUsingTwoPointer(s));
    }

    //using two pointers
    private static boolean isPalindromeUsingTwoPointer(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    //Complexity: O(n) time, since each character is visited at most once, and O(1) extra space, because no new string is built.
    // The regex version is also O(n) time, but it uses O(n) space for the cleaned copy and has some regex overhead,
    // so this one usually runs noticeably faster on LeetCode.

    //using regex
    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-z0-9]","");
        for(int i =0;i<=(str.length()/2)-1;i++){
            if(!(str.charAt(i)==str.charAt(str.length()-1-i))){
                return false;
            }
        }
        return true;
    }
}
