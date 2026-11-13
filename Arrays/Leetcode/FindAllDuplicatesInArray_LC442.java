package dsa_learning.arrays.Leetcode;

import java.util.*;

public class FindAllDuplicatesInArray_LC442 {

    public static  void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nums [] = new int[n];
        for(int i=0;i<=n-1;i++){
            nums[i]= scan.nextInt();
        }
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicateslist = new ArrayList<>();
        for(int n : nums){
            if(!set.add(n)){ // add returns false if n was already present in the set
                duplicateslist.add(n);
            }else{
                set.add(n);
            }
        }
        return duplicateslist;
    }
}
