package io.zensoft.context

import io.zensoft.context.config.JsonFileApplicationContext
import io.zensoft.context.service.DrinkService
import org.springframework.context.support.ClassPathXmlApplicationContext

class Main

fun main(args: Array<String>) {
    val classPathXmlApplicationContext = ClassPathXmlApplicationContext("context.xml")
    val jsonApplicationContext = JsonFileApplicationContext("context.js")

    val xmlBeans: Map<String, DrinkService> = classPathXmlApplicationContext.getBeansOfType(DrinkService::class.java)
    val jsonBeans: Map<String, DrinkService> = jsonApplicationContext.getBeansOfType(DrinkService::class.java)

    println("Xml beans: ")
    xmlBeans.forEach { it.value.iDrink() }
    println("-----------")
    println("Json beans: ")
    jsonBeans.forEach { it.value.iDrink() }
}