import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    public List<String> list;

    public int[][] edges;

    public int edgesNum;

    public boolean[] isThou;

    public Graph(int x){
        this.list=new ArrayList<String>(x);
        this.edges=new int[x][x];
        this.isThou=new boolean[x];
    }

    public void inserElement(String s){
        list.add(s);
    }

    public void insertEdge(int x,int y,int w){
        edges[x][y]=w;
        edges[y][x]=w;
        edgesNum++;
    }

    public int getEdge(int i){
        for(int j=0;j<edges[i].length;j++){
            if(edges[i][j]==1){
                return j;
            }
        }
        return -1;
    }

    public int getEdge(int i,int m){
        for(int j=m+1;j<edges[i].length;j++){
            if(edges[i][j]==1){
                return j;
            }
        }
        return -1;
    }

    public void dfs(int i){
        if(isThou[i]==false){
            System.out.println(list.get(i));
        }
        isThou[i]=true;
        int w=getEdge(i);
        while(w!=-1){
            if(isThou[w]==false){
                dfs(w);
            }
            w=getEdge(i,w);
        }
    }

    public void dfs1(int m){
        if(!isThou[m]) {
            for (int i = 0; i < edges.length; i++) {
                dfs(i);
            }
        }
    }

    public void bfs(int i){
        if(!isThou[i]) System.out.println(list.get(i));
        isThou[i]=true;
        int u;
        int w;
        LinkedList<Integer> linkedList=new LinkedList();
        linkedList.addLast(i);
        while(!linkedList.isEmpty()){
            u=linkedList.removeFirst();
            w=getEdge(u);
            while (w!=-1){
                if(!isThou[w]) {
                    System.out.println(list.get(w));
                    isThou[w] = true;
                    linkedList.add(w);
                }
                w=getEdge(u,w);
            }
        }
    }
    public void bfs(){
        for(int i=0;i<list.size();i++){
            bfs(i);
        }
    }

}
