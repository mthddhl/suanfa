package huffManTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int result=myAtoi("-000000000000001");
        System.out.println(result);
    }
    public static int myAtoi(String s) {
        int left=0;
        int right=0;
        char c1;
        boolean flag=false;
        char c2;
        char c3=s.charAt(0);
        if((c3!='-' && c3!=' ' && c3!='+' && !(c3>='0' && c3<='9')) || s.length()==0){
            return 0;
        }
        while (right<s.length()){
            c1=s.charAt(right);
            if(c1=='+' || c1=='-' || (c1>='0' && c1<='9')){
                left=right;
                c2=s.charAt(left);
                while (right<s.length()){
                    right++;
                    c1=s.charAt(right);
                    char c4=s.charAt(right-1);
                    if(right==s.length()-1 && (c1>='0' && c1<='9')){
                        right++;
                        flag=true;
                        break;
                    }
                    if(c1>='0' && c1<='9'){
                        continue;
                    }else if(!(c2=='+' || c2=='-') && right>=left){
                        flag=true;
                        break;
                    }else if((c2=='+' || c2=='-') && right>left && (c4>='0' && c4<='9')){
                        flag=true;
                        break;
                    }else {
                        break;
                    }
                }
            }
            if(flag){
                break;
            }
            right++;
        }
        long result=0;
        if(flag){
            String s1=s.substring(left,right);
            result=Integer.parseInt(s1);
            if(result!=(int)result){
                if(result<0){
                    return -2147483648;
                }else{
                    return 2147483647;
                }
            }else {
                return (int) result;
            }
        }else{
            return 0;
        }

    }

}
