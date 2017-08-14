public class StringManipulation {
	public String trimAndConcat(String str1, String str2) {
		return str1.trim() + str2.trim();
	}
	public String getIndexOrNull(String str, char chr) {
		int index = str.indexOf(chr);
		if(index == -1){
			return null;
		} else {
			return "" + index;
		}
	}
	public String getIndexOrNull2(String str1, String str2) {
		int index = str1.indexOf(str2);
		if(index == -1){
			return null;
		} else {
			return "" + index;
		}
	}
	public String concatSubstring(String str1, int start, int end, String str2) {
		return str1.substring(start, end) + str2;
	}
}