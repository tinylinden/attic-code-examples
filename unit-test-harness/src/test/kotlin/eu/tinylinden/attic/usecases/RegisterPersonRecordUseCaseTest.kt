package eu.tinylinden.attic.usecases

import eu.tinylinden.attic.core.PersonRecordFixtures
import eu.tinylinden.attic.ports.PersonRecordRepositoryTrait
import eu.tinylinden.attic.ports.TraitsAware
import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isSuccess

internal class RegisterPersonRecordUseCaseTest :
    TraitsAware(),
    PersonRecordRepositoryTrait {

    private val tested = RegisterPersonRecordUseCase(
        repository = personRecordRepository,
    )

    @Test
    fun `should register person-record`() {
        // given
        val unregistered = PersonRecordFixtures.unregisteredRandom()

        // when
        val actual = tested(unregistered)

        // then
        expectThat(actual).isSuccess()
        // todo: verify correctness
    }
}
