package uk.co.ivli.bplogger.graphql

import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
class CustomerQuery : Query {
  fun getCustomer():  Customer = Customer(customerId = "1", firstName = "me")
}

data class Customer (
  val customerId: String,
  val firstName: String,
  val middleNames: String? = null,
  val lastName: String? = null,
  val dateOfBirth : String? = null,
  val email: String? = null
//  val records: List<Record?>
)

//data class Record (
//    val customer: Customer,
//    val systolic: String,
//    val diastolic: String
//)

