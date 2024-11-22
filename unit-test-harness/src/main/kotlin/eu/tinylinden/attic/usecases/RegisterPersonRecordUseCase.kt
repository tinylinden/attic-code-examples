package eu.tinylinden.attic.usecases

import eu.tinylinden.attic.core.PersonRecord
import eu.tinylinden.attic.core.personId
import eu.tinylinden.attic.core.register
import eu.tinylinden.attic.ports.PersonRecordRepository

class RegisterPersonRecordUseCase(
    private val repository: PersonRecordRepository,
) : UseCase<PersonRecord.Unregistered, PersonRecord.Inactive> {

    override fun invoke(unregistered: PersonRecord.Unregistered): Result<PersonRecord.Inactive> =
        runCatching {
            repository.save(
                register(unregistered, personId())
            )
        }
}
