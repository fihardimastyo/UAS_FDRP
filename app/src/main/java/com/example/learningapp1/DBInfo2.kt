package com.example.learningapp1

import android.provider.BaseColumns

object DBInfo2 {
    class UserInput: BaseColumns {
        companion object {
            val TABLE_NAME = "users"
            val COL_EMAIL = "email"
            val COL_PASS = "pass"
            val COL_USERNAME = "username"
            val COL_FULLNAME = "fullname"
        }
    }
}