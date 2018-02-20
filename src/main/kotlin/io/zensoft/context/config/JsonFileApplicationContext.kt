package io.zensoft.context.config

import org.springframework.context.support.GenericApplicationContext

/**
 * Created by esuyorkulov on 2/20/18.
 */
class JsonFileApplicationContext(fileName: String) : GenericApplicationContext() {

    init {
        val reader = JsonBeanDefinitionReader(this)
        reader.loadBeanDefinitions(fileName)
        refresh()
    }
}