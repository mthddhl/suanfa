package test1;

import java.util.*;

public class test06 {
    public static void main(String[] args) {
        int[] nums ={1,2,3};
//        int[] nums2 ={10,1,2,7,6,1,5};
        Arrays.sort(nums);
        permute(nums);
//        Set<int[]> set=new HashSet<int[]>();

    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> listList=new ArrayList<List<Integer>>();
        List<Integer> numList=new ArrayList<Integer>();
        return pailie(nums,0,listList,numList);
    }
    public static List<List<Integer>> pailie(int[] nums, int n, List<List<Integer>> listList,
                                      List<Integer> numList) {
        int a=1;
        if(n==nums.length){
            listList.add(new ArrayList<>());
            for (int i = 0; i < numList.size(); i++) {
                listList.get(listList.size() - 1).add(numList.get(i));
            }
            return listList;
        }
        for (int i=n;i<nums.length;i++){
            exchange(nums,n,i);
            numList.add(nums[n]);
            pailie(nums,n+1,listList,numList);
            numList.remove(numList.size() - 1);
            exchange(nums,n,i);
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
