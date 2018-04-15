public class FizzBuzz {
    public String buzzFizz(int num) {
        if (num % 15 == 0) {
            return "FizzBuzz";  
        } else if (num % 5 == 0) {
            return "Buzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else {
            return Integer.toString(num);
        }
    }
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        for (int i=0; i<100; i++) {
            System.out.println(fb.buzzFizz(i));
        }
    }
}