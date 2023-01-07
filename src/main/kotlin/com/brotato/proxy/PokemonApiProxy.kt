package com.brotato.proxy

import com.brotato.dto.PokemonDTO
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType


@RegisterRestClient(configKey="pokemon-api")
@Path("/api/v2")
@Produces(MediaType.APPLICATION_JSON)
interface PokemonApiProxy {
    @GET
    @Path("/pokemon/{id}")
    fun getById(@PathParam("id") id: Int): PokemonDTO

    @GET
    @Path("/pokemon/{name}")
    fun getByName(@PathParam("name") name: String): PokemonDTO
}