package com.manlan

import com.typesafe.config.ConfigFactory
import org.litote.kmongo.coroutine.CoroutineFindPublisher
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo

object DbRepo {

    val client by lazy {
        val config = ConfigFactory.load()
        val connectionString = config.getString("mongo.connectionString")
        KMongo.createClient(connectionString).coroutine
    }

    val db by lazy {
        client.getDatabase("dws2")
    }


    suspend fun getAttendanceForCurrentMonth(empId: String): List<Attendance> {
         val attendanceCollection = db.getCollection<Attendance>("attendance")
        return attendanceCollection.find().toList()
    }
}