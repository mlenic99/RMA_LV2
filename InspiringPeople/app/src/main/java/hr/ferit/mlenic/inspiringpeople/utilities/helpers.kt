package hr.ferit.mlenic.inspiringpeople.utilities

import hr.ferit.mlenic.inspiringpeople.R

fun getImageResource(image: Int): String{
    return when(image){
    1 -> R.drawable.luka_modric.toString()
        2->R.drawable.luka_modric.toString()
        3->R.drawable.luka_modric.toString()
        4->R.drawable.luka_modric.toString()
        5->R.drawable.luka_modric.toString()
        else-> R.drawable.shakespeare.toString()
    }
}