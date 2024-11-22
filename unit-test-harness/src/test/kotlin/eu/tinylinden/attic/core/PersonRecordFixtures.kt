package eu.tinylinden.attic.core

import eu.tinylinden.attic.FakerAware

internal object PersonRecordFixtures : FakerAware() {

    fun unregisteredJane() = PersonRecord.Unregistered(
        email = "jane@local",
    )

    fun unregisteredRandom() = PersonRecord.Unregistered(
        email = faker.internet.safeEmail()
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
