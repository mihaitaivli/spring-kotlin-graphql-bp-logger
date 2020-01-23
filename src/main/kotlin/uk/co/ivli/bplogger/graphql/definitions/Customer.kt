package uk.co.ivli.bplogger.graphql.definitions

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

// Customer won't hold a list of records
// in order to avoid maintaining an up-to-date list of references

@Document(collection = "customers")
data class Customer(
    @Id
    val _id: String,
    val name: String,
    val dateOfBirth: String,
    val registrationDate: String,
    val email: String,
    val phone: String,
    val password: String
)
