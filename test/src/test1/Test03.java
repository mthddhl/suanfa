package test1;

public class Test03 {
    public static void main(String[] args) {
        String s = "hasd";
        char[] chars = s.toCharArray();
        char c1 = '0';
        zuhe(chars, 0, "");

    }

    public static void zuhe(char[] chars, int n,String str) {
//        System.out.println(111);
        if (n == chars.length) {
            System.out.println(str);
            return;
        }
        str+=chars[n]+"";
        zuhe(chars, n + 1, str);
        String temp=str;
        str=str.substring(0,str.length()-1);
        zuhe(chars, n + 1, str);
        str=temp;

    }
}
