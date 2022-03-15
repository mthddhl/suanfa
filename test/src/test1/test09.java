package test1;

import java.util.Arrays;

public class test09 {
    public static void main(String[] args) {
        String s1="1221123454321";
        int[] ints = manction1(s1);
        String s=s1.charAt(ints[0])+"";
        if(ints[1]%2==1){
            for(int i=1;i<=ints[1]/2;i++){
                s=s+s1.charAt(i+ints[0])+"";
                s=s1.charAt(ints[0]-i)+""+s;
            }
        }else {
            for(int i=1;i<=ints[1]/2;i++){
                if(i==ints[1]/2){
                    s=s1.charAt(ints[0]-i)+""+s;
                    continue;
                }
                s=s1+s.charAt(i+ints[0])+"";
                s=s1.charAt(ints[0]-i)+""+s;
            }
        }
        System.out.println(s);
    }
    public static char[] manction(String s){
        char[] chars=new char[2*s.length()+1];
        int index=0;
        for(int i=0;i<chars.length;i++){
            chars[i]=(i & 1)==0? '#':s.charAt(index++);
        }
        return chars;
    }
    public static int[] manction1(String s){
        char[] chars = manction(s);
        int[] nums=new int[chars.length];
        int[] result=new int[2];
        int R=-1;
        int C=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(2*C-i<0){
                nums[i]=0;
            }else {
                nums[i] = i > R ? 0 : Math.min(nums[2 * C - i], R - i);
            }
            while(i+nums[i]<chars.length && i-nums[i]>-1){
                if(chars[i+nums[i]]==chars[i-nums[i]]){
                    nums[i]++;
                }else {
                    break;
                }
            }
            if(i+nums[i]>R){
                R=i+nums[i];
                C=i;
            }
            if(R-C>max){
                max=R-C;
                result[0]=C/2;
                result[1]=max-1;
            }
        }
        return result;

    }
}
