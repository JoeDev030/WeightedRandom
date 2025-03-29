package test.kotlin.com.weightedrandom

import main.kotlin.weightedrandom.Library
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class LibraryTest {
    @Test
    fun someLibraryMethodReturnsTrue() {
        val classUnderTest = Library()
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'")
    }
}
