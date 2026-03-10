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

        fun runAgeCalculator() {
            val MONTHS_PER_YEAR = 12
            val DAYS_PER_YEAR = 365
            val CYCLE = 5
            val MAX_AGE = 100

            print("Enter the student's age: ")
            val age = readlnOrNull()?.toIntOrNull()

            if (age == null || age < 0 || age > 150) {
                println("Please enter a valid age (0–150).")
                return
            }

            val yearsUntil100 = MAX_AGE - age
            val ageInMonths = age * MONTHS_PER_YEAR
            val ageInDays = age * DAYS_PER_YEAR
            val yearsIntoCurrentCycle = age % CYCLE

            println("Years until 100: $yearsUntil100")
            println("Age in months: $ageInMonths")
            println("Age in days (approx.): $ageInDays")
            println("Years into current 5-year cycle: $yearsIntoCurrentCycle")
        }

        fun main() = runAgeCalculator()


        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}