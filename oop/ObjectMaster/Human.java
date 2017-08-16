public class Human {
	protected String name;
	protected int health = 100;
	protected int strength = 3;
	protected int stealth = 3;
	protected int intelligence = 3;
	public Human(String name){
		this.name = name;
	}
	public void getDamage(int damage){
		this.health -= damage;
	}
	public void heal(int hp){
		this.health += hp;
	}
	public Human attack(Human opponent){
		int damage = this.strength;
		opponent.getDamage(damage);
		return this;
	}
	public Human showHealth(){
		System.out.println(this.name + " has " + this.health + " health left.");
		return this;
	}
}