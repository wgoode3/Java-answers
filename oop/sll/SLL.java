import java.util.ArrayList;

public class SLL {
    private SLNode head = null;
    private int length = 0;

    public SLL add(int val) {
        if (this.head == null) {
            this.head = new SLNode(val);
        } else {
            SLNode runner = this.head;
            while(runner.getNext() != null){
                runner = runner.getNext();
            }
            runner.setNext(new SLNode(val));
        }
        this.length++;
        return this;
    }

    public SLL add(int index, int val) {
        SLNode runner = this.head;
        if (runner == null) {
            this.head = new SLNode(val);
        } else if (index % this.length == 0) {
            SLNode temp = this.head;
            this.head = new SLNode(val);
            this.head.setNext(temp);
        } else {
            int t = index < 0 ? (this.length + index) % this.length-1 : index % this.length-1;
            for (int i=0; i<t-1; i++){
                runner = runner.getNext();
            }
            SLNode temp = runner.getNext();
            runner.setNext(new SLNode(val));
            runner.getNext().setNext(temp);
        }
        this.length++;
        return this;
    }

    public SLL add(ArrayList<Integer> arr) {
        SLNode runner = this.head;
        for (int i=0; i<arr.size(); i++) {
            this.add(arr.get(i));    
        }
        return this;
    }

    public Integer remove() {
        SLNode runner = this.head;
        if (runner != null) {
            this.length--;
            if (runner.getNext() == null){
                int val = this.head.getVal();
                this.head = null;
                return val;
            } else {
                while(runner.getNext().getNext() != null){
                    runner = runner.getNext();
                }
                int val = runner.getNext().getVal();
                runner.setNext(null);
                return val;
            }
        }
        return null;
    }

    public Integer remove(int index) {
        SLNode runner = this.head;
        if (runner == null) {
            return null;
        }
        if (index % this.length == 0) {
            int val = this.head.getVal();
            this.head = this.head.getNext();
            this.length--;
            return val;
        } else {
            int t = index < 0 ? (this.length + index) % this.length : index % this.length;
            for (int i=0; i<t-1; i++){
                runner = runner.getNext();
            }
            int val = runner.getNext().getVal();
            runner.setNext(runner.getNext().getNext());
            this.length--;
            return val;
        }
    }

    public SLL removeByVal(int val){
        if (this.head.getVal() == val) {
            this.head = this.head.getNext();
            return this;
        }
        SLNode runner = this.head;
        while (runner.getNext() != null) {
            if(runner.getNext().getVal() == val) {
                runner.setNext(runner.getNext().getNext());
                return this;
            }
            runner = runner.getNext();
        }
        return this;
    }

    public int size() {
        return this.length;
    }

    public ArrayList<Integer> toArray() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        SLNode runner = this.head;
        while(runner != null){
            arr.add(runner.getVal());
            runner = runner.getNext();
        }
        return arr;
    }

}