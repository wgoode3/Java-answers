public class Ninja extends Human {
	public Ninja(String name){
		super(name);
		this.stealth = 10;
	}
	public Ninja steal(Human target){
		int damage = this.stealth;
		this.heal(damage);
		target.getDamage(damage);
		System.out.println(this.name + " steals " + damage + " hp from " + target.name);
		return this;
	}
	public Ninja runAway(){
		this.getDamage(10);
		System.out.println(this.name + " runs away!");
		return this;
	}
}