package com.example.transactionoutboxpractice.event

import com.example.transactionoutboxpractice.event.persistent.entity.EventRecord

class InventoryPaymentEvent(
    val event: String
) {
    fun toEventRecord(): EventRecord {
        return EventRecord(event)
    }
}