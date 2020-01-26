package uk.co.ivli.bplogger.dataAccess

import org.springframework.stereotype.Component
import uk.co.ivli.bplogger.graphql.definitions.Record
import uk.co.ivli.bplogger.graphql.definitions.input.RecordsSortBy
import uk.co.ivli.bplogger.graphql.definitions.input.RecordsWhere
import uk.co.ivli.bplogger.repository.RecordRepository

@Component
class RecordDAO(
    val recordRepository: RecordRepository
) {
    fun getRecordById(id: String) = recordRepository.findById(id)
    fun getRecordsByFilter(
      where: RecordsWhere?,
      sortBy: RecordsSortBy?,
      skip: Int?,
      first: Int?,
      last: Int?,
      before: String?,
      after: String?
    ) :List<Record>? {
      return if (where != null) emptyList()
      else recordRepository.findAll()
    }
}
