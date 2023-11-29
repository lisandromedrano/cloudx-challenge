package org.example.challenge.dto

data class Metadata(
    val name: String?,
    val namespace: String?

)
data class AppInfo(
    val apiVersion: String?,
    val kind: String?,
    val metadata: Metadata?
)