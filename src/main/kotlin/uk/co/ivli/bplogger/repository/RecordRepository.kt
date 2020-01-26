package uk.co.ivli.bplogger.repository

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import uk.co.ivli.bplogger.graphql.definitions.Record
import uk.co.ivli.bplogger.graphql.definitions.input.RecordsSortBy
import uk.co.ivli.bplogger.graphql.definitions.input.RecordsWhere

@Repository
interface RecordRepository : MongoRepository<Record, String> {
  fun findAllBySystolic(systolic: Int): List<Record>
  fun findAllByDiastolic(diastolic: Int): List<Record>
}
