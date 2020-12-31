public class PokemonTest extends Pokedex{
    public static void main(String[] args){
        Pokedex pokedex = new Pokedex();
        Pokemon bulbasaur = pokedex.createPokemon("Bulbasaur","ice",300);
        Pokemon caterpie = pokedex.createPokemon("Caterpie ","bug",75);

        pokedex.attackPokemon(bulbasaur);
        pokedex.pokemonInfo(bulbasaur);
        pokedex.pokemonInfo(caterpie);
        
    }
}

