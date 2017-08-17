public class Pokedex extends PokemonAbstract {
	public String pokeInfo(Pokemon pokemon){
		return "Name: " + pokemon.getName() + ", Type: " + pokemon.getType() + ", Health: " + pokemon.getHealth();
	}
}