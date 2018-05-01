package io.zensoft.context.service.json

import io.zensoft.context.service.DrinkService

/**
 * @author esuyorkulov on 2/20/18.
 */
internal class DefaultJuiceService(private val juice: String) : DrinkService {

    override fun iDrink() {
        println("I drink some " + juice)
    }
}
