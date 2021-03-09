package forest.zykov.weatherapp.presentation.list

import forest.zykov.weatherapp.domain.City
import forest.zykov.weatherapp.presentation.BaseView

interface ListView: BaseView {
    fun bindCitiesList(list: List<City>)

    fun openCityDetailsScreen(name: String)
}