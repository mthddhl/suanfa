package test1;

public class Test05 {
    public static void main(String[] args) {
        String s="0";
        System.out.println(s.charAt(0)-'0');
    }
    public static String countAndSay(int n) {
        int a=1;
        if(n==1){
            return "1";
        }
        String s1 = countAndSay(n - 1);
        StringBuilder s2=new StringBuilder();
        int count=-1;
        for(int i=0;i<s1.length()-1;i++){
            if(s1.charAt(i)!=s1.charAt(i+1)){
                s2.append((i-count)+""+s1.charAt(i));
                count=i;
            }
        }
        s2.append((s1.length()-1-count)+""+s1.charAt(s1.length()-1));
        return s2.toString();

    }
}
