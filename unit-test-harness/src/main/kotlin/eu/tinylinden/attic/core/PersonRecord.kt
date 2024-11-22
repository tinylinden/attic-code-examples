package eu.tinylinden.attic.core

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

fun register(unregistered: PersonRecord.Unregistered, id: PersonId): PersonRecord.Inactive =
    PersonRecord.Inactive(id, unregistered.email)

fun activate(inactive: PersonRecord.Inactive): PersonRecord.Active =
    PersonRecord.Active(inactive.id, inactive.email)
