package com.example.mycontacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

       var FirstName = "Levi"
            var LastName = "Solomon"
                var Address = "34 Cheeseburger street"
                    var isMale = true
                        val dayofbirth = 23
                            val monthOfBirth = 10
                                val yearOfBirth = 2006
        Log.d("Personalinfo" , "Your name is " + FirstName + " " + LastName + " "
                + "Your address" + Address + " " + "Are you male" + isMale + "" + "Your day of birth"
                + dayofbirth + "" + "your month of birth" + monthOfBirth + "" + "your year of birth"
                + yearOfBirth + "" )



        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}