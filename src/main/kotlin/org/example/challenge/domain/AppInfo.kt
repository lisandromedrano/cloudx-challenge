package org.example.challenge.domain

import javax.persistence.*

@Entity
@Table(name="app_info")
data class AppInfo(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val apiVersion: String="",
    val kind: String="",
    val name: String="",
    val namespace: String=""
)