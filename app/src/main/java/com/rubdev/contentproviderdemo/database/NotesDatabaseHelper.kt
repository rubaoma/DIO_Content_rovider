package com.rubdev.contentproviderdemo.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns._ID
import java.sql.SQLClientInfoException

class NotesDatabaseHelper(
    context: Context
) : SQLiteOpenHelper(context, "databaseNotes", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(
            "CREATE TABLE $TABLE_NOTES (" +
                    "$_ID INTEGER NOT NULL PRIMARY KEY," +
                    "$TITLE_NOTES TEXT NOT NULL," +
                    "$DESCRIPTION_NOTES TEXT NOT NULL)"
        )
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    companion object {
        const val TABLE_NOTES: String = "Notes"
        const val TITLE_NOTES: String = "Title"
        const val DESCRIPTION_NOTES: String = "description"
    }
}