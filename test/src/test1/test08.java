package test1;

public class test08 {
    public static void main(String[] args) {
        check("a","");
    }
    public static int check(String haystack, String needle){
        int[] next=kmp(needle);
        int i1=0;
        int i2=0;
        while(i1<haystack.length() && i2< needle.length()){
            if(haystack.charAt(i1)==needle.charAt(i2)){
                i1++;
                i2++;
            }else if(i2==0){
                i1++;
            }else {
                i2=next[i2];
            }
        }
        if(i2==needle.length()){
            return i1;
        }
        return -1;
    }
    public static int[] kmp(String s){
        if(s.length()==1){
            return new int[]{0};
        }
        int[] next =new int[s.length()];
        next[0]=-1;
        next[1]=0;
        int i=2;
        int ch=0;
        while(i<s.length()){
            if(s.charAt(i-1)==s.charAt(ch)){
                next[i]=ch+1;
                ch++;
                i++;
            }else if(ch==0){
                next[i]=0;
                i++;
            }else {
                ch=next[ch];
            }
        }
        return next;
    }
}
