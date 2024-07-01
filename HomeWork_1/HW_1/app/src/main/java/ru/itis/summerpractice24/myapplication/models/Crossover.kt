package ru.itis.summerpractice24.myapplication.models

class Crossover(
    mark: String,
    model: String,
    issueDate: Int,
    horsepower: Int,
    val typeOfDrive: String,
    val engineDisplacement: Double
) : Car(mark, model, issueDate, horsepower) {
    override fun printInfo() {
        super.printInfo()
        println("typeOfDrive: $typeOfDrive; engineDisplacement: $engineDisplacement")
    }
}