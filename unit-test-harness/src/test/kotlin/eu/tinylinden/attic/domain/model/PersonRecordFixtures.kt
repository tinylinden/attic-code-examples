package eu.tinylinden.attic.domain.model

internal object PersonRecordFixtures {

    fun newJane() = PersonRecord.New(
        email = "jane@local",
    )

    fun activeJane() = PersonRecord.Active(
        id = PersonIdFixtures.fixed(),
        email = "jane@local",
    )
}