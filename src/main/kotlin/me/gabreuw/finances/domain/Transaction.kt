package me.gabreuw.finances.domain

import java.time.LocalDate
import javax.persistence.*
import javax.persistence.EnumType.STRING
import javax.persistence.GenerationType.IDENTITY

@Entity
data class Transaction(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    val id: Long?,

    @Column(nullable = false)
    val description: String,

    @Column(nullable = false)
    val amount: Double,

    @Enumerated(STRING)
    @Column(nullable = false)
    val type: TransactionType,

    @Column(nullable = false)
    val date: LocalDate = LocalDate.now(),
)
