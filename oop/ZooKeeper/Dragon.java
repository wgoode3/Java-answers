public class Dragon extends Mammal {
	public Dragon(String name, int energy){
		super(name, energy);
	}
	public Dragon fly(){
		System.out.println("woosh");
		this.energy -= 50;
		return this;
	}
	public Dragon eatHumans(){
		System.out.println("crunch");
		this.energy += 25;
		return this;
	}
	public Dragon attackTown(){
		System.out.println("raargh");
		this.energy -= 100;
		return this;
	}
}