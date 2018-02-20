package io.zensoft.context.model

import com.fasterxml.jackson.annotation.JsonProperty
/**
 * Created by esuyorkulov on 2/20/18.
 */
data class JsonBeanModelProperty(@JsonProperty("name")
                                 val name: String,
                                 @JsonProperty("value")
                                 val value: Any)
