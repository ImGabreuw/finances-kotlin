package me.gabreuw.finances.usecase

import me.gabreuw.finances.api.dto.TransactionDTO
import me.gabreuw.finances.api.mapper.TransactionMapper
import me.gabreuw.finances.infrastructure.repository.TransactionRepository
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Service

@Service
class TransactionService(private val _repository: TransactionRepository) {

    fun findAll(): List<TransactionDTO> =
        Mappers.getMapper(TransactionMapper::class.java).toCollectionDTO(_repository.findAll())

}