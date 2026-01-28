package dsa_learning.hashmap.leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortCharactersByFrequency_LC_451 {

    public static void main(String [] args){
        String s = "tree";
        System.out.println(frequencySort(s));
    }

    public static String frequencySort(String s) {
        if (s.length() == 1) {
            return s;
        }

        char ch[] = s.toCharArray();

        //Step 1 : Finding the frequency of each characters via map
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2 : Sorting the characters by frequency in descending order
        //map.keySet(): Retrieves a Set containing only the unique characters (keys) from your frequency map
        //new ArrayList<>(...): You cannot sort a Set directly because sets are unordered.
        // This constructor takes all the unique characters from the set and puts them into a new ArrayList, which can be sorted
        List<Character> listOfCharacters = new ArrayList<>(map.keySet());
        listOfCharacters.sort((a, b) -> map.get(b) - map.get(a));
        //This uses a Lambda Expression as a custom Comparator to define how two characters (a and b) should be ordered.
        //Descending Order: By doing frequency(b) - frequency(a), if b has a higher frequency, the result is positive,
        // effectively pushing the character with the higher count to the front of the list

        //Step 3 : Build the result string
        StringBuilder result = new StringBuilder();
        for (char c : listOfCharacters) {
            int freq = map.get(c);

            for (int i = 0; i <= freq - 1; i++) {
                result.append(c);
            }
        }
        return result.toString();

        //Time Complexity: (O(N+Klog K)), where (N) is the string length and (K) is the number of unique characters.
        //Counting takes (O(N)), and sorting unique characters takes (O(Klog K))
        //Space Complexity: (O(N+K)) to store the frequency map and the final result string




        //Note : to handle tie-breaking (e.g., sorting alphabetically if frequencies are equal

        /*
        list.sort((a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);

            // 1. Primary Sort: Higher frequency first
            if (freqA != freqB) {
                return freqB - freqA;
            }

            // 2. Secondary Sort (Tie-breaker): Alphabetical order
            // 'a'.compareTo('b') returns a negative value, placing 'a' before 'b'
            return a.compareTo(b);
        });

        */

    }
}
