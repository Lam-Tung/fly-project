package resource

import dto.PokemonDTO
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import org.eclipse.microprofile.rest.client.inject.RestClient
import restclient.PokemonAPIService
import kotlin.random.Random


@Path("/pokemon")
class PokemonResource (
    @RestClient val pokemonAPIService: PokemonAPIService
) {
    @GET
    @Path("/random")
    fun getRandom(): PokemonDTO? = pokemonAPIService.getById(Random.nextInt(1, 1281))

    @GET
    @Path("/id/{id}")
    fun getById(id: Int?): PokemonDTO? = pokemonAPIService.getById(id)

    @GET
    @Path("/name/{name}")
    fun getByName(name: String?): PokemonDTO? = pokemonAPIService.getByName(name)

}