public class Samurai extends Human {
	private static int count = 0;
	public Samurai(String name){
		super(name);
		this.health = 200;
		this.count++;
	}
	public Samurai deathBlow(Human target){
		int hp = target.health;
		target.getDamage(hp);
		hp = this.health / 2;
		this.getDamage(hp);
		System.out.println(this.name + " decapitates " + target.name + "!");
		return this;
	}
	public Samurai meditate(){
		int hp = this.health / 2;
		this.heal(hp);
		System.out.println(this.name + " heals by " + hp + "!");
		return this;
	}
	public int howMany(){
		if(count == 1){
			System.out.println(this.name + " is the last samurai!");
		}
		return count;
	}
}