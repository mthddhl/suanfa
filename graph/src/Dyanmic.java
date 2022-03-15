public class Dyanmic {
    public static void main(String[] args) {
        int[][] stacks=new int[][]{{2,5,2,8,5,1,4},{3,7,0,1,4,2,5},{3,6,1,9,4,7,2},{5,0,1,3,6,4,2}};
        dyanmic(stacks);
    }

    public static void dyanmic(int[][] stacks){
        if(stacks.length==0){
            return;
        }
        int[][] temp = new int[stacks.length][stacks[0].length];
        temp[0][0]=stacks[0][0];
        for(int i=1;i<stacks[0].length;i++){
            temp[0][i]=temp[0][i-1]+stacks[0][i];
        }

        for(int j=1;j<stacks.length;j++){
            for(int m=0;m<stacks[0].length;m++){
                if(m==0){
                    temp[j][0]=temp[j-1][0]+stacks[j][0];
                }else{
                    temp[j][m]=Math.min(temp[j-1][m],temp[j][m-1])+stacks[j][m];
                }
            }
        }
        System.out.println(temp[stacks.length-1][stacks[0].length-1]);
    }


}
