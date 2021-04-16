package hr.ferit.mlenic.inspiringpeople

import android.app.Application

class InspiringPeople: Application() {

    companion object{
        lateinit var application: InspiringPeople
    }

    override fun onCreate() {
        super.onCreate()
        application = this
    }

}