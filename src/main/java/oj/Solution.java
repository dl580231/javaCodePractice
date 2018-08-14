/*package oj;

class Solution {
	public int getNumber(ListNode node,int i) {
		if(node.next==null) {
			return (int) (Math.pow(10,i)*node.val);
		}
		return (int) ((Math.pow(10,i)*node.val)+getNumber(node.next,i+1));
	}
	public ListNode getNode(Integer num,ListNode node) {
		String s1=num+"";
		char[] array = s1.toCharArray();
		ListNode node1=null;
		node.val=array[array.length-1];
		node.next=node1;
		for (int i=array.length-2;i>=0;i--) {
			node1.val=array[i];
			node1=node1.next;
		}
		return node;
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int sum=getNumber(l1, 0)+getNumber(l2, 0);
		
	        
	    }
	public static void main(String args[]) {
		
	}
}
*/