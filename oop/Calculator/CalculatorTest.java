public class CalculatorTest {
	public static void main(String[] args){
		Calculator calc = new Calculator();

		calc.setOperandOne(12.2).setOperation("+").setOperandTwo(-77.77);
		System.out.println(calc.performOperation().getResult());
		
	}
}