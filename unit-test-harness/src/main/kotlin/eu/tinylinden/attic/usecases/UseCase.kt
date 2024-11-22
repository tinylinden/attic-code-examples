package eu.tinylinden.attic.usecases

fun interface UseCase<T, R> : (T) -> Result<R>
