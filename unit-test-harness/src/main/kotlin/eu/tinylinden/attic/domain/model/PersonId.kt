package eu.tinylinden.attic.domain.model

import java.util.*

@JvmInline
value class PersonId(val raw: UUID) {
    companion object {
        fun next(generator: () -> UUID = { UUID.randomUUID() }) =
            PersonId(generator())
    }
}

