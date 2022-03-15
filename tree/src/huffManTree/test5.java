package huffManTree;

import java.util.*;

public class test5 {
    public static void main(String[] args) {
        int[] nums=new int[500];
//        System.out.println(removeDuplicates(nums));
        for (int i=0; i<nums.length; i++) {
            nums[i] =(int)(Math.random()*100);
        }
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i]+",");
        }
        System.out.println((int)(Math.random()*10000*3));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int left=0;
        int right=1;
        while(right<nums.length){
            if(right==nums.length-1){
                if(nums[right]==nums[right-1]){
                    nums[left]=nums[right];
                }else {
                    nums[left]=nums[right-1];
                    left++;
                    nums[left]=nums[right];
                    break;
                }
            }
            if(nums[right]==nums[right-1]){
                right++;
            }else {
                nums[left]=nums[right-1];
                left++;

            }
        }
        return left;
    }
}
