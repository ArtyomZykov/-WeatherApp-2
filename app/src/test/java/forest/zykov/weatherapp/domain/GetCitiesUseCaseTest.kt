package forest.zykov.weatherapp.domain

import io.mockk.every
import io.mockk.mockk
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.Test

class GetCitiesUseCaseTest {

    private val cityRepository: CityRepository = mockk()
    private val city: City = mockk()

    private val getCitiesUseCase = GetCitiesUseCase(cityRepository)

    @Test
    fun `get cities EXPECT list of city`() = runBlocking {
        every { cityRepository.getCity() } returns listOf(city)

        val people = getCitiesUseCase()

        assertEquals(listOf(city), cities)
    }
}