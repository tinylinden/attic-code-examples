package eu.tinylinden.attic.core

import java.util.*

typealias PersonId = UUID

fun personId(generator: () -> UUID = { UUID.randomUUID() }) = generator()
