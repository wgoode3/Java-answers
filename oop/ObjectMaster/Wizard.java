public class Wizard extends Human {
	protected int mana = 100;
	public Wizard(String name){
		super(name);
		this.health = 50;
		this.intelligence = 8;
	}
	public Wizard healHuman(Human target){
		int hp = this.intelligence;
		target.heal(hp);
		System.out.println(this.name + " heals " + target.name + " by " + hp + " health.");
		return this;
	}
	public Wizard explosion(Human target){
		int damage = this.intelligence * 3;
		target.getDamage(damage);
		System.out.println(this.name + " casts explosion, damaging " + target.name + " by " + damage);
		this.mana -= 50;
		return this;
	}
}