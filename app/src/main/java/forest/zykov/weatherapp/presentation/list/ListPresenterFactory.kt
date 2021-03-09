package forest.zykov.weatherapp.presentation.list

import forest.zykov.weatherapp.data.CityLocalDataSourceImpl
import forest.zykov.weatherapp.data.CityRepositoryImpl
import forest.zykov.weatherapp.data.RetrofitHolder
import forest.zykov.weatherapp.domain.GetCitiesUseCase


object ListPresenterFactory {
    fun getListPresenter(): ListPresenter{
        val cityDataSource = CityLocalDataSourceImpl(RetrofitHolder.cityApi)
        val cityRepository = CityRepositoryImpl(cityDataSource)
        val getCitiesUseCase = GetCitiesUseCase(cityRepository)
        return ListPresenter(getCitiesUseCase)
    }
}