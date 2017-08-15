import java.util.Random;

public class Puzzle {
	public int[] reduceArray(int[] arr, int val) {
		int num = 0;
		int len = arr.length;
		for (int i = 0; i < len; i++){
			if(arr[i] > val){
				num++;
			}
		}
		int[] newArr;
		int counter = 0;
		newArr = new int[num];
		for (int i = 0; i < len; i++){
			if(arr[i] > val){
				newArr[counter] = arr[i];
				counter ++;
			}
		}
		return newArr;
	}
	public String[] shuffleNamesArray(String[] names) {
		int len = names.length;
		String tmp;
		Random rand = new Random();
		for (int i = 0; i < len; i++){
			int index = rand.nextInt(len-1) + 1;
			tmp = names[i];
			names[i] = names[index];
			names[index] = tmp;
		}
		int num = 0;
		for (int i = 0; i < len; i++){
			if(names[i].length() > 5){
				num++;
			}
		}
		String[] newNames;
		newNames = new String[num];
		int counter = 0;
		for (int i = 0; i < len; i++){
			if(names[i].length() > 5){
				newNames[counter] = names[i];
				counter++;
			}
		}
		return newNames;
	}
	public void letters() {
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		Random rand = new Random();
		char tmp;
		for (int i = 0; i < 25; i++){
			int index = rand.nextInt(25) + 1;
			tmp = alphabet[i];
			alphabet[i] = alphabet[index];
			alphabet[index] = tmp;
		}
		System.out.println(alphabet[25]);
		System.out.println(alphabet[0]);
		if(alphabet[0] == 'a' || alphabet[0] == 'e' || alphabet[0] == 'i' || alphabet[0] == 'o' || alphabet[0] == 'u'){
			System.out.println("it's a vowel");
		}
	}
	public int[] randomNumbers() {
		Random rand = new Random();
		int[] arr;
		arr = new int[10];
		for (int i = 0; i < 10; i++){
			arr[i] = rand.nextInt(46) + 55;
		}
		return arr;
	}
	public void randomSortedNumbers() {
		Random rand = new Random();
		int[] arr;
		arr = new int[10];
		for (int i = 0; i < 10; i++){
			arr[i] = rand.nextInt(46) + 55;
		}
		// bubble sort
		int tmp;
		for (int i = 0; i < 10; i++){
			for (int j = 1; j < 10 - i; j++){
				if(arr[j-1] > arr[j]){
					tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for (int i = 0; i < 10; i++){
			System.out.println(arr[i]);
		}
		System.out.println("Min is: " + arr[0]);
		System.out.println("Max is: " + arr[9]);
	}
	public String randomString() {
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		Random rand = new Random();
		String str = "";
		for(int i = 0; i < 5; i++){
			str += alphabet[rand.nextInt(26)];
		}
		return str;
	}
	public String[] randomStrings(){
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		Random rand = new Random();
		String[] words;
		words = new String[10];
		int counter = 0;
		for (int i = 0; i < 10; i++){
			String str = "";
			for(int j = 0; j < 5; j++){
				str += alphabet[rand.nextInt(26)];
			}
			words[i] = str;
		}
		return words;
	}
}