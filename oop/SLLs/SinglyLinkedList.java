public class SinglyLinkedList {
	private SinglyLinkedNode head = null;
	public SinglyLinkedList insert(int val){
		if(this.head == null){
			SinglyLinkedNode node = new SinglyLinkedNode(val);
			this.head = node;
			return this;
		}
		SinglyLinkedNode runner = this.head;
		while(runner.getNext() != null){
			runner = runner.getNext();
		}
		SinglyLinkedNode node = new SinglyLinkedNode(val);
		runner.setNext(node);
		return this;
	}
	public void printValues(){
		if(this.head != null){
			SinglyLinkedNode runner = this.head;
			while(runner != null){
				int nodeVal = runner.getVal();
				System.out.println(nodeVal);
				runner = runner.getNext();
			}
		}
	}
	public SinglyLinkedNode findInt(int val){
		SinglyLinkedNode runner = this.head;
		while(runner != null){
			if(runner.getVal() == val){
				return runner;
			}else{
				runner = runner.getNext();
			}
		}
		return null;
	}
	public SinglyLinkedList remove(){
		SinglyLinkedNode runner = this.head;
		while(runner.getNext().getNext() != null){
			runner = runner.getNext();
		}
		runner.setNext(null);
		return this;
	}
	public boolean removeAt(int val){
		SinglyLinkedNode runner = this.head;
		// catches if first value
		if(val == 0){
			this.head = runner.getNext();
			return true;
		} else {
			// removes in between values
			while(runner.getNext().getNext() != null){
				if(val == 1){
					runner.setNext(runner.getNext().getNext());
					return true;
				}
				val--;
				runner = runner.getNext();
			}
			// catches if last value
			if(val == 1){
				runner.setNext(null);
				return true;
			}
		}
		return false;
	}
}