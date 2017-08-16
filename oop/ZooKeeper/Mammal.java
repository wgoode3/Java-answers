public class Mammal {
	protected String name = "Jacob";
	protected int energy = 100;

	public Mammal(String name, int energy){
		this.name = name;
		this.energy = energy;
	}

	public int displayEnergy(){
		System.out.println(this.name + " has " + this.energy + " energy left.");
		return this.energy;
	}
}