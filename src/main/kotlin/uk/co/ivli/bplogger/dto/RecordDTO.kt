package uk.co.ivli.bplogger.dto

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class RecordDTO(
    @Id
    val _id: String,
    val customer_id: String,
    val systolic: Int,
    val diastolic: Int,
    val weight: String,
    val createdAt: String
)
