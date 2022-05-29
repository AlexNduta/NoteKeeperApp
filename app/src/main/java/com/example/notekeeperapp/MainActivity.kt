package com.example.notekeeperapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.ArrayAdapter as ArrayAdapter1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   // instansiate our DataManager class
        //creating the adapter
        //ArrayAdapter is an instance of a class
        //In this line, we are accessing the spiner from the xml file
        val adapterCourses= ArrayAdapter1<courseInfo>(this,android.R.layout.simple_spinner_item, DataManager.courses.values.toList())
//we have just passed 3 parameters, the context, layout resourse and data we want to display
        /* Context is used to indicate creation state of android classes, it is demoted with the "this"*/
        //The data we want is found in the "DataManage" "courses" property
        //we use the ".vales" to access the whole list of data. we must convert it into a list and that's why we call the toList()
        adapterCourses.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        //this is the second layout resourse with the ID "simple_spinner_dropdown_item"
        //We then associate our adapter with a spinner
        val spin= findViewById<Spinner>(R.id.courseSpinner)
spin.adapter=adapterCourses

       notePosition=intent.getIntExtra(EXTRA_NOTE_POSITION, notePosition)
        if (notePosition != notePosition)
            displayNote()
    }

    private fun displayNote() {
       val note= DataManager,notes[notePosition]
        textNoteTitle.setText(note.title)
        textxNote.setText(note.text)

        val coursePosition = DataManager.courses.values
        spinnerCourse.setSelection(coursePosition)
    }
}