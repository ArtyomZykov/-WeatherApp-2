package forest.zykov.weatherapp.data

import forest.zykov.weatherapp.domain.City

import forest.zykov.weatherapp.domain.`object`.Response
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query


interface CityApi {
    @GET("find")
    fun getCitiesList(
            @Query("lat") lat: Int = 55,
            @Query("lon") lon: Int = 83,
            @Query("cnt") cnt: Int = 10,
            @Query("appid") appid: String = "e76e36d78a97156d79686fb3c36a9571"
    ): Single<Response>

    @GET("weather")
    fun getCity(
        @Query("q") city_name: String,
        @Query("appid") appid: String = "e76e36d78a97156d79686fb3c36a9571"
    ): Single<City>
}