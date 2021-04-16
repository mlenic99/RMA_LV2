package hr.ferit.mlenic.inspiringpeople.model

import android.media.Image
import java.io.Serializable

data class InspiringPerson (
    val name: String,
    val born_died: String,
    val description: String,
    val image: Int
): Serializable