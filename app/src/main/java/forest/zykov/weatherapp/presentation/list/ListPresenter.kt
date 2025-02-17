package forest.zykov.weatherapp.presentation.list


import androidx.lifecycle.MutableLiveData

import forest.zykov.weatherapp.domain.City

import forest.zykov.weatherapp.domain.GetCitiesUseCase

import forest.zykov.weatherapp.presentation.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ListPresenter(private val getCitiesUseCase: GetCitiesUseCase) : BasePresenter<ListView>() {

    val loading = MutableLiveData<Boolean>()

    fun onViewResumed() {
        loading.value = true
        getCitiesUseCase()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doAfterTerminate{
                    loading.value = false
                }
                .subscribe({
                    view?.bindCitiesList(it.list)
                }, {
                    it.printStackTrace()
                })
                .untilDestroy()
    }

    fun onCityClicked(city: City) {
        view?.openCityDetailsScreen(city.name)
    }

    fun search(name: String){
        view?.openCityDetailsScreen(name)
    }
}