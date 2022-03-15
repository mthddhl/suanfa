package base;

import java.util.*;

public class Node {
    public Integer id;
    public Node left;
    public Node right;

    public Node(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                '}';
    }

    public void preSelect(){
        Stack<Node> stack=new Stack<>();
        stack.add(this);
        while(stack.size()>0){
            Node pop = stack.pop();
            System.out.println(pop);
            if(pop.right!=null){
                stack.add(pop.right);
            }
            if(pop.left!=null){
                stack.add(pop.left);
            }
        }
    }
    public void dackSelect(){
        Stack<Node> stack=new Stack<>();
        Stack<Node> stack1=new Stack<>();
        stack.add(this);
        while(stack.size()>0){
            Node pop = stack.pop();
            stack1.add(pop);
            if(pop.left!=null){
                stack.add(pop.left);
            }
            if(pop.right!=null){
                stack.add(pop.right);
            }
        }
        while (stack1.size()>0){
            System.out.println(stack1.pop());
        }
    }
    public void midSelect(){
        Node node=this;
        Stack<Node> stack=new Stack<>();
        while (node!=null){
            stack.add(node);
            node=node.left;
        }
        while (stack.size()>0){
            Node pop = stack.pop();
            System.out.println(pop);
            if(pop.right!=null) {
                pop=pop.right;
                while (pop != null) {
                    stack.add(pop);
                    pop = pop.left;
                }
            }

        }
    }
    public int maxLength(){
        Node temp;
        Map<Node,Integer> map=new HashMap<>();
        Queue<Node> queue=new LinkedList<>();
        queue.add(this);
        map.put(this,1);
        int curLevel=1;
        int maxLength=0;
        int curLevelNums=0;
        int curNodeLevel;
        while(queue.size()>0){
            temp=queue.poll();
            curNodeLevel=map.get(temp);
            if(curNodeLevel==curLevel){
                curLevelNums++;
            }else {
                maxLength=Math.max(maxLength,curLevelNums);
                curLevel++;
                curLevelNums=1;
            }
            if(temp.left!=null){
                queue.add(temp.left);
                map.put(temp.left,curNodeLevel+1);
            }
            if(temp.right!=null){
                queue.add(temp.right);
                map.put(temp.right,curNodeLevel+1);
            }
        }
        maxLength=Math.max(maxLength,curLevelNums);
        return maxLength;
    }
}
