package recursion.GFG.reverseArray;

public class ReverseSubArray {

    public static void reverseSubArray(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        reverseSubArray(arr, 1, 4);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
//Reverse Only a Subarray
//Sometimes you only reverse part of the array.

// Example:
//Input:  [1,2,3,4,5,6]
//Reverse index 1 → 4
// Result: [1,5,4,3,2,6]

// The subarray reversal technique is used inside the algorithm for Rotate Array.

 //Rotation works like this:    1 2 3 4 5 6 7

 //Step 1 reverse whole array  7 6 5 4 3 2 1

 //Step 2 reverse first k

 //Step 3 reverse remaining

