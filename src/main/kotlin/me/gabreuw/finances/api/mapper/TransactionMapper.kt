package me.gabreuw.finances.api.mapper

import me.gabreuw.finances.api.dto.TransactionDTO
import me.gabreuw.finances.domain.Transaction
import org.mapstruct.Mapper

@Mapper
interface TransactionMapper {

    fun toDTO(transactionDomain: Transaction): TransactionDTO

    fun toDomain(transactionDTO: TransactionDTO): Transaction

    fun toCollectionDTO(listTransactionDomain: List<Transaction>): List<TransactionDTO>

    fun toCollectionDomain(listTransactionDTO: List<TransactionDTO>): List<Transaction>

//    companion object {
//        val instance = Mappers.getMapper(TransactionMapper::class.java)
//    }
}