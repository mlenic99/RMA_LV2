package hr.ferit.mlenic.inspiringpeople.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import hr.ferit.mlenic.inspiringpeople.R
import hr.ferit.mlenic.inspiringpeople.data.PeopleRepository
import hr.ferit.mlenic.inspiringpeople.listeners.OnImageClickListener
import hr.ferit.mlenic.inspiringpeople.model.InspiringPerson

class InspiringPeopleAdapter(
        people: List<InspiringPerson>,
        private val listener: OnImageClickListener

): RecyclerView.Adapter<InspiringPeopleViewHolder>(){

    private val people: MutableList<InspiringPerson> = mutableListOf()

    init{
      update(people)
    }

    private fun update(people: List<InspiringPerson>) {
        this.people.clear()
        this.people.addAll(people)
        this.notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InspiringPeopleViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_person, parent, false)
        return InspiringPeopleViewHolder(view)
    }

    override fun onBindViewHolder(holder: InspiringPeopleViewHolder, position: Int) {
        val person = people[position]
        holder.bind(person)
        holder.itemView.setOnClickListener { listener.onImageClick(person.image) }
    }

    override fun getItemCount(): Int {
        return people.size
    }
}