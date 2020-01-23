package uk.co.ivli.bplogger.graphql.definitions

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

// TODO: Create proper dto's
@Document(collection = "records")
data class Record(
    @Id
    val _id: String,
    val customer_id: String,
    val systolic: Int,
    val diastolic: Int,
    val weight: String,
    val createdAt: String
)
