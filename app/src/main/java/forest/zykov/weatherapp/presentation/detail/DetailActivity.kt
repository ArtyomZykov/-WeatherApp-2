package forest.zykov.weatherapp.presentation.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

import forest.zykov.weatherapp.R
import forest.zykov.weatherapp.domain.City


class DetailActivity : AppCompatActivity() {

    private val presenter by lazy {
        val name = intent.getStringExtra(EXTRA_NAME)
        DetailsPresenterFactory.getDetailsPresenter(name ?: "Unknown")
    }


    companion object {
        private const val EXTRA_NAME = "EXTRA_NAME"

        fun start(context: Context, name: String) {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra(EXTRA_NAME, name)
            context.startActivity(intent)
        }
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
    override fun bindCity(city: City) {
        nameText.text = getString(R.string.city_format, city.name)
        val tempFar = (city.main.temp - 273).toInt()
        temperatureText.text = getString(R.string.temperature_format, tempFar.toString())
        precipitateText.text = getString(R.string.precipitate_format, city.weather[0].description)
        countryText.text = getString(R.string.country_format, city.sys.country)

<<<<<<< HEAD
        val url = "http://openweathermap.org/img/wn/${city.weather[0].icon}@2x.png"
        Picasso.with(this).load(url).resize(40, 40).into(precipitateImage)

        backButton.setOnClickListener {
            presenter.getBack()
        }
    }

 */
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private lateinit var countryNameText: TextView
    private lateinit var timezoneText: TextView
    private lateinit var cityNameText: TextView
    private lateinit var brief_weatherInput: EditText
    private lateinit var full_weatherInput: EditText
    private lateinit var tempInput: EditText

    private lateinit var progressBar: ProgressBar
    private lateinit var linearLayout: LinearLayout

    private lateinit var saveButton: Button
    private lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)
        initViews()

    }



    fun bindCity(city: City) {

/*
        nameText.text = getString(R.string.city_format, city.name)
        val tempFar = (city.main.temp - 273).toInt()
        temperatureText.text = getString(R.string.temperature_format, tempFar.toString())
        precipitateText.text = getString(R.string.precipitate_format, city.weather[0].description)
        countryText.text = getString(R.string.country_format, city.sys.country)

        val url = "http://openweathermap.org/img/wn/${city.weather[0].icon}@2x.png"


        backButton.setOnClickListener {
            presenter.getBack()
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
=======

>>>>>>> cf7d4067aee8b2e1b85de5159609e20f7b8cdc58
        backButton.setOnClickListener {
            closeScreen()
        }

<<<<<<< HEAD
        countryNameText.text = getString(R.string.country_format, city.)
=======
        countryNameText.text = getString(R.string.country_format, city.country)
>>>>>>> cf7d4067aee8b2e1b85de5159609e20f7b8cdc58
        timezoneText.text = getString(R.string.timezone_format, city.timezone)
        cityNameText.text = getString(R.string.city_format, city.timezone)

        tempInput.setText(city.temperatyre.toString())
        brief_weatherInput.setText(city.brief_weather ?: getString(R.string.brief_weather_absent))
        full_weatherInput.setText(city.full_weather ?: getString(R.string.full_weather_absent))

        saveButton.setOnClickListener {
            val editedCity = city.copy(temperatyre = tempInput.text.toString().toInt(),
                    brief_weather = brief_weatherInput.text.toString(),
                    full_weather = full_weatherInput.text.toString())
            viewModel.saveCity(editedCity)
            closeScreen()
        }

 */
    }

    private fun initViews() {
        countryNameText = findViewById(R.id.countryNameText)
        timezoneText = findViewById(R.id.timezoneText)
        cityNameText = findViewById(R.id.cityNameText)

        tempInput = findViewById(R.id.tempInput)
        brief_weatherInput = findViewById(R.id.brief_weatherInput)
        full_weatherInput = findViewById(R.id.full_weatherInput)

        saveButton = findViewById(R.id.saveButton)
        backButton = findViewById(R.id.backButton)
    }

    private fun closeScreen() {
        finish()
    }

}