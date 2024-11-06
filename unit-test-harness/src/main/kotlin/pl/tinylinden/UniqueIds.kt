package pl.tinylinden

import java.util.*

@JvmInline
value class UniqueId<T>(private val value: T)

typealias UserId = UniqueId<UUID>

fun <T> uniqueId(generator: () -> T): UniqueId<T> = UniqueId(generator())

val uid: UserId = uniqueId { UUID.randomUUID() }