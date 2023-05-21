package com.d3if3048.assesment1.Main

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        private const val DATABASE_NAME = "kata.db"
        private const val DATABASE_VERSION = 1
        private const val TABLE_KATA = "kata"
        private const val COLUMN_ID = "id"
        private const val COLUMN_KATA = "kata"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val createTableQuery = "CREATE TABLE $TABLE_KATA ($COLUMN_ID INTEGER PRIMARY KEY AUTOINCREMENT, $COLUMN_KATA TEXT)"
        db.execSQL(createTableQuery)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_KATA")
        onCreate(db)
    }

    fun simpanKata(kata: String): Long {
        val db = writableDatabase
        val values = ContentValues()
        values.put(COLUMN_KATA, kata)

        return db.insert(TABLE_KATA, null, values)
    }

    fun getDaftarKata(): List<String> {
        val daftarKata = mutableListOf<String>()
        val db = readableDatabase
        val query = "SELECT * FROM $TABLE_KATA"
        val cursor: Cursor? = db.rawQuery(query, null)

        cursor?.use {
            while (it.moveToNext()) {
                val kata = it.getString(it.getColumnIndexOrThrow(COLUMN_KATA))
                daftarKata.add(kata)
            }
        }

        return daftarKata
    }
}
