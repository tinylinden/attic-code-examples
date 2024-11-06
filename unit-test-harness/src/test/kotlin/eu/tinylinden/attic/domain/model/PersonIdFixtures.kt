package eu.tinylinden.attic.domain.model

import java.util.*

internal object PersonIdFixtures {

    fun fixed() = PersonId.next { UUID.fromString("eea84d48-16a5-44a0-a185-0f81e4ce453e") }
}