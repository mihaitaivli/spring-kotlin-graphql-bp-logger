package uk.co.ivli.bplogger.graphql.resolvers.queries

import com.expediagroup.graphql.spring.operations.Query
import graphql.schema.DataFetchingEnvironment
import java.util.Date
import org.bson.types.ObjectId
import org.springframework.stereotype.Component
import uk.co.ivli.bplogger.dataAccess.RecordDAO
import uk.co.ivli.bplogger.graphql.definitions.Record
import uk.co.ivli.bplogger.graphql.definitions.input.RecordsSortBy
import uk.co.ivli.bplogger.graphql.definitions.input.RecordsWhere

@Component
class RecordsQuery(
  val recordDAO: RecordDAO
) : Query {
    suspend fun records(
//        environment: DataFetchingEnvironment,
        where: RecordsWhere? = null,
        sortBy: RecordsSortBy? = null,
        skip: Int? = null,
        first: Int? = null,
        last: Int? = null,
        before: String? = null,
        after: String? = null
//    ): List<Record>? = listOf(
//        Record(
//            _id = ObjectId().toHexString(),
//            systolic = 140,
//            diastolic = 70,
//            weight = "100",
//            createdAt = Date().toString(),
//            customer_id = ObjectId().toHexString()
//        )
//    )
    ): List<Record>? = recordDAO.getRecordsByFilter(
      where,
      sortBy,
      skip,
      first,
      last,
      after,
      before
      )
}
