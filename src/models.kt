package com.manlan



data class User(
    val role : String,
    val name : String,
    val email : String,
    val password : String,
)


data class Attendance(
    val date: String,
    var status : String,
)


data class Punch(
    val type : String,
    val time : String,
    val remarks : String
)

data class Request(
    val type : String,
    val status : String,
    val date : String,
    val fromTime : String,
    val toTime : String,
    val comment : String
)