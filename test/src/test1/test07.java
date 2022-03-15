package test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test07 {
    public static void main(String[] args) {
        permuteUnique(new int[]{-1,2,-1,2,1,-1,2,1});
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
//        return null;
        List<List<Integer>> listList=new ArrayList<List<Integer>>();
        List<Integer> numList=new ArrayList<Integer>();
        Arrays.sort(nums);
        return pailie(nums,0,listList,numList);
    }
    public static List<List<Integer>> pailie(int[] nums,int n,List<List<Integer>> listList,
                                      List<Integer> numList) {
        int a=0;
        if(n==nums.length){
            listList.add(new ArrayList<>());
            for (int i = 0; i < numList.size(); i++) {
                listList.get(listList.size() - 1).add(numList.get(i));
            }
            return listList;
        }
        boolean[] visit=new boolean[10];
        for (int i=n;i<nums.length;i++) {
//            if(n!=i && nums[n]==nums[i]){
//                continue;
//            }
            if (!visit[nums[i]]) {
                visit[nums[i]]=true;
                exchange(nums, n, i);
                numList.add(nums[n]);
                pailie(nums, n + 1, listList, numList);
                numList.remove(numList.size() - 1);
                exchange(nums, n, i);
//            while(i<nums.length-1 && nums[i]==nums[i+1]){
//                i++;
//            }
            }
        }
        return listList;
    }
    public static void exchange(int[] nums,int m,int n){
        int temp=0;
        temp=nums[m];
        nums[m]=nums[n];
        nums[n]=temp;
    }
}
