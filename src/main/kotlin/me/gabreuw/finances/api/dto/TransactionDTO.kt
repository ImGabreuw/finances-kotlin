package me.gabreuw.finances.api.dto

import me.gabreuw.finances.domain.TransactionType
import java.io.Serializable
import java.time.LocalDate

data class TransactionDTO(
    val id: Long?,
    val description: String,
    val amount: Double,
    val date: LocalDate,
    val type: TransactionType,
): Serializable
