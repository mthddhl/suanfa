package test1;

public class Test04 {
    public static void main(String[] args) {
        String s = "hasd";
        char[] chars = s.toCharArray();
        char c1 = '0';
        zuhe1(chars, 0, "");

    }

    public static void zuhe1(char[] chars, int n,String str) {
        int a=1;
//        System.out.println(123);
        if(n<chars.length && n>0){
            System.out.println(str);
        }

    }
}
