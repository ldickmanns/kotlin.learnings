package docs.basics.idioms

/********************************
 * Kotlin Learnings             *
 * @kotlin.learnings            *
 ********************************
 * Default and Named Parameters *
 ********************************/

enum class FileType(val extension: String) {
    CSV("CSV"),
    EXCEL("xlsx")
}

/** Function with a Default Parameter */
fun appendExtension(
    name: String,
    fileType: FileType = FileType.CSV // Default parameter
): String = "$name.${fileType.extension}"


fun main() {
    /** Calling a function with a Named Parameter */
    println(appendExtension("table", fileType = FileType.EXCEL))
    // Output: table.xlsx
}
