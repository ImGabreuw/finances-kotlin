package me.gabreuw.finances.infrastructure.repository

import me.gabreuw.finances.domain.Transaction
import org.springframework.data.jpa.repository.JpaRepository

interface TransactionRepository: JpaRepository<Transaction, Long>