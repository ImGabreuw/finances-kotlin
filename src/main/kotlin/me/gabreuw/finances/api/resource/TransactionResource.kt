package me.gabreuw.finances.api.resource

import me.gabreuw.finances.api.dto.TransactionDTO
import me.gabreuw.finances.usecase.TransactionService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/transactions"])
class TransactionResource(private val _service: TransactionService) {

    fun findAll(): List<TransactionDTO> = _service.findAll()

}