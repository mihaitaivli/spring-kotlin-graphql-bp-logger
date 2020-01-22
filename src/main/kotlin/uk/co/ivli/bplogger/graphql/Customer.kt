package uk.co.ivli.bplogger.graphql

import com.expediagroup.graphql.spring.operations.Query
import graphql.schema.DataFetchingEnvironment
import org.springframework.stereotype.Component

@Component
class CustomerQuery : Query {
  suspend fun records(environment: DataFetchingEnvironment): List<Record> = emptyList()
  suspend fun record(environment: DataFetchingEnvironment, recordId: Int): Record? = Record(
        customer = Customer(customerId = "1", name = "Me Myself", records = listOf()),
        systolic = 140,
        diastolic = 80
    ) }

data class Customer(
    val customerId: String,
    val name: String,
    val records: List<Record>? = emptyList()
)

data class Record(
    val customer: Customer? = null,
    val systolic: Int,
    val diastolic: Int
)
