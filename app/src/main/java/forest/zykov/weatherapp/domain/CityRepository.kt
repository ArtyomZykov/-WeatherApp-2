package forest.zykov.weatherapp.domain

import forest.zykov.weatherapp.domain.`object`.Response
import io.reactivex.Single

interface CityRepository {

    fun getCity(name: String): Single<City>

    fun getCities(): Single<Response>

    fun setCity(city: City)

}