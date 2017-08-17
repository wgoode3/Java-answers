public class Calculator {
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double result; 

	public Calculator setOperandOne(double operand){
		this.operandOne = operand;
		return this;
	}
	public Calculator setOperandTwo(double operand){
		this.operandTwo = operand;
		return this;
	}
	public Calculator setOperation(String operation){
		this.operation = operation;
		return this;
	}

	public Calculator performOperation(){
		if(operation == "plus" || operation == "+"){
			this.result = this.operandOne + this.operandTwo;
		}else if(operation == "minus" || operation == "-"){
			this.result = this.operandOne - this.operandTwo;
		}
		return this;
	}

	public double getResult(){
		return this.result;
	}

}