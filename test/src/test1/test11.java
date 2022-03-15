package test1;

import java.util.ArrayDeque;
import java.util.Queue;

public class test11 {
    public static void main(String[] args) {
        System.out.println(multiply("1435345657456256432533241758317564892371654893276576413259612958643254657568769877345626813124154367686346265265436546354765876878456756745",
                "0"));
    }
    public static String multiply(String num1, String num2) {
        if(num1=="0" || num2=="0"){
            return "0";
        }
        Queue<Integer> q1 = new ArrayDeque<>();
//        Queue<Integer> q2 = new ArrayDeque<>();
        int m = 0;
        int n = 0;
        int chengResult = 0;
        int count = 0;
        int wei = 0;
        int index = 0;
        int size=0;
        int count2 = 0;
        for (int i = 0; i < num1.length(); i++) {
            count = 0;
            m = num1.charAt(num1.length()-1-i)-'0';
            if(i==0) {
                for (int j = 0; j < num2.length(); j++) {
                    n =num2.charAt(num2.length()-1-j)-'0';
                    chengResult = m * n + count;
                    count = chengResult / 10;
                    wei = chengResult % 10;
                    q1.add(wei);
                    if (j == num2.length() - 1) {
                        if (count != 0) {
                            q1.add(count);
                        }
                    }
                }
            }else {
                count2=i;
                index=0;
                size = q1.size();
                while (count2>0) {
                    q1.add(q1.poll());
                    index++;
                    count2--;
                }
                for (int j = 0; j < num2.length(); j++) {
                    n = num2.charAt(num2.length()-1-j)-'0';
                    if(index<size) {
                        chengResult = m * n + count + q1.poll();
                        index++;
                    }else {
                        chengResult = m * n + count;
                    }
                    count = chengResult / 10;
                    wei = chengResult % 10;
                    q1.add(wei);
                    if (j == num2.length() - 1) {
                        if (count != 0) {
                            q1.add(count);
                        }
                    }
                }
            }

        }
        String s="";
        while (q1.size()>0){
            s=q1.poll()+""+s;
        }
        if(Integer.parseInt(s)==0){
            return "0";
        }
        return s;

    }
}
