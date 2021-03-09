package forest.zykov.weatherapp.data

import forest.zykov.weatherapp.domain.City
import forest.zykov.weatherapp.domain.`object`.Response
import io.reactivex.Single

interface CityDataSource {

    fun getCity(name: String) : Single<City>

    fun getCities(): Single<Response>
}