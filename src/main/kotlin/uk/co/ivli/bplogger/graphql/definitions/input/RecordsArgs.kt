package uk.co.ivli.bplogger.graphql.definitions.input

data class RecordsWhere(
    val systolic: Int? = null,
    val systolic_not: Int? = null,
    val systolic_in: List<Int>? = null,
    val systolic_gt: Int? = null,
    val systolic_gte: Int? = null,
    val systolic_lt: Int? = null,
    val systolic_lte: Int? = null,
    val diastolic: Int? = null,
    val diastolic_not: Int? = null,
    val diastolic_in: List<Int>? = null,
    val diastolic_gt: Int? = null,
    val diastolic_gte: Int? = null,
    val diastolic_lt: Int? = null,
    val diastolic_lte: Int? = null,
    val createdAt: String? = null,
    val createdAt_gt: String? = null,
    val createdAt_gte: String? = null,
    val createdAt_lt: String? = null,
    val createdAt_lte: String? = null
)

enum class RecordsSortBy {
    systolic_ASC,
    systolic_DESC,
    diastolic_ASC,
    diastolic_DESC,
    createdAt_ASC,
    createdAt_DESC
}
