package test1;

import java.util.PriorityQueue;

public class Test02 {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,4,5,8,8,8,9,9,10};
        searchRange(nums,8);
    }
    public static int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid=0;
        int temp=0;
        PriorityQueue<Integer> p1=new PriorityQueue<Integer>();
        while (left<right){
            mid=(left+right)/2;
            if(nums[mid]==target){
                temp=mid+1;
                while(nums[mid]==target && mid>0){
                    p1.add(mid);
                    mid--;
                }
                while(nums[temp]==target && temp< nums.length){
                    p1.add(temp);
                    temp++;
                }
                break;
            }else{
                if(nums[mid]<target){
                    left=mid+1;
                    continue;
                }else{
                    right=mid-1;
                    continue;
                }
            }
        }
        int[] nums1=new int[p1.size()];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i]=p1.poll();
        }
        return nums1;
    }
}
