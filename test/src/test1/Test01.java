package test1;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("helloworld");
        System.out.println(123);
    }

    public static List<String> letterCombinations(String digits) {
        Map<Integer,Character[]> map=new HashMap<>();
        map.put(2,new Character[]{'a','b','c'});
        map.put(3,new Character[]{'d','e','f'});
        map.put(4,new Character[]{'g','h','i'});
        map.put(5,new Character[]{'h','k','l'});
        map.put(6,new Character[]{'m','n','o'});
        map.put(7,new Character[]{'p','q','r','s'});
        map.put(8,new Character[]{'t','u','v'});
        map.put(9,new Character[]{'w','x','y','z'});
        byte[] bytes = digits.getBytes();
        int[] nums=new int[digits.length()];
        for(int i=0;i<bytes.length;i++){
            nums[i]=bytes[i]-'0';
        }
        List<String> list=new ArrayList<String>();
        list=zuhe(nums,map,0,"",list);
        return list;
    }
    public static List<String> zuhe(int[] nums,Map<Integer,Character[]> map,int i,String str,List<String> list){
        if(i==nums.length){
            list.add(str);
            return list;
        }
        Character[] chars=map.get(nums[i]);
        for(int j=0;j<chars.length;j++){
            str+=chars[j]+"";
            zuhe(nums,map,i+1,str,list);
            str=str.substring(0,str.length()-1);
        }
        return list;
    }
}
