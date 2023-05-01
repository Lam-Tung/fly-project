package restclient

import dto.PokemonDTO
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.PathParam
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient

@RegisterRestClient(configKey="pokemon-api")
interface PokemonAPIService {
    @GET
    @Path("/pokemon/{id}")
    fun getById(@PathParam("id") id: Int?): PokemonDTO?

    @GET
    @Path("/pokemon/{name}")
    fun getByName(@PathParam("name") name: String?): PokemonDTO?
}