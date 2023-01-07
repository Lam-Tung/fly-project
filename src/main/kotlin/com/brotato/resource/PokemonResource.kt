package com.brotato.resource

import com.brotato.dto.PokemonDTO
import com.brotato.proxy.PokemonApiProxy
import org.eclipse.microprofile.rest.client.inject.RestClient
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/pokemon")
class PokemonResource(@RestClient val pokemonApiProxy: PokemonApiProxy) {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getById(@QueryParam("id") id: Int): Response {
        val pokemon: PokemonDTO = pokemonApiProxy.getById(id)
        return Response.ok(pokemon).build()
    }
}