public class StringManipulationTest {
	public static void main(String[] args) {
		StringManipulation strman = new StringManipulation();
		System.out.println(strman.trimAndConcat("  Hello  ", "  World  "));
		System.out.println(strman.getIndexOrNull("hello", 'o'));
		System.out.println(strman.getIndexOrNull("hello", 'a'));
		System.out.println(strman.getIndexOrNull2("hello world", "world"));
		System.out.println(strman.getIndexOrNull2("hello world", "foo"));
		System.out.println(strman.concatSubstring("hello", 0, 4, "world"));
	}
}