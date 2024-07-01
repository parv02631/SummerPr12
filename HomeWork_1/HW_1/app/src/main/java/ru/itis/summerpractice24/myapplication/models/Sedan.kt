package ru.itis.summerpractice24.myapplication.models

class Sedan(
    mark: String,
    model: String,
    issueDate: Int,
    horsepower: Int,
    val transmission: String
) : Car(mark, model, issueDate, horsepower) {
    override fun printInfo() {
        super.printInfo()
        println("transmission: $transmission")
    }
}