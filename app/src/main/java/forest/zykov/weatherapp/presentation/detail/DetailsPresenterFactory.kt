package forest.zykov.weatherapp.presentation.detail

import forest.zykov.weatherapp.data.CityLocalDataSourceImpl
import forest.zykov.weatherapp.data.CityRepositoryImpl
import forest.zykov.weatherapp.data.RetrofitHolder
import forest.zykov.weatherapp.domain.GetCityUseCase

object DetailsPresenterFactory {
    fun getDetailsPresenter(name: String): DetailPresenter{
        val cityDataSource = CityLocalDataSourceImpl(RetrofitHolder.cityApi)
        val cityRepository = CityRepositoryImpl(cityDataSource)
        val getCityUseCase = GetCityUseCase(cityRepository)
        return DetailPresenter(
                getCityUseCase = getCityUseCase,
                name = name
        )
    }
}