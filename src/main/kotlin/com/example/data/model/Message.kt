package com.example.data.model

import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

@Serializable
data class Message(
    @BsonId
    val _id: String = ObjectId().toString(),
    val text: String,
    val user: String,
    val timeStamp: Long,
)
