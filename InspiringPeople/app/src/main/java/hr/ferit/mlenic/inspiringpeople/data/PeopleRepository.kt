package hr.ferit.mlenic.inspiringpeople.data

import hr.ferit.mlenic.inspiringpeople.model.InspiringPerson
import hr.ferit.mlenic.inspiringpeople.R

object PeopleRepository {

    private val people = mutableListOf<InspiringPerson>(
            InspiringPerson("Luka Modrić", "1985.", "A Croatian professional " +
                    "footballer who plays as a midfielder for Spanish club Real Madrid and captains the " +
                    "Croatia national team.", 1),
            InspiringPerson("Sergio Ramos", "1986.", "A Spanish professional " +
                    "footballer who plays as a centre-back and captains both La Liga club Real Madrid " +
                    "and the Spanish national team.", 2),
            InspiringPerson("William Shakespeare", "(1564.-1616.)", "An English " +
                    "playwright, poet, and actor, widely regarded as the greatest writer in the English " +
                    "language and the world's greatest dramatist.", 3),
            InspiringPerson("Luka Modrić", "1985.", "A Croatian professional " +
                    "footballer who plays as a midfielder for Spanish club Real Madrid and captains the " +
                    "Croatia national team.", 4),
            InspiringPerson("Sergio Ramos", "1986.", "A Spanish professional " +
                    "footballer who plays as a centre-back and captains both La Liga club Real Madrid " +
                    "and the Spanish national team.", 5),
            InspiringPerson("William Shakespeare", "(1564.-1616.)", "An English " +
                    "playwright, poet, and actor, widely regarded as the greatest writer in the English " +
                    "language and the world's greatest dramatist.", 6)
    )

    fun getPeople(): List<InspiringPerson> = people
    fun getName(name: String): InspiringPerson? = people.find { InspiringPerson -> InspiringPerson.name == name}
    fun insert(person: InspiringPerson) = people.add(person)

}