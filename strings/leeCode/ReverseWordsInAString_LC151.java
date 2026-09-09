package strings.leeCode;

public class ReverseWordsInAString_LC151 {


    public static void main(String [] args){
//        String s = "the sky is blue";
//        String s = "  hello world  ";
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        //s.trim() removes extra leading/trailing whitespace before splitting.
        //\\s+ regex compresses multiple spaces into a single delimiter.
        String [] strs = s.trim().split("\\s+");

        for(int i=0;i<=strs.length/2-1;i++){
            String temp = strs[i];
            strs[i]=strs[strs.length-1-i];
            strs[strs.length-1-i]=temp;
        }

        // StringBuilder sb = new StringBuilder();
        // for(String st : strs){
        //     sb.append(st+" ");
        // }
        // return sb.toString().trim();

        return String.join(" ", strs);//String.join(" ", strs) handles joining with spaces cleanly
        //without leaving a trailing space to trim.
    }
}