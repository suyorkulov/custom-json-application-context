package io.zensoft.context.service.json

import io.zensoft.context.service.DrinkService

/**
 * Created by esuyorkulov on 2/20/18.
 */
internal class DefaultJuiceService : DrinkService {

    lateinit var juice: String

    override fun iDrink() {
        println("I drink some " + juice)
    }

}
