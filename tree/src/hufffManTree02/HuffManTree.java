package hufffManTree02;

import java.util.*;

public class HuffManTree {
    public String s;

    public List<Node> list=new ArrayList<>();

    public Map<Byte,String> codeMap=new HashMap<>();

    public StringBuilder stringBuilderCode=new StringBuilder();

    public HuffManTree() {
    }

    public HuffManTree(String s) {
        this.s = s;
    }

    public void getMapList(){
        Map<Byte,Integer> map=new HashMap<>();
        byte[] bytes=s.getBytes();
        for(byte b:bytes){
            Integer integer = map.get(b);
            if(integer==null){
                map.put(b,1);
            }else{
                map.put(b,integer+1);
            }
        }
        Set<Byte> bytes1 = map.keySet();
        for(Byte s2:bytes1){
            list.add(new Node(s2,map.get(s2)));
        }
    }

    public Node createHuffman(){
        getMapList();
        while(list.size()>1) {
            Collections.sort(list);
            Node left = list.get(0);
            Node right = list.get(1);
            Node root = new Node(left.weight + right.weight);
            root.left=left;
            root.right=right;
            list.remove(left);
            list.remove(right);
            list.add(root);
        }
        return list.get(0);
    }

    public void createHuffmanCode(Node node,String code,StringBuilder stringBuilder){
        StringBuilder stringBuilder1=new StringBuilder(stringBuilder);
        stringBuilder1.append(code);
        if(node!=null){
            if(node.date==null){
                createHuffmanCode(node.left,"0",stringBuilder1);
                createHuffmanCode(node.right,"1",stringBuilder1);
            }else{
                codeMap.put(node.date,stringBuilder1.toString());
            }
        }
    }

    public Map<Byte,String> createHuffmanCodeDoor(Node node){
        if(node==null){
            return null;
        }
        createHuffmanCode(node.left,"0",stringBuilderCode);
        createHuffmanCode(node.right,"1",stringBuilderCode);
        return codeMap;
    }

    public byte[] zip(Map<Byte,String> map){
        byte[] bytes1 = s.getBytes();
        int size;
        StringBuilder stringBuilder=new StringBuilder();
        for(byte b : bytes1){
            stringBuilder.append(map.get(b));
        }
        String s=stringBuilder.toString();
        if(s.length()%8!=0){
            size=s.length()/8+1;
        }else{
            size=s.length()/8;
        }
        byte[] b2=new byte[size];
        int index=0;
        for(int i=0;i<s.length();i+=8){
            if(i+8<s.length()){
                b2[index] = (byte) Integer.parseInt(s.substring(i, i + 8), 2);
            }else{
                b2[index]=(byte) Integer.parseInt(s.substring(i),2);
            }
            index++;
        }
        return b2;
    }

    public String unZipByte(byte[] bytes){
        StringBuilder stringBuilder=new StringBuilder();
        int temp;
        for(int i=0;i<bytes.length;i++){
            if(i!=bytes.length-1) {
                temp =bytes[i];
                temp |= 256;
                String s = Integer.toBinaryString(temp);
                stringBuilder.append(s.substring(s.length() - 8));
            }else{
                if(bytes[i]<0) {
                    String s = Integer.toBinaryString(bytes[i]);
                    stringBuilder.append(s.substring(s.length() - 8));
                }else{
                    String s = Integer.toBinaryString(bytes[i]);
                    stringBuilder.append(s);
                }
            }
        }
        return stringBuilder.toString();
    }

    public String unZip(String s,Map<Byte,String> map){
        Map<String,Byte> map2=new HashMap<String,Byte>();
        Set<Byte> bytes = map.keySet();
        for(Byte b : bytes){
            map2.put(map.get(b),b);
        }
        int left=0;
        int right=0;
        List<Byte> list=new ArrayList<>();
        while (right<=s.length()){
            String substring = s.substring(left, right);
            Byte aByte = map2.get(substring);
            if(aByte!=null){
                list.add(aByte);
                left=right;
            }
            right++;
        }
        byte[] b2=new byte[list.size()];
        for(int i=0; i<list.size(); i++){
            b2[i]=list.get(i);
        }
        String s3=new String(b2);
        return s3;

    }



}
