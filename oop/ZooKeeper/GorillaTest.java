public class GorillaTest {
	public static void main(String[] args){
		Gorilla gory = new Gorilla("Harambe", 200);
		System.out.println(gory);
		gory.throwSomething().throwSomething().throwSomething().displayEnergy();
		gory.eatBananas().eatBananas().displayEnergy();
		gory.climb().displayEnergy();
	}
}