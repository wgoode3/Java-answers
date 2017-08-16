public class DragonTest {
	public static void main(String[] args){
		Dragon granberia = new Dragon("Granberia", 300);
		System.out.println(granberia);
		granberia.attackTown().attackTown().attackTown().displayEnergy();
		granberia.eatHumans().eatHumans().displayEnergy();
		granberia.fly().fly().displayEnergy();
	}
}