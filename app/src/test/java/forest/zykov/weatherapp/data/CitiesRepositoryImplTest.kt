package forest.zykov.weatherapp.data

import forest.zykov.weatherapp.domain.City
import io.mockk.*
import junit.framework.Assert.assertEquals
import org.junit.Test

//Не считаю, что справился с этой темой. Её я немного не понял, как и MVVM((
class CitiesRepositoryImplTest {

    private val cityDataSource: CityDataSource = mockk()
    private val city: City = mockk()

    private val repository = CityRepositoryImpl(citiesDataSource)

    @Test
    fun `get citys EXPECT list of city`() {
        every { citiesDataSource.getCities() } returns listOf(citys)

        val people = repository.getCities()

        assertEquals(listOf(city), citys)
    }

    @Test
    fun `set city EXPECT set city by data source`() {
        every { CityDataSource.setCity(city) } just runs

        repository.setCity(city)

        verify { cityDataSource.setCity(city) }
    }
}