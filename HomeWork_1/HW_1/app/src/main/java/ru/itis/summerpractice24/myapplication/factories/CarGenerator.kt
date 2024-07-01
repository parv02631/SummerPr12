package ru.itis.summerpractice24.myapplication.factories

import ru.itis.summerpractice24.myapplication.models.Car


class CarGenerator {
    private var currentBodyType = ""

    private val models = mapOf(
        "Toyota" to arrayOf(Pair("Corolla", listOf("Sedan", "SUV", "Minivan", "Crossover")), Pair("Camry", listOf("SUV", "Minivan", "Crossover"))),
        "Honda" to arrayOf(Pair("Accord", listOf("Sedan", "SUV", "Minivan")), Pair("Civic", listOf("Sedan", "SUV", "Minivan",))),
        "Ford" to arrayOf(Pair("Focus", listOf("Sedan", "Minivan", "Crossover")), Pair("Mustang", listOf("Minivan", "Crossover"))),
        "Chevrolet" to arrayOf(Pair("Cruze", listOf("Sedan", "Minivan", "Crossover")), Pair("Silverado", listOf("SUV", "Minivan"))),
        "BMW" to arrayOf(Pair("3 Series", listOf("Sedan", "SUV", "Minivan")), Pair("X5", listOf("SUV", "Minivan"))),
        "Audi" to arrayOf(Pair("A4", listOf("Sedan")), Pair("Q5", listOf("SUV"))),
        "Mercedes-Benz" to arrayOf(Pair("C-Class", listOf("Sedan")), Pair("GLE", listOf("SUV")))
    )

    private val issueDates = (1990..2024).toList().toIntArray()
    private val horsepowers = (100..500).toList().toIntArray()
    private val typesOfDrive = arrayOf("AWD", "FWD", "RWD")
    private val engineDisplacements = doubleArrayOf(1.5, 2.0, 2.5, 3.0, 4.0)
    private val transmissions = arrayOf("Automatic", "Manual", "CVT")
    private val trunkVolumes = (300..700).toList().toIntArray()
    private val topSpeeds = (150..300).toList().toIntArray()
    private val numberOfDoors = (2..5).toList().toIntArray()
    private val numberOfSeats = (2..8).toList().toIntArray()


    fun generateMarkAndModel(): CarBuilder {
        val randomEntry = models.entries.random()
        val randomKey = randomEntry.key
        val randomValue = randomEntry.value

        val randomModel = randomValue.random()
        val modelName = randomModel.first
        val bodyTypes = randomModel.second

        currentBodyType = bodyTypes.random()
        return CarBuilder().setModel(modelName).setMark(randomKey)
    }

    fun generateRandomCar(): Car {
        val carBuilder = generateMarkAndModel()
        carBuilder.setIssueDate(issueDates.random()).setHorsepower(horsepowers.random())

        return when(currentBodyType){
            "Sedan" -> carBuilder.setTransmission(transmissions.random()).buildSedan()
            "Crossover" -> carBuilder.setTypeOfDrive(typesOfDrive.random()).setEngineDisplacement(engineDisplacements.random()).buildCrossover()
            "Minivan" -> carBuilder.setNumberOfDoors(numberOfDoors.random()).setNumberOfSeats(numberOfSeats.random()).buildMinivan()
            "SUV" -> carBuilder.setTrunkVolume(trunkVolumes.random()).setTopSpeed(topSpeeds.random()).buildSUV()
            else -> throw IllegalArgumentException("Unknown body type")
        }
    }
}
