class Solution {
    public boolean containsDuplicate(int[] nums) {
    //O(n^2) 
    //     for(int i=0;i<=nums.length-1;i++){
    //         for(int j=i+1;j<=nums.length-1;j++){
    //             if(nums[i]==nums[j]){
    //                 return true;
    //             }
    //         } 
    //     }
    //     return false;
    // }

    // HashMap<Integer,Integer> map = new HashMap<>();
    // int count =1;
    // for(int i=0;i<=nums.length-1;i++){
    //     if(map.containsKey(nums[i])){
    //         count++;
    //         if(count>1){
    //             return true;
    //         }
    //     }
    //     else{
    //         map.put(nums[i],i);
    //     }
        
    // }
    // return false;
    // }

    //Simplied above lines even more because we dont need to check count++ step
    //When the control enters the if (map.comntainKey()) line, then that it already means that   
    //the element has appeared twice.
    HashMap<Integer,Integer> map = new HashMap<>();
    int count =1;
    for(int i=0;i<=nums.length-1;i++){
        if(map.containsKey(nums[i])){
            count++;
            if(count>1){
                return true;
            }
        }
        else{
            map.put(nums[i],i);
        }
        
    }
    return false;
    }
}
