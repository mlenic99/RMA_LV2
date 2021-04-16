package hr.ferit.mlenic.inspiringpeople.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import hr.ferit.mlenic.inspiringpeople.R
import hr.ferit.mlenic.inspiringpeople.adapters.InspiringPeopleAdapter
import hr.ferit.mlenic.inspiringpeople.data.PeopleRepository
import hr.ferit.mlenic.inspiringpeople.databinding.ActivityMainBinding
import hr.ferit.mlenic.inspiringpeople.databinding.ItemPersonBinding
import hr.ferit.mlenic.inspiringpeople.listeners.OnImageClickListener
import hr.ferit.mlenic.inspiringpeople.model.InspiringPerson

abstract class MainActivity() : AppCompatActivity(), OnImageClickListener {

    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var itemPersonBinding: ItemPersonBinding
    private lateinit var onImageClickListener: OnImageClickListener
    private val peopleRepository = PeopleRepository

    private val listModric = listOf<String>(
            R.string.modric_quote_1.toString(),
            R.string.modric_quote_2.toString(),
            R.string.modric_quote_3.toString())
    private val listRamos = listOf<String>(R.string.ramos_quote_1.toString(),
            R.string.ramos_quote_2.toString(),
            R.string.ramos_quote_3.toString())
    private val listShakespeare = listOf<String>(R.string.shakespeare_quote_1.toString(),
            R.string.shakespeare_quote_2.toString(),
            R.string.shakespeare_quote_3.toString())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        mainBinding.fabAddPerson.setOnClickListener { addNewPerson() }
        itemPersonBinding = ItemPersonBinding.inflate(layoutInflater)
        var listener = onImageClickListener
        setUpRecyclerView()
    }



    private fun setUpRecyclerView() {
        mainBinding.rvInspiredPeople.layoutManager = LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        )
        mainBinding.rvInspiredPeople.adapter = InspiringPeopleAdapter(peopleRepository.getPeople(), onImageClickListener)
    }

    private fun addNewPerson(){
        val newPersonIntent = Intent(this, AddNewPersonActivity::class.java)
        startActivity(newPersonIntent)
    }

    override fun onImageClick(position: Int) {
        Toast.makeText(this, "This is quote", Toast.LENGTH_SHORT).show()

    }
}

