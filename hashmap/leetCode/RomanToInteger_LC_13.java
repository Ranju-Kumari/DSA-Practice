package dsa_learning.hashmap.leetCode;

import java.util.HashMap;

public class RomanToInteger_LC_13 {

    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int answer =0;

        // Iterate through the string except the character
        // to avoid ArrayIndexOutOfBounds exception
        // because we are comaparing ith element with (i+1)th element
        for(int i = 0;i<s.length()-1;i++){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                //If current value is less than the next value, then subtract
                answer = answer - map.get(s.charAt(i));
            }else{
                //if current value is greater than the next value, then add
                answer =  answer + map.get(s.charAt(i));
            }
        }

        // Adding the last numeral at the end
        answer =  answer+ map.get(s.charAt(s.length()-1));

        return answer;
    }

}
