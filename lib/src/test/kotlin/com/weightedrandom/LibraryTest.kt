package com.weightedrandom

import com.weightedrandom.core.WeightedPool
import kotlin.test.Test

class LibraryTest {
    @Test fun testFun() {
        val a: WeightedPool<String> = WeightedPool()

        a.add("boom", 0.1).add("bam", 1.0)

        for (i in 1..10) {
            val b = a.get()
            println("$b | ${a.getStringChanceOf(b)}")
        }
    }
}