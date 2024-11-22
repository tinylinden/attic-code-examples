package eu.tinylinden.attic

import io.github.serpro69.kfaker.Faker
import io.github.serpro69.kfaker.faker

internal abstract class FakerAware {
    protected val faker: Faker = faker {}
}
