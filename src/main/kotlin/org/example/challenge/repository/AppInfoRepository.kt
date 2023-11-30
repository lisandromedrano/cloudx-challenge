package org.example.challenge.repository

import org.example.challenge.domain.AppInfo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AppInfoRepository : JpaRepository<AppInfo, Long>