package huffManTree;

public class Node implements Comparable<Node>{
    public Integer key;
    public Node left;
    public Node right;

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                '}';
    }

    public Node(Integer key) {
        this.key = key;
    }

    public Node() {
    }


    @Override
    public int compareTo(Node o) {
        return this.key-o.key;
    }

    public void preSelect(){
        System.out.println(this);
        if(this.left!=null){
            this.left.preSelect();
        }
        if(this.right!=null){
            this.right.preSelect();
        }
    }
}
