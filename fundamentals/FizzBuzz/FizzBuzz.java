public class FizzBuzz {
	public String fizzBuzz(int num){
		String result = "";
		if(num % 15 == 0) {
			return result + "FizzBuzz";
		} else if(num % 3 == 0) {
			return result + "Fizz";
		} else if(num % 5 == 0) {
			return result + "Buzz";
		} else {
			return result + num;
		}
	}
}