package com.brotato.resource

import com.brotato.dto.PokemonDTO
import com.brotato.service.PokemonApiService
import org.eclipse.microprofile.rest.client.inject.RestClient
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/pokemon")
class PokemonResource(@RestClient val pokemonApiService: PokemonApiService) {
    @GET
    @Path("/{id}")
    fun getById(id: Int): Set<PokemonDTO> {
        return pokemonApiService.getById(id)
    }
}