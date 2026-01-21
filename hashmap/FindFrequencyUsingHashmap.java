package dsa_learning.hashmap;

import java.util.HashMap;

public class FindFrequencyUsingHashmap {

    public static void main(String [] args){
        int [] nums = {1,2,3,4,5};
        System.out.print(findFrequency(nums));
    }

    public static int findFrequency(int[] nums){


        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFrequency = 0;
        int count=0, sum =0;

        // We first iterate through the array
        for(int element : nums){
            //check if the element already exists in the map
            if(map.containsKey(element)){
                //If it does already exist in the map, increase its count
                map.put(element,map.get(element)+1);
                // maxFrequency = Math.max(maxFrequency, map.get(element));
//                System.out.println("FREQUENCY "+ maxFrequency);
            }else{
                //If it doesn't exist, add it with frequency 1
                map.put(element,1);
            }
        }

        for(int frequency : map.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        for(int freq : nums){
            if(map.get(freq) == maxFrequency){
                count++;
            }
        }
        return count;
    }
}
