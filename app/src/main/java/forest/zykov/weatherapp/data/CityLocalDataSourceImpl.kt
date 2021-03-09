package forest.zykov.weatherapp.data

import forest.zykov.weatherapp.domain.City
import forest.zykov.weatherapp.domain.`object`.Response
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

class CityLocalDataSourceImpl(private val api: CityApi): CityDataSource {

    override fun getCity(name: String): Single<City> = api.getCity(name)
            .subscribeOn(Schedulers.io())

<<<<<<< HEAD
    override fun getCities(): Single<Response> = api.getCitiesList()
            .subscribeOn(Schedulers.io())
=======
    )

    override fun getCity(): List<City> = city

    override fun getCity(id: Long): City? = city.firstOrNull { it.id == id }

    override fun setCity(town: City) {

        val editedPersonIndex = city.indexOfFirst { it.id == town.id }
        if (editedPersonIndex >= 0) {
            city[editedPersonIndex] = town
        }
    }
>>>>>>> cf7d4067aee8b2e1b85de5159609e20f7b8cdc58
}