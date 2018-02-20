package io.zensoft.context.config

import com.fasterxml.jackson.databind.ObjectMapper
import io.zensoft.context.model.JsonBeanModel
import org.springframework.beans.MutablePropertyValues
import org.springframework.beans.factory.support.*
import org.springframework.core.io.Resource
import java.io.FileReader

/**
 * Created by esuyorkulov on 2/20/18.
 */
class JsonBeanDefinitionReader(beanDefinitionRegistry: BeanDefinitionRegistry)
    : AbstractBeanDefinitionReader(beanDefinitionRegistry) {

    private val objectMapper = ObjectMapper()

    override fun loadBeanDefinitions(resource: Resource?): Int {
        return getJsonBeanDefinitions(resource)
    }

    private fun getJsonBeanDefinitions(resource: Resource?): Int {
        val jsonBeans: Collection<JsonBeanModel> = objectMapper.readValue(
                FileReader(resource!!.file),
                objectMapper.typeFactory.constructCollectionType(List::class.java, JsonBeanModel::class.java))

        jsonBeans.forEach { registerJsonBeanDefinitions(it) }
        return jsonBeans.size
    }

    private fun registerJsonBeanDefinitions(jsonBean: JsonBeanModel) {
        val mutablePropertyValues = MutablePropertyValues()
        val className: String = jsonBean.className
        val beanName: String = jsonBean.id
        val scope: String = jsonBean.scope ?: GenericBeanDefinition.SCOPE_SINGLETON
        val isAbstract: Boolean = jsonBean.isAbstract ?: false
        val isLazy: Boolean = jsonBean.isLazy ?: false
        val parent: String? = jsonBean.parent

        jsonBean.properties.forEach { mutablePropertyValues.add(it.name, it.value) }

        val beanDefinition: AbstractBeanDefinition = BeanDefinitionReaderUtils.createBeanDefinition(parent, className, beanClassLoader)
        beanDefinition.scope = scope
        beanDefinition.isAbstract = isAbstract
        beanDefinition.isLazyInit = isLazy
        beanDefinition.propertyValues = mutablePropertyValues
        registry.registerBeanDefinition(beanName, beanDefinition)
    }
}

