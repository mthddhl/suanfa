package huffManTree;

public class text2 {
    public static void main(String[] args) {
//        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        String s="a";
        s+='b';
        System.out.println(s);
    }

    public static int maxArea(int[] height) {
        int max=0;
        int result=0;
        int left=0;
        int right=height.length-1;
        while (left<right){
            result=(height[right]>height[left]? height[left]:height[right])*(right-left);
            if(result>max){
                max=result;
            }
            if(height[right]>height[left]) {
                int leftIndex=height[left];
                while (leftIndex>=height[left] && right>left) {
                    left++;
                }
            }else {
                int rightIndex=height[right];
                while (height[right]<=rightIndex && right>left) {
                    right--;
                }
            }
        }
        return max;
    }
}
