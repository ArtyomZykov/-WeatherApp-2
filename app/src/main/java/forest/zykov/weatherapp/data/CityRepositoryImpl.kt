package forest.zykov.weatherapp.data

import forest.zykov.weatherapp.domain.City
import forest.zykov.weatherapp.domain.CityRepository
import forest.zykov.weatherapp.domain.`object`.Response
import io.reactivex.Single

class CityRepositoryImpl(private val cityDataSource: CityDataSource) : CityRepository {
    override fun getCity(name: String): Single<City> = cityDataSource.getCity(name)

    override fun getCities(): Single<Response> = cityDataSource.getCities()

}