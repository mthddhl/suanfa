package base;

import java.util.HashMap;
import java.util.Map;

public class NodeTree {
    public Node header;

    public NodeTree(Node header) {
        this.header = header;
    }
    public void preSelect(){
        if(header!=null){
            header.preSelect();
        }else{
            System.out.println("头节点为空");
        }
    }
    public void dackSelect(){
        if(header!=null){
            header.dackSelect();
        }else{
            System.out.println("头节点为空");
        }
    }
    public void midSelect(){
        if(header!=null){
            header.midSelect();
        }else{
            System.out.println("头节点为空");
        }
    }
    public int maxLength(){
        if(header!=null){
            return header.maxLength();
        }else{
//            System.out.println("头节点为空");
            return 0;
        }
    }

}
