package eu.tinylinden.attic.core

internal object PersonRecordFixtures {

    fun unregisteredJane() = PersonRecord.Unregistered(
        email = "jane@local",
    )

    fun inactiveJane() = PersonRecord.Inactive(
        id = PersonIdFixtures.fixed(),
        email = "jane@local"
    )

    fun activeJane() = PersonRecord.Active(
        id = PersonIdFixtures.fixed(),
        email = "jane@local",
    )
}