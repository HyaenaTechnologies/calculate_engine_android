package dev.hyaena_technologies.calculate_engine.logic.math

// Average of Objects
fun Average(values: Array<Double>): Double {
    var sum = 0.0
    for (value in values) {
        sum = sum + value
    }
    return sum / values.size
}