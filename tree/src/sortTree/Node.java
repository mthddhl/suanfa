package sortTree;

public class Node {
    public int data;
    public Node left;
    public Node right;

    public void add(Node node) {
        if(this==null){
            System.out.println("空树，无法插值");
        }
        if(node.data>this.data){
            if(this.right!=null){
                this.right.add(node);
            }else{
                this.right=node;
            }
        }else{
            if(this.left!=null){
                this.left.add(node);
            }else{
                this.left=node;
            }
        }
    }

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }

    public void midSelect(){
        if(this.left!=null){
            this.left.midSelect();;
        }
        System.out.println(this.data);
        if(this.right!=null){
            this.right.midSelect();
        }
    }

    public Node searchByVal(int val){
        if(val==this.data){
            return this;
        }
        if(val>this.data){
            if(this.right==null){
                return null;
            }
            return this.right.searchByVal(val);
        }else{
            if(this.left==null){
                return null;
            }
            return this.left.searchByVal(val);
        }
    }

    public Node parentSearch(int val){
        if(val>this.data){
            if(this.right==null){
                return null;
            }
            if(this.right.data==val){
                return this;
            }
            return this.right.parentSearch(val);
        }else{
            if(this.left==null){
                return null;
            }
            if(this.left.data==val){
                return this;
            }
            return this.left.parentSearch(val);
        }
    }
    public void deleteByVal(int val){
        if(this==null){
            System.out.println("树为空");
        }
        Node node = searchByVal(val);
        if(node==null){
            System.out.println("无此节点");
            return;
        }
        Node parent = parentSearch(val);
        if(node.left==null && node.right==null){
            if(parent.left.data==val){
                parent.left=null;
            }
            if(parent.right.data==val){
                parent.right=null;
            }
        }
        if(node.right!=null && node.left==null) {
            if(parent.left.data==node.data){
                parent.left=node.right;
            }
            if(parent.right.data==node.data){
                parent.right=node.right;
            }
        }
        if(node.left!=null && node.right==null) {
            if(parent.left.data==node.data){
                parent.left=node.left;
            }
            if(parent.right.data==node.data){
                parent.right=node.left;
            }
        }
        if(node.right!=null && node.left!=null){
            Node n1=node.left;
            if(n1.right==null){
                if(parent.right.data==node.data){
                    parent.right=n1;
                    n1.right=node.right;
                    return;
                }
                if(parent.left.data==node.data){
                    parent.left=n1;
                    n1.right=node.right;
                    return;
                }
            }
            while(n1.right!=null){
                n1=n1.right;
                parentSearch(n1.data).right=null;
            }
            if(parent.left.data==node.data){
                parent.left.data=n1.data;
            }
            if(parent.right.data==node.data){
                parent.right.data=n1.data;
            }
        }
    }
}
