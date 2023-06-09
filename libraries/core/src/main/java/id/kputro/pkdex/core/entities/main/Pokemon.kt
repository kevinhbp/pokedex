package id.kputro.pkdex.core.entities.main

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Pokemon(
  val id: Int,
  val name: String,
  val types: List<PokeType>,
  val height: Double,
  val weight: Double,
  val stats: List<PokeStat>,
  val abilities: List<PokeAbility>,
  @SerializedName("base_experience")
  val baseExp: Int,
  val species: PokeResult,
  val photoFilePath: String?,
) : Serializable {

  companion object {

    fun getBulbasaur(): Pokemon = Pokemon(
      1, "Bulbasaur",
      listOf(), 1.0, 1.0,
      listOf(), listOf(), 1,
      PokeResult("", ""), null
    )
  }
}