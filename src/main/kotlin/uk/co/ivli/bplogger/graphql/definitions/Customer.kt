package uk.co.ivli.bplogger.graphql.definitions

// Customer won't hold a list of records
// in order to avoid maintaining an up-to-date list of references

data class Customer(
    val _id: String,
    val name: String,
    val dateOfBirth: String,
    val registrationDate: String,
    val email: String,
    val phone: String,
    val password: String
)
