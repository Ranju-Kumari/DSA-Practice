package dsa_learning.arrays.gfg;

public class SecondLargestNumber {
    public static void main(String [] args){
        int [] nums = {4,2,8,5,1,6};
        System.out.println(secondLargestNum(nums));
    }

    public static int secondLargestNum(int [] nums){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int n: nums){
            if(n>largest){
                secondLargest = largest;
                largest = n;
            }else if(n> secondLargest && n < largest){
                secondLargest =n;
            }
        }
        return secondLargest;
    }
}
