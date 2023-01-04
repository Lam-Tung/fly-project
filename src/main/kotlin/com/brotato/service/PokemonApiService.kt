package com.brotato.service

import com.brotato.dto.PokemonDTO
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.QueryParam


@RegisterRestClient(configKey="pokemon-api")
interface PokemonApiService {
    @GET
    @Path("/pokemon/{id}")
    fun getById(@QueryParam("id") id: Int): MutableSet<PokemonDTO>
}