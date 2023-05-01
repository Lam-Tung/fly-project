package dto

import com.fasterxml.jackson.annotation.JsonProperty

data class PokemonDTO(
    @JsonProperty("id") var id: Int?,
    @JsonProperty("name") var name: String?,
    @JsonProperty("sprites") var sprites: Sprites?,
    @JsonProperty("height") var height: Int?,
    @JsonProperty("weight") var weight: Int?
)

data class Sprites(
    @JsonProperty("back_default") var backDefault: String?,
    @JsonProperty("back_female") var backFemale: String?,
    @JsonProperty("back_shiny") var backShiny: String?,
    @JsonProperty("back_shiny_female") var backShinyFemale: String?,
    @JsonProperty("front_default") var frontDefault: String?,
    @JsonProperty("front_female") var frontFemale: String?,
    @JsonProperty("front_shiny") var frontShiny: String?,
    @JsonProperty("front_shiny_female") var frontShinyFemale: String?,
)
