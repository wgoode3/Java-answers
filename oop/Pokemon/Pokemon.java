public class Pokemon {
	
	private String name;
	private String type;
	private int health;
	private static int count = 0;

	public Pokemon(String name, String type, int health){
		this.name = name;
		this.type = type;
		this.health = health;
		this.count++;
	}

	public String getName(){
		return this.name;
	}
	public Pokemon setName(String name){
		this.name = name;
		return this;
	}

	public String getType(){
		return this.type;
	}
	public Pokemon setType(String type){
		this.type = type;
		return this;
	}

	public int getHealth(){
		return this.health;
	}
	public Pokemon setHealth(int health){
		this.health = health;
		return this;
	}

	// @Deprecated
	public void pokeRap(){
		System.out.println("♪ At least " + this.count + " or more to see. ♪");
		System.out.println("♪ To be a Pokémon Master is my destiny. ♪");
	}

}