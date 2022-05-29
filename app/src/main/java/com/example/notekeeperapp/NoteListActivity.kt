package com.example.notekeeperapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.util.Optional.empty
import android.content.Intent as Intent1

class NoteListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)


//this is the  floating action button setOnClick()
        //firts create a refrence of the view
        val fab=findViewById<FloatingActionButton>(R.id.fabutton)
        // call the set on click method
        fab.setOnClickListener { view->
            //create an instance of the class intent and import it
            //pass the context with "This" key word
            //pass information about the mainActivity class
            //end with the .java notation because it expects a java function
val activityIntent= Intent1(this, MainActivity::class.java)
 //call the startActivity class and pass the isntance of the intent class
        startActivity(activityIntent)
        }

        //create refrence to the view
val list= findViewById<ListView>(R.id.listNote)
        //populate our listview
        list.emptyView
            list.adapter= ArrayAdapter(this, android.R.layout.simple_spinner_item, DataManager.notes)
//Launches our mainactity using note position
        list.setOnItemClickListener{parent, view, id-> val activityIntent= Intent1(this, MainActivity::class.java)
    activityIntent.putExtra(EXTRA_NOTE_POSITION,position)
    startActivity(activityIntent)
}
        }
    }
