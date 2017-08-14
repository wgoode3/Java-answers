import java.lang.Math;

public class Pythagorean {
	public double calculateHypotenuse(int a, int b) {
		double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return hypotenuse;
	}
}