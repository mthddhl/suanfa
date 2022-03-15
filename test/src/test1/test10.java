package test1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class test10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nums=new int[1000];
        int[] next=new int[nums.length];
        Map map=new HashMap();

//        for (int j=0; j<10; j++) {
//            for (int i = 0; i < 1000; i++) {
//                nums[i] = rand.nextInt(10);
//            }
//            int[] process = process(nums, 0, 0, nums.length, next);
//            System.out.println(process[0]);
//        }
        for (int i = 0; i < 1000; i++) {
            nums[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(nums));
//        System.out.println(process(nums,0,0,0,10000));
//        int[] nums={1,5,6,9,2,3,9,5,4,7,7,8,6,3,6,4,4,1,3,56,4,7,1,2,5};



    }
    public static int[] process(int[] nums,int n,int count,Integer max,int[] next) {
        if(n==nums.length-1){
            return next;
        }
        next=process(nums,n+1,count,max,next);
        int index=nums.length-1-n;
        if(nums[n]==0){
            next[n]= nums.length+1;
            return next;
        }
        if(nums[n]>=index){
            next[n]=1;
        }else {
            for (int j=n+1;j<=Math.min(nums.length-1,n+nums[n]);j++){
                count=next[j]+1;
                if(count<max){
                    max=count;
                }
            }
            next[n]=max;
        }
        return next;
    }
}
