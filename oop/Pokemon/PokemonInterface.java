public interface PokemonInterface {
	Pokemon createPokemon(String name, String type, int health);
	void attackPokemon(Pokemon pokemon);
	String pokeInfo(Pokemon pokemon);
}