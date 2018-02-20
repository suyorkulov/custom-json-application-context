package io.zensoft.context.model

import com.fasterxml.jackson.annotation.JsonProperty
/**
 * Created by esuyorkulov on 2/20/18.
 */
data class JsonBeanModel(@JsonProperty("className")
                         val className: String,
                         @JsonProperty("id")
                         val id: String,
                         @JsonProperty("scope")
                         val scope: String?,
                         @JsonProperty("isAbstract")
                         val isAbstract: Boolean?,
                         @JsonProperty("isLazy")
                         val isLazy: Boolean?,
                         @JsonProperty("parent")
                         val parent: String? = null,
                         @JsonProperty("properties")
                         val properties: Collection<JsonBeanModelProperty>)