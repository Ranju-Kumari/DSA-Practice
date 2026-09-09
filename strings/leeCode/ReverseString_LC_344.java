package strings.leeCode;

public class ReverseString_LC_344 {
    public void reverseString(char[] s) {

        // Swapping the characters at positions i and s.length-1-i in each iterations
        // till we reach the middle index of the character array
        for(int i=0;i<=s.length/2-1;i++){
            char temp = s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i] = temp;

        }
    }
}
