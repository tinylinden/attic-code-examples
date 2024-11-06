package eu.tinylinden.attic.domain.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PersonRecordTest {

    @Test
    fun `should activate person record`() {
        // given
        val new = PersonRecordFixtures.newJane()

        // when
        val actual = activate(record = new, id = { PersonIdFixtures.fixed() })

        // then
        assertThat(actual).isEqualTo(PersonRecordFixtures.activeJane())
    }
}

