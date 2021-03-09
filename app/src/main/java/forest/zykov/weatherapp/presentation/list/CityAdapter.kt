package forest.zykov.weatherapp.list

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import forest.zykov.weatherapp.R
import forest.zykov.weatherapp.domain.City

class CityAdapter (private val onItemClick: (City) -> Unit) : RecyclerView.Adapter<CityAdapter.CityHolder>() {

    var cities: List<City> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_city, parent, false)
        return CityHolder(view, onItemClick)
    }

    override fun onBindViewHolder(holder: CityHolder, position: Int) {
        val city = cities[position]
        holder.bind(city)
    }

<<<<<<< HEAD
    override fun getItemCount(): Int = cities.count()

    class CityHolder(itemView: View, private val onItemClick: (City) -> Unit) : RecyclerView.ViewHolder(itemView) {

        private val nameText = itemView.findViewById<TextView>(R.id.cityText)
        private val temperatureText = itemView.findViewById<TextView>(R.id.tempText)
        private val briefWeatherImage: ImageView = itemView.findViewById(R.id.weatherImage)

        fun bind(city: City) {
            val brief_weather = city.weather[0].main
            nameText.text = city.name
            val tempFar = (city.main.temp - 273).toInt()
            temperatureText.text = itemView.context.getString(R.string.temp, tempFar.toString())

            when {
                brief_weather.equals("Sun") -> briefWeatherImage.setImageResource(R.drawable.day_clear)
                //brief_weather.equals("day_with_clarification") -> briefWeatherImage.setImageResource(R.drawable.day_with_clarification)
                brief_weather.equals("Rain") -> briefWeatherImage.setImageResource(R.drawable.day_rain)
                brief_weather.equals("Snow") -> briefWeatherImage.setImageResource(R.drawable.day_snow)
                //brief_weather.equals("day_no_inform") -> briefWeatherImage.setImageResource(R.drawable.day_no_inform)

                brief_weather.equals("night_clear") -> briefWeatherImage.setImageResource(R.drawable.night_clear)
                brief_weather.equals("night_with_clarification") -> briefWeatherImage.setImageResource(R.drawable.night_with_clarification)
                brief_weather.equals("night_rain") -> briefWeatherImage.setImageResource(R.drawable.night_rain)
                brief_weather.equals("night_thunderstorm") -> briefWeatherImage.setImageResource(R.drawable.night_thunderstorm)
                //brief_weather.equals("night_no_inform") -> briefWeatherImage.setImageResource(R.drawable.night_no_inform)
                else -> briefWeatherImage.setImageResource(R.drawable.night_no_inform)
            }

            when {
                tempFar == 0 -> temperatureText.setTextColor(Color.parseColor("#636363"))
                tempFar < 0 -> temperatureText.setTextColor(Color.parseColor("#0066ff"))
                tempFar > 0 -> temperatureText.setTextColor(Color.parseColor("#960023"))
            }
            itemView.setOnClickListener { onItemClick(city) }
=======
    override fun getItemCount(): Int = city.count()
}


class TownHolder(itemView: View, private val onClick: (City) -> Unit) : RecyclerView.ViewHolder(itemView) {

    private val cityText: TextView = itemView.findViewById(R.id.cityText)
    private val briefWeatherImage: ImageView = itemView.findViewById(R.id.weatherImage)
    private val tempText: TextView = itemView.findViewById(R.id.tempText)

    fun bind(town: City) {
        val temp = town.temperatyre
        val brief_weather = town.brief_weather

        cityText.text = itemView.context.getString(R.string.city_format, town.city)
        tempText.text = itemView.context.getString(R.string.temp, temp.toString())

        when {
            brief_weather.equals("day_clear") -> briefWeatherImage.setImageResource(R.drawable.day_clear)
            brief_weather.equals("day_with_clarification") -> briefWeatherImage.setImageResource(R.drawable.day_with_clarification)
            brief_weather.equals("day_rain") -> briefWeatherImage.setImageResource(R.drawable.day_rain)
            brief_weather.equals("day_snow") -> briefWeatherImage.setImageResource(R.drawable.day_snow)
            //brief_weather.equals("day_no_inform") -> briefWeatherImage.setImageResource(R.drawable.day_no_inform)

            brief_weather.equals("night_clear") -> briefWeatherImage.setImageResource(R.drawable.night_clear)
            brief_weather.equals("night_with_clarification") -> briefWeatherImage.setImageResource(R.drawable.night_with_clarification)
            brief_weather.equals("night_rain") -> briefWeatherImage.setImageResource(R.drawable.night_rain)
            brief_weather.equals("night_thunderstorm") -> briefWeatherImage.setImageResource(R.drawable.night_thunderstorm)
            //brief_weather.equals("night_no_inform") -> briefWeatherImage.setImageResource(R.drawable.night_no_inform)
            else -> briefWeatherImage.setImageResource(R.drawable.night_no_inform)
>>>>>>> cf7d4067aee8b2e1b85de5159609e20f7b8cdc58
        }
    }
}