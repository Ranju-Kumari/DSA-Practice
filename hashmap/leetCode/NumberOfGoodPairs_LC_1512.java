package dsa_learning.hashmap.leetCode;

import java.util.HashMap;

public class NumberOfGoodPairs_LC_1512 {

    public static void main(String [] args){

    }

    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }//  map.getOrDefault(n, 0) + 1 means -> Get the current count (or 0 if missing), then add 1


        /*Frequency map can be created this way as well
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
        } else {
                map.put(n, 1);
            }
        }

        */

        for (int n : map.values()) {
            count = count + n * (n - 1) / 2;
        }
        return count;




        /*
        //O(N^2) approach below:

        int count=0;
        //Traversing the array and checking if for the current element, there is an equal element
        //If that's true, we increase the count
        for(int i = 0;i<=nums.length-2;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[i]==nums[j]){

                    count++;
                }
            }
        }
        return count;

        */
    }
}
