package forest.zykov.weatherapp.domain

import forest.zykov.weatherapp.domain.`object`.Main
import forest.zykov.weatherapp.domain.`object`.Sys
import forest.zykov.weatherapp.domain.`object`.Weather

data class City(
        val id: Long,
        val name: String,
        val main: Main,
        val sys: Sys,
        val weather: List<Weather>
)



