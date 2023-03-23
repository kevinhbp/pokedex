package id.kputro.pkdex.core.entities.base

import java.io.Serializable

open class BaseResponse : Serializable {
  val status: Boolean? = null
  val code: Int? = null
  val message: String? = null
}