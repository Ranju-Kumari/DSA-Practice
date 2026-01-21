class Solution {
    public int[] runningSum(int[] nums) {

        //TIME COMPLEXITY :  O(n)
        int prefixSum[] = new int[nums.length];

        //Since according to what we defined prefixSum[i] is sum of elemnts from beginning till index i.
        //That's why we can already set prefixSum[0]= the elementb itself i.e. nums[0]
        prefixSum[0]=nums[0];
        for(int i=1;i<=nums.length-1;i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }

        return prefixSum;





      //TIME COMPLEXITY :  O(n2) 
      /*  int prefixSum[] = new int[nums.length];

        // i to iterate the complete array
        for(int i = 0; i<=nums.length-1; i++){
            
            //j iterates from the beginning of the array till i(i.e. the current element)
            //then we find the prefix sum till ith element by adding all the elements one by one
            //from the beginning till the current element
            for(int j=0; j<=i; j++){
                prefixSum[i]= prefixSum[i]+nums[j];
            }
        }
        return prefixSum;

        */ 
        
    }
}
