package ru.itis.summerpractice24.myapplication.models

open class Car(
    val mark: String,
    val model: String,
    val issueDate: Int,
    val horsepower: Int
) {
    open fun printInfo() {
        println("mark: $mark; model: $model; issueDate: $issueDate; horsepower: $horsepower")
    }
}