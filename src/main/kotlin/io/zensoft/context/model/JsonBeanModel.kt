package io.zensoft.context.model

/**
 * @author esuyorkulov on 2/20/18.
 */
data class JsonBeanModel(

        val className: String? = null,

        val id: String? = null,

        val scope: String? = null,

        val isAbstract: Boolean? = null,

        val isLazy: Boolean? = null,

        val parent: String? = null,

        val properties: Collection<JsonBeanModelProperty>? = null,

        val constructorArgs: Collection<JsonBeanModelProperty>? = null
)