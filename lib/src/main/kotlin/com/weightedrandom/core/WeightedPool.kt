package com.weightedrandom.core

import java.text.DecimalFormat
import java.util.*

class WeightedPool<E>(private val random: Random = Random()) {
    private val a: NavigableMap<Double, E> = TreeMap()
    private val b = HashMap<E, Double>()
    private var totalWeight = 0.0

    fun add(entry: E, weight: Double): WeightedPool<E> {
        if (weight <= 0) return this
        totalWeight += weight
        a.put(totalWeight, entry)
        b.put(entry, weight)
        return this
    }

    fun get(): E {
        val tA = random.nextDouble() * totalWeight
        return a.higherEntry(tA).value
    }

    fun getChanceOf(entry: E): Double {
        return b[entry]!! / totalWeight * 100
    }

    fun getStringChanceOf(entry: E): String {
        return percentFormat.format(getChanceOf(entry)) + "%"
    }

    companion object {
        private val percentFormat = DecimalFormat("#.###")
    }
}
