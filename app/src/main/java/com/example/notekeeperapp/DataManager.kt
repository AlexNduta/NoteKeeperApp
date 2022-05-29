package com.example.notekeeperapp

object DataManager {
    //HashMap is data structure that allow storage of key value pair(key,value)
    //we will be searching our course info using course Id wich is a string
    val courses= HashMap<String,courseInfo>()
    val notes= ArrayList<NoteInfo>()
    //ArrayList is a simple collection that can grow dynamicly and offer an index based acess to its members
    init {
        intitializeCourses()

    }



    fun intitializeCourses(){
        //we create an instance of the class courseInfo and pass the two values of the parameter
        var course= courseInfo("android_intents", "Android programing with Intents")
        //add courses to our courses collection
        //in a hashmap we use the set()
        courses.set(course.courseId, course)


        //we add this course to our collection
        course= courseInfo("android_async", "Android Async programming and Services")
        courses.set(course.courseId, course)

        course=courseInfo("java_core", "java Fundamentals:The Core Platform")
        courses.set(course.courseId, course)




    }
}