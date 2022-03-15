package hufffManTree02;

import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        HuffManTree huffManTree=new HuffManTree("nihaoma wqegdfgerfsdasda");
        Node huffman = huffManTree.createHuffman();
        Map<Byte, String> huffmanCodeDoor = huffManTree.createHuffmanCodeDoor(huffman);
        System.out.print(huffmanCodeDoor.toString()+" ");
        System.out.println();
        byte[] zip = huffManTree.zip(huffmanCodeDoor);
        for(byte b:zip){
            System.out.print(b+" ");
        }
        String s = huffManTree.unZipByte(zip);
        System.out.println();
        System.out.println(s);
        System.out.println(huffManTree.unZip(s, huffmanCodeDoor));
    }
}
