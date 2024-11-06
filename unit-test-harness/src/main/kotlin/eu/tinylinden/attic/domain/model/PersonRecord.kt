package eu.tinylinden.attic.domain.model

sealed interface PersonRecord {

    data class New(
        val email: EmailAddress,
    ) : PersonRecord

    data class Active(
        val id: PersonId,
        val email: EmailAddress,
    ) : PersonRecord
}

fun activate(record: PersonRecord.New, id: () -> PersonId) = PersonRecord.Active(
    id = id(),
    email = record.email,
)