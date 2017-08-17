public class PokemonTest {
	public static void main(String[] args){
		
		Pokemon bulbasaur = new Pokemon("Bulbasaur", "grass/poison", 120);
		Pokemon ivysaur = new Pokemon("Ivysaur", "grass/poison", 240);
		Pokemon venusaur = new Pokemon("Venusaur", "grass/poison", 360);
		
		Pokemon charmander = new Pokemon("Charmander", "fire", 100);
		Pokemon charmeleon = new Pokemon("Charmeleon", "fire", 200);
		Pokemon charizard = new Pokemon("Charizard", "fire/flying", 300);

		Pokemon squirtle = new Pokemon("Squirtle", "water", 110);
		Pokemon warturtle = new Pokemon("Warturtle", "water", 220);
		Pokemon blastoise = new Pokemon("Blastoise", "water", 330);
		
		Pokedex nationalPokédex = new Pokedex();
		Pokemon caterpie = nationalPokédex.createPokemon("Caterpie", "bug", 80);
		Pokemon metapod = nationalPokédex.createPokemon("Metapod", "bug", 100);
		Pokemon butterfree = nationalPokédex.createPokemon("Butterfree", "bug/flying", 180);

		System.out.println(nationalPokédex.pokeInfo(butterfree));
		bulbasaur.pokeRap();

	}
}