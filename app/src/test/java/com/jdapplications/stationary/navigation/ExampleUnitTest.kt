package com.jdapplications.stationary.navigation

import androidx.navigation.testing.TestNavigator
import androidx.navigation.testing.TestNavigatorDestinationBuilder
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun navigatorTest() {
        val testNavigator = TestNavigator()
        val testNavigatorDestinationBuilder = TestNavigatorDestinationBuilder(testNavigator, R.id.overviewFragment)
        val destination = testNavigatorDestinationBuilder.build()
        testNavigator.navigate(destination, null, null)
        assert(testNavigator.mBackStack.isNotEmpty())
        assertEquals(testNavigator.mBackStack.first.first?.id, R.id.overviewFragment)
    }
}
