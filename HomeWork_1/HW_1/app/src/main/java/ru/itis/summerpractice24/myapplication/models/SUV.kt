package ru.itis.summerpractice24.myapplication.models

class SUV(
    mark: String,
    model: String,
    issueDate: Int,
    horsepower: Int,
    val trunkVolume: Int,
    val topSpeed: Int
) : Car(mark, model, issueDate, horsepower) {
    override fun printInfo() {
        super.printInfo()
        println("trunkVolume: $trunkVolume; topSpeed: $topSpeed")
    }
}