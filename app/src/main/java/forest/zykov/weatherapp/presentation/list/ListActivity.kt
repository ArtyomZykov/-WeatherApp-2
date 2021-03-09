package forest.zykov.weatherapp.presentation.list


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

import forest.zykov.weatherapp.R
import forest.zykov.weatherapp.domain.City
import forest.zykov.weatherapp.list.CityAdapter
import forest.zykov.weatherapp.presentation.detail.DetailActivity


class ListActivity : AppCompatActivity(), ListView {
    private val presenter by lazy {
        ListPresenterFactory.getListPresenter()
    }
    private lateinit var citiesList: RecyclerView
    private lateinit var searchEditText: EditText
    private lateinit var searchButton: Button


    private val adapter = CityAdapter {
        presenter.onCityClicked(it)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_activity)
<<<<<<< HEAD
=======
        viewModel.townsList.observe(this, ::bindPeopleList)
>>>>>>> cf7d4067aee8b2e1b85de5159609e20f7b8cdc58

        initViews()

        citiesList.adapter = adapter
        citiesList.layoutManager = LinearLayoutManager(this)
    }

    fun initViews(){
        citiesList = findViewById(R.id.peopleList)
        searchEditText = findViewById(R.id.search_edit_text)
        searchButton = findViewById(R.id.search_button)

        searchButton.setOnClickListener {
            presenter.search(searchEditText.text.toString())
        }
    }

    override fun onResume() {
        super.onResume()
<<<<<<< HEAD
        presenter.onViewResumed()
    }

    override fun bindCitiesList(list: List<City>) {
        adapter.cities = list
    }

    override fun openCityDetailsScreen(name: String) {
        DetailActivity.start(this, name)
=======
        viewModel.loadTowns()
>>>>>>> cf7d4067aee8b2e1b85de5159609e20f7b8cdc58
    }
}