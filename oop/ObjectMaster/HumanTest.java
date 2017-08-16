public class HumanTest {
	public static void main(String[] args){
		
		Human domon = new Human("Domon");
		Human master_asia = new Human("Master Asia");
		domon.attack(master_asia);
		domon.showHealth();
		master_asia.showHealth();

		Wizard megumin = new Wizard("Megumin");
		megumin.explosion(master_asia);
		megumin.healHuman(domon);
		domon.showHealth();
		master_asia.showHealth();

		Ninja kazuma = new Ninja("Kazuma");
		kazuma.steal(master_asia).showHealth();
		master_asia.showHealth();
		kazuma.runAway().showHealth();

		Samurai darkness = new Samurai("Darkness");
		darkness.deathBlow(master_asia).showHealth();
		darkness.meditate().showHealth();
		int number = darkness.howMany();
		System.out.println(number);
		
	}
}