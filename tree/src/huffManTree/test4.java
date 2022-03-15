package huffManTree;

import java.util.Collections;

public class test4 {
    public static void main(String[] args) {
        int[] nums=new int[49];
        for(int i=0;i<nums.length;i++){
            nums[i]=2*i;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=2*i+1;
        }
        System.out.println();
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode temp;
//        ListNode node;
//        while(list1!=null && list2!=null){
//            if(list1.val>=list2.val){
//                node.val=list2.val;
//                list2=list2.next;
//            }else {
//                node.val=list1.val;
//                list1=list1.next;
//            }
//            if(list1==null || list2==null){
//                break;
//            }
//            node.next=new ListNode();
//            node=node.next;
//        }
//        while(list1!=null){
//            if(node ==null){
//                node=new ListNode();
//                temp=node;
//            }else {
//                node.next = new ListNode();
//                node = node.next;
//            }
//            node.val=list1.val;
//            list1=list1.next;
//        }
//        while(list2!=null){
//            if(node ==null){
//                node=new ListNode();
//                temp=node;
//            }else {
//                node.next = new ListNode();
//                node = node.next;
//            }
//            node.val=list2.val;
//            list2=list2.next;
//        }
//        return temp;
        return null;
    }
}
class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {

    }
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
