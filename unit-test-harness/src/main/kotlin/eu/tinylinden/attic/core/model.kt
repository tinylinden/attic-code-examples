package eu.tinylinden.attic.core

import java.util.*

typealias EmailAddress = String
typealias VerifiedEmailAddress = String
typealias PersonId = UUID

sealed interface PersonRecord {
    data class Unregistered(
        val email: EmailAddress,
    ) : PersonRecord

    data class Inactive(
        val id: PersonId,
        val email: EmailAddress,
    ) : PersonRecord

    data class Active(
        val id: PersonId,
        val email: VerifiedEmailAddress,
    ) : PersonRecord
}
