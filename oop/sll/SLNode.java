public class SLNode {
    private int val;
    private SLNode next = null; 

    public SLNode(int val) {
        this.val = val;
    }

    public SLNode getNext(){
        return this.next;
    }

    public void setNext(SLNode node) {
        this.next = node;
    }

    public int getVal(){
        return this.val;
    }

    public void setVal(int val) {
        this.val = val;
    }

}