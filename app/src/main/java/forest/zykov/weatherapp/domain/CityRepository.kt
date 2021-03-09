package forest.zykov.weatherapp.domain

import forest.zykov.weatherapp.domain.`object`.Response
import io.reactivex.Single

interface CityRepository {

    fun getCity(name: String): Single<City>

<<<<<<< HEAD
    fun getCities(): Single<Response>
=======
    fun setCity(city: City)
>>>>>>> cf7d4067aee8b2e1b85de5159609e20f7b8cdc58
}