package me.gabreuw.finances

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FinancesApplication

fun main(args: Array<String>) {
    runApplication<FinancesApplication>(*args)
}
