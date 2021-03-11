package forest.zykov.weatherapp.data

import forest.zykov.weatherapp.domain.City
import forest.zykov.weatherapp.domain.`object`.Response
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

class CityLocalDataSourceImpl(private val api: CityApi): CityDataSource {

    override fun getCity(name: String): Single<City> = api.getCity(name)
        .subscribeOn(Schedulers.io())

    override fun getCities(): Single<Response> = api.getCitiesList()
        .subscribeOn(Schedulers.io())
}