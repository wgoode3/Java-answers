import java.util.ArrayList;

public class ExceptionallyGeneric {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        // Try to cast each element to an Integer
        // Use try/catch blocks to handle the exceptions
        for (int i=0; i<myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            }
            catch (ClassCastException e) {
                System.out.println(String.format("ERROR ON INDEX {%d}", i));
            }
        }

        // Remove try/catch blocks and use generics to prevent compilation

        /*
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        */

    }
}