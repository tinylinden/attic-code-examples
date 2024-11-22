package eu.tinylinden.attic.ports

import eu.tinylinden.attic.core.PersonRecord

interface PersonRecordRepository {
    fun <T : PersonRecord> save(record: T): T
}
