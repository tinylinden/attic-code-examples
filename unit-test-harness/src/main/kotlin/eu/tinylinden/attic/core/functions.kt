package eu.tinylinden.attic.core

import java.util.*

fun personId(generator: () -> UUID) = generator()

fun register(unregistered: PersonRecord.Unregistered, id: PersonId): PersonRecord.Inactive =
    PersonRecord.Inactive(id, unregistered.email)

fun activate(inactive: PersonRecord.Inactive): PersonRecord.Active =
    PersonRecord.Active(inactive.id, inactive.email)
