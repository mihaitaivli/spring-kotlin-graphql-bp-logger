package uk.co.ivli.bplogger.graphql.resolvers.queries

import com.expediagroup.graphql.spring.operations.Query
import graphql.schema.DataFetchingEnvironment
import org.springframework.stereotype.Component
import uk.co.ivli.bplogger.dataAccess.RecordDAO
import uk.co.ivli.bplogger.graphql.definitions.Record

@Component
class RecordQuery(
    val recordDAO: RecordDAO
) : Query {
    suspend fun record(
        environment: DataFetchingEnvironment,
        id: String
    ): Record? = recordDAO.getRecordById(id).get()
}
