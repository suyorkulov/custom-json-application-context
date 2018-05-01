package io.zensoft.context.service.json

import io.zensoft.context.service.DrinkService

/**
 * @author esuyorkulov on 2/20/18.
 */
internal class DefaultCoffeeService(private val coffee: String) : DrinkService {

    override fun iDrink() {
        println("I drink some " + coffee)
    }
}