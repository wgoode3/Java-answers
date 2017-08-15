public class SinglyLinkedNode {
	private int val;
	private SinglyLinkedNode next = null;
	public SinglyLinkedNode(int val){
		this.val = val;
	}
	public int getVal(){
		return this.val;
	}
	public void setVal(int val){
		this.val = val;
	}
	public SinglyLinkedNode getNext(){
		return this.next;
	}
	public void setNext(SinglyLinkedNode node){
		this.next = node;
	}
}