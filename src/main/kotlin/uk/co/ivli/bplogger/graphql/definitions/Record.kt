package uk.co.ivli.bplogger.graphql.definitions

data class Record(
    val _id: String,
    val customer_id: String,
    val systolic: Int,
    val diastolic: Int,
    val weight: String,
    val createdAt: String
)
