package dsa_learning.Arrays.Leetcode;

public class ContainerWithMostWater_LC_11 {

    public static void main(String[] args) {

        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea(int[] height) {
        int l=0,b=0, area=0;
        int maxArea=0;
        for(int i=0;i<=height.length-1;i++){
            for(int j=i+1;j<=height.length-1;j++){
                //Since we can't slant the container, so we've to take the minimum of the two
                //heights to take it as length(or breadth)
                l=Math.min(height[i],height[j]);
                b=j-i;// breadth(or length) will be the difference the two indices of the two
                //heights
                area=l*b;
//                System.out.println("L "+l+ "B "+b+ "Area "+area);
                maxArea = Math.max(area, maxArea);
            }
        }
        return maxArea;
    }

    public static int maxAreaTwoPointersApproach(int [] height){
        int  area= 0;
        int maxArea=0, left=0,right=height.length-1;
        int len=0, breadth=0;
        for(int i=0;i<=height.length-1;i++){
            len= Math.min(height[left],height[right]);
            breadth=right-left;
            area= len*breadth;
            maxArea=Math.max(area,maxArea);
            if(height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxArea;
    }

}
