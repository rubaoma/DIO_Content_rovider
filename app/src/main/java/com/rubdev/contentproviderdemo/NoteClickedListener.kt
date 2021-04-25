package com.rubdev.contentproviderdemo

import android.database.Cursor

interface NoteClickedListener {
    fun noteClickedItem(cursor: Cursor?)
    fun notRemoveItem(cursor: Cursor?)

}