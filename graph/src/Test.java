import java.util.List;

public class Test {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.inserElement("A");
        graph.inserElement("C");
        graph.inserElement("R");
        graph.inserElement("E");
        graph.inserElement("M");
        graph.insertEdge(0,1,1);
        graph.insertEdge(0,2,1);
        graph.insertEdge(2,2,1);
        graph.insertEdge(2,3,1);
        graph.insertEdge(2,4,1);
        graph.bfs();
    }
}
