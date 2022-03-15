package sortTree;

public class SortTree {
    public Node root;

    public SortTree(Node root) {
        this.root = root;
    }

    public void add(Node node) {
        if(this.root!=null){
            this.root.add(node);
        }else{
            System.out.println("无根节点");
        }
    }

    public void midSelect(){
        if(root==null){
            System.out.println("无根节点");
        }else{
            root.midSelect();
        }
    }

    public Node searchByVal(int val){
        if(root==null){
            System.out.println("无根节点");
            return null;
        }else{
            return root.searchByVal(val);
        }
    }

    public void delete(int val){
        if(root==null){
            System.out.println("无根节点");
        }else{
            root.deleteByVal(val);
        }
    }
    public Node searchParent(int val){
        if(root==null){
            System.out.println("无根节点");
            return null;
        }else{
            return root.parentSearch(val);
        }
    }

}
