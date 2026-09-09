package recursion.GFG.reverseArray;

public class RotateArray {

    public static void main(String [] args){

        int nums [] =  {1,2,3,4,5,6,7};
        int k =3;
        k = k % nums.length;//This is to handle cases when k is larger then array length
        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,nums.length-1);

        for(int ele : nums){
            System.out.print(ele+" ");
        }
    }

    public static void reverseArray(int [] nums, int start, int end){

        while(start<end){
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}
