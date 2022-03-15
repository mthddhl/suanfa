package base;

import java.util.ArrayDeque;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node node2 = new Node(5);
        Node node3 = new Node(2);
        Node node4 = new Node(6);
        Node node5 = new Node(4);
        Node node6 = new Node(9);
        Node node7 = new Node(0);
        Node node8 = new Node(3);
        node.left=node2;
        node.left.left=node3;
        node.left.left.right=node4;
        node.left.left.left=new Node(12);
        node.right=node5;
        node.right.left=node6;
        node.right.left.right=node7;
        node.right.left.left=node8;
        NodeTree nodeTree=new NodeTree(node);
//        nodeTree.preSelect();
        nodeTree.midSelect();
        int i = nodeTree.maxLength();
        System.out.println(i);


    }
}
