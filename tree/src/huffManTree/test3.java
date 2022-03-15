package huffManTree;

public class test3 {
    public static void main(String[] args) {
        convert("PAYPALISHIRING",4);
    }
    public static String convert(String s, int numRows) {
        int initIndex=0;
        String s1="";
        int count=0;
        int flag=1;
        for(int i=numRows;i>0;i--){
            if(i!=1 && i!=numRows){
                initIndex=(i-1)*2;
                count=numRows-i;
                while (count<s.length()){
                    s1+=s.charAt(count);
                    if(flag==1){
                        count+=initIndex;
                        flag=-1;
                    }else {
                        count+=(numRows-1)*2-initIndex;
                        flag=1;
                    }
                }
            }else{
                initIndex=(numRows-1)*2;
                count=numRows-i;
                while(count<s.length()){
                    s1+=s.charAt(count);
                    count+=initIndex;
                }
            }
        }
        return s1;
    }
}
