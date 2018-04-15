import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        SLL listy = new SLL();
        System.out.println(listy.add(1).add(2).add(3).toArray());
        System.out.println(listy.add(0, 200).toArray());
        System.out.println(listy.remove(-1));
        System.out.println(listy.toArray());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=4; i<7; i++){
            arr.add(i);
        }
        System.out.println(listy.add(arr).toArray());
        System.out.println(listy.removeByVal(5).toArray());
    }
}