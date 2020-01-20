package uk.co.ivli.bplogger.graphql

import com.expediagroup.graphql.spring.operations.Query
import graphql.schema.DataFetchingEnvironment
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository

@Component
class CustomerQuery : Query {
  suspend fun getRecords(environment: DataFetchingEnvironment):  List<Record> = emptyList()
  suspend fun getRecord(environment: DataFetchingEnvironment, recordId: Int): Record? = Record(
		customer = Customer(customerId = "1", firstName = "Me", records = listOf()),
		systolic = "140",
		diastolic = "80"
    )}

data class Customer (
  val customerId: String,
  val firstName: String,
  val records: List<Record?>
)

data class Record (
    val customer: Customer,
    val systolic: String,
    val diastolic: String
)

