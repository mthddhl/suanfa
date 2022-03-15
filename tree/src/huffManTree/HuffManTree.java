package huffManTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffManTree {
    private Node node=new Node();

    public static Node HuffOper(int[] stacks){
        List<Node> list=new ArrayList();
        for(int i=0;i<stacks.length;i++){
            list.add(new Node(stacks[i]));
        }

        while(list.size()>1) {
            Collections.sort(list);
            Node leftNode=list.get(0);
            Node rightNode=list.get(1);
            Node root=new Node(leftNode.key+rightNode.key);
            root.left=leftNode;
            root.right=rightNode;
            list.remove(leftNode);
            list.remove(rightNode);
            list.add(root);
        }
        return list.get(0);
    }

    public static void preSelect(Node node){
        node.preSelect();
    }
}
