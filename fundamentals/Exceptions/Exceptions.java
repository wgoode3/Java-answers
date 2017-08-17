import java.util.ArrayList;

public class Exceptions {
	public static void main(String[] args) {
		
		// Create ArrayList

		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("hello world");
		myList.add(48);
		myList.add("Goodbye World");
		
		// Try to cast each element to an Integer
		// Use try/catch blocks to handle the exceptions

		int len = myList.size();
		for (int i = 0; i < len; i++){
			try {
				Integer castedValue = (Integer) myList.get(i);
			} catch (ClassCastException e){
				System.out.println("ERROR ON INDEX {" + i + "}");
				System.out.println(e.getMessage());
			}
		}

		// Remove try/catch blocks and use generics to prevent compilation

		/*
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add("13");
		myList.add("hello world");
		myList.add(48);
		myList.add("Goodbye World");
		int len = myList.size();
		for (int i = 0; i < len; i++){
			Integer castedValue = myList.get(i);
		}
		*/
	}
}