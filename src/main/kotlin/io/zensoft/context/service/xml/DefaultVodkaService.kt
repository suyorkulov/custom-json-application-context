package io.zensoft.context.service.xml

import io.zensoft.context.service.DrinkService

/**
 * Created by esuyorkulov on 2/20/18.
 */
internal class DefaultVodkaService : DrinkService {

    lateinit var vodka: String

    override fun iDrink() {
        println("I drink some " + vodka)
    }

}