package hr.ferit.mlenic.inspiringpeople.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import hr.ferit.mlenic.inspiringpeople.databinding.ItemPersonBinding
import hr.ferit.mlenic.inspiringpeople.listeners.OnImageClickListener
import hr.ferit.mlenic.inspiringpeople.model.InspiringPerson
import hr.ferit.mlenic.inspiringpeople.utilities.getImageResource

class InspiringPeopleViewHolder(itemView: View):
        RecyclerView.ViewHolder(itemView){

    fun bind(person: InspiringPerson) {
        val itemBinding = ItemPersonBinding.bind(itemView)
        itemBinding.tvPersonItemName.text = person.name
        itemBinding.tvPersonItemBornDied.text = person.born_died
        itemBinding.tvPersonItemDescription.text = person.description
        itemBinding.ivPersonItemImage.setBackgroundResource(getImageResource(person.image).toInt())

    }
}