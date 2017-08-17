import java.util.ArrayList;

public class Calculator {
	
	private ArrayList<Object> register = new ArrayList<Object>();
	
	public void performOperation(String operator){
		int len = register.size();
		// operator needs to be added after a number
		if(len % 2 != 0){
			register.add(operator);
		} else {
			System.out.println("Invalid, expected a number.");
		}
	}
	
	public void performOperation(double value){
		int len = register.size();
		// number needs to be added before an operator
		if(len % 2 == 0){
			register.add(value);
		} else {
			System.out.println("Invalid, expected an operator.");
		}
	}
	
	public void printRegister(){
		String display = "";
		int len = register.size();
		for (int i = 0; i < len; i++){
			display += register.get(i) + " ";
		}
		System.out.println(display);
	}
	
	public void clear(){
		register.clear();
		System.out.println("Register cleared!");
	}
	
	public void getResults(){
		if(register.get(register.size()-1) != "="){
			System.out.println("Invalid sequence!");
		} else {
			// check multiplication or division first
			int i = 0;
			while (register.get(i+1) != "="){
				Double a = (Double) register.get(i);
				Double b = (Double) register.get(i+2);
				if(register.get(i+1) == "*"){
					register.set(i, a*b);
				}else if(register.get(i+1) == "/"){
					register.set(i, a/b);
				}
				register.remove(i+1);
				register.remove(i+1);
				i += 2;
			}
			// finish with addition and subtraction
			while (register.get(1) != "="){
				Double a = (Double) register.get(0);
				Double b = (Double) register.get(2);
				if(register.get(1) == "+"){
					register.set(0, a+b);
				}else if(register.get(1) == "-"){
					register.set(0, a-b);
				}
				register.remove(1);
				register.remove(1);
			}
			System.out.println(register.get(0));
		}
	}
}