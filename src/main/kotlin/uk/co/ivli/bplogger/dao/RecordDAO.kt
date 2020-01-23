package uk.co.ivli.bplogger.dao

import org.springframework.stereotype.Component
import uk.co.ivli.bplogger.repository.RecordRepository

@Component
class RecordDAO(
    val recordRepository: RecordRepository
) {
    fun getRecordById(id: String) = recordRepository.findById(id)
}
