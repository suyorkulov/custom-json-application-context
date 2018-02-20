package io.zensoft.context.service.xml

import io.zensoft.context.service.DrinkService

/**
 * Created by esuyorkulov on 2/20/18.
 */
internal class DefaultScotchService : DrinkService {

    lateinit var scotch: String

    override fun iDrink() {
        println("I drink some " + scotch)
    }

}