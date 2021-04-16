package hr.ferit.mlenic.inspiringpeople.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hr.ferit.mlenic.inspiringpeople.R
import hr.ferit.mlenic.inspiringpeople.data.PeopleRepository
import hr.ferit.mlenic.inspiringpeople.databinding.ActivityAddNewPersonBinding
import hr.ferit.mlenic.inspiringpeople.model.InspiringPerson

class AddNewPersonActivity : AppCompatActivity() {

    private lateinit var addNewPersonBinding: ActivityAddNewPersonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addNewPersonBinding = ActivityAddNewPersonBinding.inflate(layoutInflater)
        addNewPersonBinding.btnAdd.setOnClickListener { sendToMain() }
        setContentView(addNewPersonBinding.root)
    }

    private fun sendToMain() {
        val newName = addNewPersonBinding.tietEditName.text.toString()
        val newBirth = addNewPersonBinding.tietEditBornDied.text.toString()
        val newDescription = addNewPersonBinding.tietEditDescription.text.toString()
        val newImage = R.mipmap.ic_launcher
        val person = InspiringPerson(newName, newBirth, newDescription, newImage)
        val sendNewPerson = Intent(this, MainActivity::class.java)
        sendNewPerson.putExtra("sendToMain", person)
        startActivity(sendNewPerson)

    }
}