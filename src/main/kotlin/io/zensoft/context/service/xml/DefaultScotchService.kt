package io.zensoft.context.service.xml

import io.zensoft.context.service.DrinkService

/**
 * @author esuyorkulov on 2/20/18.
 */
internal class DefaultScotchService(private val scotch: String) : DrinkService {

    override fun iDrink() {
        println("I drink some " + scotch)
    }
}