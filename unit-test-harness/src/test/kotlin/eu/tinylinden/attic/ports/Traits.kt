package eu.tinylinden.attic.ports

import kotlin.reflect.KClass

internal interface Trait {
    val dependencies: MutableMap<KClass<*>, Any>

    @Suppress("UNCHECKED_CAST")
    fun <T : Any> dependency(type: KClass<T>, onMissing: () -> T): T =
        dependencies.getOrPut(type) { onMissing() } as T
}

internal abstract class TraitsAware : Trait {
    override val dependencies: MutableMap<KClass<*>, Any> = mutableMapOf()
}
