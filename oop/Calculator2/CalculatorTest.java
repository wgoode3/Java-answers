public class CalculatorTest {
	public static void main(String[] args){
		Calculator calc = new Calculator();
		calc.performOperation(10);
		calc.performOperation("*");
		calc.performOperation(5.4);
		calc.performOperation("+");
		calc.performOperation(22.2);
		calc.performOperation("/");
		calc.performOperation(6);
		calc.performOperation("-");
		calc.performOperation(3.9);
		calc.performOperation("=");
		calc.printRegister();
		calc.getResults();
	}
}