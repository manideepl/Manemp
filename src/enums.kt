package com.manlan


enum class PUNCH_TYPE(val type: String) {
    IN ("IN"),
    OUT ("OUT");

    override fun toString(): String {
        return type
    }
}

enum class USER_ROLE(val type : String) {
    EMPLOYEE("EMP"),
    MANAGER("MNG");

    override fun toString(): String {
        return  type
    }
}


enum class REQUEST_TYPE(val type : String) {
    OOO("OOO"),
    LEAVE("Leave");


    override fun toString(): String {
        return type
    }
}

enum class ATTENDANCE_STATUS(val type : String) {
    PRESENT("Present"),
    ABSENT("Absent");

    override fun toString(): String {
        return type
    }
}


enum class REQUEST_STATUS(val type : String) {
    APPROVED("Approved"),
    REJECTED("Rejected"),
    PENDING("Pending");

    override fun toString(): String {
        return type
    }
}