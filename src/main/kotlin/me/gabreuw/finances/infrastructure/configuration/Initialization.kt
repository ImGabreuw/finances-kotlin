package me.gabreuw.finances.infrastructure.configuration

import me.gabreuw.finances.domain.Transaction
import me.gabreuw.finances.domain.TransactionType
import me.gabreuw.finances.infrastructure.repository.TransactionRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Configuration

@Configuration
class Initialization(
    private val _repository: TransactionRepository
): CommandLineRunner {

    override fun run(vararg args: String?) {
        val transaction1 = Transaction(
            1L,
            "Luz",
            1000.0,
            TransactionType.EXPENSE
        )

        val transaction2 = Transaction(
            2L,
            "Água",
            1500.0,
            TransactionType.EXPENSE
        )

        val transaction3 = Transaction(
            3L,
            "Entrega do Website",
            4000.0,
            TransactionType.INCOME
        )

        _repository.saveAll(arrayListOf(transaction1, transaction2, transaction3))
    }

}