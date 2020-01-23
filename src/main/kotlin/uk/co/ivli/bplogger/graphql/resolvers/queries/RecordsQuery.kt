package uk.co.ivli.bplogger.graphql.resolvers.queries

import com.expediagroup.graphql.spring.operations.Query
import graphql.schema.DataFetchingEnvironment
import java.util.Date
import org.bson.types.ObjectId
import org.springframework.stereotype.Component
import uk.co.ivli.bplogger.graphql.definitions.Record
import uk.co.ivli.bplogger.graphql.definitions.input.RecordsSortBy
import uk.co.ivli.bplogger.graphql.definitions.input.RecordsWhere

@Component
class RecordsQuery : Query {
    suspend fun records(
        environment: DataFetchingEnvironment,
        where: RecordsWhere?,
        sortBy: RecordsSortBy?,
        skip: Int?,
        first: Int?,
        last: Int?,
        before: String?,
        after: String?
    ): List<Record>? = listOf(
        Record(
            _id = ObjectId().toHexString(),
            systolic = 140,
            diastolic = 70,
            weight = "100",
            createdAt = Date().toString(),
            customer_id = ObjectId().toHexString()
        )
    )
}
