package forest.zykov.weatherapp.presentation

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import forest.zykov.weatherapp.domain.City
import forest.zykov.weatherapp.domain.GetCitiesUseCase
import forest.zykov.weatherapp.presentation.list.ListViewModel
import io.mockk.coEvery
import io.mockk.mockk
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule

class ListViewModelTest {

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    private val getCitiesUseCase: GetCitiesUseCase = mockk()
    private val city: City = mockk()
    private val cities = listOf(city)

    private val listViewModel = ListViewModel(getCitiesUseCase)

    @Test
    fun `load people EXPECT set list of person in people list`() = runBlocking {
        coEvery { getCitiesUseCase() } returns people

        listViewModel.loadCities()

        assertEquals(cities, listViewModel.citiesList.value)
    }
}