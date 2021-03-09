package forest.zykov.weatherapp.domain

import io.reactivex.Single

class GetCityUseCase(private val cityRepository: CityRepository) {
    operator fun invoke(name: String): Single<City> = cityRepository.getCity(name)
}

