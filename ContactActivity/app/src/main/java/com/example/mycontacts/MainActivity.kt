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

       val firstName = "Levi"
            val lastName = "Solomon"
                val address = "34 Cheeseburger street"
                    val isMale = true
                        val dayofbirth = 23
                            val monthOfBirth = 10
                                val yearOfBirth = 2006
        Log.d("Personalinfo" , "Your name is " + firstName + " " + lastName + " "
                + "Your address " + address + " " + "Are you male " + isMale + " " + "Your day of birth "
                + dayofbirth + " " + "your month of birth " + monthOfBirth + " " + "your year of birth "
                + yearOfBirth + " ")

        fun main() {

            print("Enter the student's age: ")
            val age = readlnOrNull()?.toIntOrNull() ?: 0

            val yearsUntil100 = 100 - age
            val ageInMonths = age * 12
            val ageInDays = age * 365
            val remainder = age % 5

            println("Years until 100: $yearsUntil100")
            println("Age in months: $ageInMonths")
            println("Age in days (no leap years): $ageInDays")
            println("Age mod 5: $remainder")
        }

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}