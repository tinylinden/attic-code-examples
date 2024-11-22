package eu.tinylinden.attic.core

import eu.tinylinden.attic.core.PersonRecordFixtures.activeJane
import eu.tinylinden.attic.core.PersonRecordFixtures.inactiveJane
import eu.tinylinden.attic.core.PersonRecordFixtures.unregisteredJane
import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

internal class PersonRecordTest {

    @Test
    fun `should register person record`() {
        // given
        val unregistered = unregisteredJane()

        // when
        val actual = register(unregistered, PersonIdFixtures.fixed())

        // then
        expectThat(actual).isEqualTo(inactiveJane())
    }

    @Test
    fun `should activate person record`() {
        // given
        val inactive = inactiveJane()

        // when
        val actual = activate(inactive)

        // then
        expectThat(actual).isEqualTo(activeJane())
    }
}
