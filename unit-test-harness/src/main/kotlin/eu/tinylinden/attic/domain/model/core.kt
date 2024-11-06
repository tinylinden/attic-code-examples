package eu.tinylinden.attic.domain.model

import java.util.*

typealias EmailAddress = String
typealias PersonId = UUID

sealed interface PersonRecord {
    data class New(
        val email: EmailAddress,
    ) : PersonRecord

    data class Active(
        val id: PersonId,
        val email: EmailAddress,
    ) : PersonRecord
}

fun personId(generator: () -> UUID) = generator()

fun activate(from: PersonRecord.New, id: PersonId) = PersonRecord.Active(
    id = id,
    email = from.email,
)