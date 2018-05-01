package io.zensoft.context.service.xml

import io.zensoft.context.service.DrinkService

/**
 * @author esuyorkulov on 2/20/18.
 */
internal class DefaultVodkaService(private val vodka: String) : DrinkService {

    override fun iDrink() {
        println("I drink some " + vodka)
    }
}