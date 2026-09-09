package strings.leeCode;

public class ReverseOnlyLetters_LC_917 {

    public static void main(String [] args){
        String s = "Test1ng-Leet=code-Q!";
        System.out.print(reverseOnlyLetters(s));
    }

    //Using custom isLetter method to check if a character is English leter or not
    public static String reverseOnlyLetters(String s) {
        char [] ch = s.toCharArray();
        int left =0;
        int right= ch.length-1;

        while(left<right){
            if(!isLetter(ch[left]))
                left++;
            if(!isLetter(ch[right]))
                right--;
            if(isLetter(ch[left])&& isLetter(ch[right]))
            {
                char temp = ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c: ch){
            sb.append(c);
        }
        return sb.toString();
    }

    public static boolean isLetter(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }


    /*
    // Using inbuilt isLetter method
    public static String reverseOnlyLetters(String s) {
        char [] ch = s.toCharArray();
        int left =0;
        int right= ch.length-1;

        while(left<right){
            if(!Character.isLetter(ch[left]))
                left++;
            if(!Character.isLetter(ch[right]))
                right--;
            if(Character.isLetter(ch[left])&&Character.isLetter(ch[right])){
                char temp = ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c: ch){
            sb.append(c);
        }
        return sb.toString();
    }


     */
}
