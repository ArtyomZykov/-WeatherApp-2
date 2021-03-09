package forest.zykov.weatherapp.presentation.detail


import forest.zykov.weatherapp.domain.City
import forest.zykov.weatherapp.presentation.BaseView

interface DetailsView : BaseView {

    fun bindCity(city: City)

    fun closeScreen()
}