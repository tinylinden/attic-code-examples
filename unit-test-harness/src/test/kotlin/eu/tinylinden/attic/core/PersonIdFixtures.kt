package eu.tinylinden.attic.core

import java.util.*

internal object PersonIdFixtures {

    private val fixed = UUID.randomUUID()

    fun fixed() = personId { fixed }
}
