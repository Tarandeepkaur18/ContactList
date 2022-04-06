package com.example.contactactivity


import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class FirestoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firestore)
        val db = Firebase.firestore
        val user = hashMapOf(
            "first" to "Taran",
            "last" to "lastname",
            "class" to "Btech",
            "Rollno" to "1803600"

        )

        db.collection("documents").document("details of student")
            .set(user)
            .addOnSuccessListener { Log.d(TAG, "DocumentSnapshot successfully written!") }
            .addOnFailureListener { e -> Log.w(TAG, "Error writing document", e) }

        db.collection("documents").document("details of student")
            .update(mapOf(
                "first" to "tarandeep",
                "last" to "kaur"
            ))
       // db.collection("documents").document("details of student").delete().addOnSuccessListener{
           // Log.d(TAG, "DocumentSnapshot successfully deleted!") }
            //.addOnFailureListener { e -> Log.w(TAG, "Error deleting document", e) }
        // Deleting collections from an Android client is not recommended.




    }
}