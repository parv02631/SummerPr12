package ru.itis.summerpractice24.myapplication.factories

import ru.itis.summerpractice24.myapplication.models.Crossover
import ru.itis.summerpractice24.myapplication.models.Minivan
import ru.itis.summerpractice24.myapplication.models.SUV
import ru.itis.summerpractice24.myapplication.models.Sedan

class CarBuilder {
    private var mark = ""
    private var model = ""
    private var issueDate: Int = 0
    private var horsepower: Int = 0
    private var typeOfDrive = ""
    private var engineDisplacement: Double = 0.0
    private var transmission = ""
    private var trunkVolume: Int = 0
    private var topSpeed: Int = 0
    private var numberOfDoors: Int = 0
    private var numberOfSeats: Int = 0

    fun setModel(model: String) = apply { this.model = model }
    fun setIssueDate(issueDate: Int) = apply { this.issueDate = issueDate }
    fun setMark(mark: String) = apply { this.mark = mark }
    fun setHorsepower(horsepower: Int) = apply { this.horsepower = horsepower }
    fun setNumberOfDoors(numberOfDoors: Int) = apply { this.numberOfDoors = numberOfDoors }
    fun setEngineDisplacement(engineDisplacement: Double) = apply { this.engineDisplacement = engineDisplacement }
    fun setTypeOfDrive(typeOfDrive: String) = apply { this.typeOfDrive = typeOfDrive }
    fun setTransmission(transmission: String) = apply { this.transmission = transmission }
    fun setTrunkVolume(trunkVolume: Int) = apply { this.trunkVolume = trunkVolume }
    fun setTopSpeed(topSpeed: Int) = apply { this.topSpeed = topSpeed }
    fun setNumberOfSeats(numberOfSeats: Int) = apply { this.numberOfSeats = numberOfSeats }

    fun buildCrossover(): Crossover {
        return Crossover(mark, model, issueDate, horsepower, typeOfDrive, engineDisplacement)
    }

    fun buildSedan(): Sedan {
        return Sedan(mark, model, issueDate, horsepower, transmission)
    }

    fun buildSUV(): SUV {
        return SUV(mark, model, issueDate, horsepower, trunkVolume, topSpeed)
    }

    fun buildMinivan(): Minivan {
        return Minivan(mark, model, issueDate, horsepower, numberOfDoors, numberOfSeats)
    }
}