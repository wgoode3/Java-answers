public class SLLTest {
	public static void main(String[] args){
		SinglyLinkedList listy = new SinglyLinkedList();
		System.out.println(listy);
		listy.insert(1).insert(2).insert(3);
		// listy.printValues();
		listy.remove();
		// listy.printValues();
		listy.insert(3).insert(4).insert(5);
		listy.printValues();
		System.out.println("********************");
		listy.removeAt(4);
		listy.printValues();
		System.out.println("********************");
		listy.removeAt(2);
		listy.printValues();
		System.out.println("********************");
		listy.removeAt(0);
		listy.printValues();
	}
}