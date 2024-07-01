package ru.itis.summerpractice24.myapplication.race

import ru.itis.summerpractice24.myapplication.factories.CarGenerator
import ru.itis.summerpractice24.myapplication.models.Car

class Race {
    var currentYear = 2024

    fun race(amountCar: Int) {
        val generator = CarGenerator()
        val cars = mutableMapOf<Int, Car>()

        repeat(amountCar) { index ->
            cars[index] = generator.generateRandomCar()
        }

        simulateRace(cars)
    }

    fun simulateRace(cars: MutableMap<Int, Car>) {
        val lastSize = cars.size
        val range = 0 until lastSize
        var randomArray = range.toMutableList().shuffled()

        while (cars.size > 1) {
            var newCars = mutableMapOf<Int, Car>()

            for (index in randomArray.indices step 2) {
                if (index + 1 < randomArray.size) {
                    val firstNumber = randomArray[index]
                    val secondNumber = randomArray[index + 1]
                    val (winCar, winnerNumber) = comparison(cars[firstNumber]!!, cars[secondNumber]!!, firstNumber, secondNumber)

                    outResult(firstNumber, secondNumber, winnerNumber)
                    newCars[winnerNumber] = winCar
                } else {
                    newCars[randomArray[index]] = cars[randomArray[index]] ?: continue
                }
            }

            cars.clear()
            cars.putAll(newCars)

            randomArray = newCars.keys.toList().shuffled().toMutableList()
        }
    }

    fun comparison(car1: Car, car2: Car, firstNumber: Int, secondNumber: Int): Pair<Car, Int> {
        val score1 = car1.horsepower - (currentYear - car1.issueDate) * 10
        val score2 = car2.horsepower - (currentYear - car2.issueDate) * 10

        return if (score1 > score2) {
            car1 to firstNumber
        } else {
            car2 to secondNumber
        }
    }

    fun outResult(firstNumber: Int, secondNumber: Int, winnerNumber: Int) {
        println("Race between car $firstNumber and car $secondNumber. Winner is car $winnerNumber.")
    }
}