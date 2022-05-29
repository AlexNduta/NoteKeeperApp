package com.example.notekeeperapp

data class courseInfo (val courseId:String,val title:String) {
        override fun toString(): String {
                return title
        }
}


      data class NoteInfo(var course:courseInfo, var title: String, var text:String)