package forest.zykov.weatherapp.domain

import forest.zykov.weatherapp.domain.`object`.Response
import io.reactivex.Single

class GetCitiesUseCase(private val cityRepository: CityRepository) {
    operator fun invoke(): Single<Response> = cityRepository.getCities()
}

