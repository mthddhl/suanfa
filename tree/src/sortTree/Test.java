package sortTree;

public class Test {
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(13);
        Node n3=new Node(3);
        Node n4=new Node(7);
        Node n5=new Node(11);
        Node n13=new Node(12);
        Node n6=new Node(4);
        Node n7=new Node(5);
        Node n8=new Node(19);
        Node n9=new Node(1);
        Node n10=new Node(17);
        Node n11=new Node(6);
        Node n12=new Node(14);
        SortTree sortTree=new SortTree(n1);
        sortTree.add(n2);
        sortTree.add(n3);
        sortTree.add(n4);
        sortTree.add(n5);
        sortTree.add(n13);
        sortTree.add(n6);
        sortTree.add(n7);
        sortTree.add(n8);
        sortTree.add(n9);
        sortTree.add(n10);
        sortTree.add(n11);
        sortTree.add(n12);
//        sortTree.midSelect();
//        System.out.println(sortTree.searchByVal(111));
        System.out.println(sortTree.searchParent(13));
        sortTree.delete(13);
        sortTree.midSelect();


    }
}
