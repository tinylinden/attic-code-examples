package eu.tinylinden.attic.ports

import io.mockk.every
import io.mockk.mockk

internal interface PersonRecordRepositoryTrait : Trait {
    val personRecordRepository: PersonRecordRepository
        get() = dependency(PersonRecordRepository::class) {
            mockk {
                // happy-path configuration
                every { save(any()) } answers { firstArg() }
            }
        }
}
