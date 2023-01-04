package com.brotato.dto

import com.fasterxml.jackson.annotation.JsonProperty


data class PokemonDTO (
    @JsonProperty("id")
    val id: Int,
    @JsonProperty("name")
    val name: String,
    @JsonProperty("sprites")
    val sprites: Sprites
)

data class Sprites (
    @JsonProperty("front")
    val front: String,
    @JsonProperty("back")
    val back: String
)