package com.udacity.notepad.data

/**
 * Created by andrew on 10.06.2019.
 */
fun demoDataClasses(){
    val note = Note(text = "this a note")
    note ==note.copy()
    val aCopy = note.copy(text="Something else",isPinned = true)
}