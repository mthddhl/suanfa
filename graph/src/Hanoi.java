public class Hanoi {
    public static void main(String[] args) {
        hanoi(3,"a","b","c");
    }
    public static void hanoi(int n,String a,String b,String c){
        if(n==0){
            return;
        }else{
            hanoi(n-1,a,c,b);
            System.out.println("从塔"+a+"移动到塔"+c);
            hanoi(n-1,b,a,c);
        }
    }

}
