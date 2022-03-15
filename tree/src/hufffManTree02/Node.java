package hufffManTree02;

public class Node implements Comparable<Node>{
    public Byte date;
    public Integer weight;
    public Node right;
    public Node left;

    public Node(Byte date, Integer weight) {
        this.date = date;
        this.weight = weight;
    }

    public Node() {
    }

    public Node(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Node{" +
                "date=" + date +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Node o) {
        return this.weight-o.weight;
    }
}
