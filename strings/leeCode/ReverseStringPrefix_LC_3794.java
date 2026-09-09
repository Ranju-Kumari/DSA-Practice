package strings.leeCode;

public class ReverseStringPrefix_LC_3794 {
    public static void main(String [] args){
    String s = "abcd";
    int k =2;

    System.out.print(reversePrefix(s,k));

    }

    public static String reversePrefix(String s, int k) {
        char [] ch = s.toCharArray();
        for(int i=0;i<=k/2-1;i++){
            char t = ch[i];
            ch[i] = ch[k-1-i];
            ch[k-1-i]=t;
        }

        StringBuilder sb = new StringBuilder();
        for(char c : ch){
            sb.append(c);
        }
        return sb.toString();
    }
}
