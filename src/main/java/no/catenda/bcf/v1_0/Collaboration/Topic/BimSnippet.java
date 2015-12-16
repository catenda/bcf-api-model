
package no.catenda.bcf.v1_0.Collaboration.Topic;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * bim_snippet
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "snippet_type",
    "is_external",
    "reference",
    "reference_schema"
})
public class BimSnippet {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("snippet_type")
    @NotNull
    private String snippetType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_external")
    @NotNull
    private Boolean isExternal;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reference")
    @NotNull
    private String reference;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("reference_schema")
    @NotNull
    private String referenceSchema;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The snippetType
     */
    @JsonProperty("snippet_type")
    public String getSnippetType() {
        return snippetType;
    }

    /**
     * 
     * (Required)
     * 
     * @param snippetType
     *     The snippet_type
     */
    @JsonProperty("snippet_type")
    public void setSnippetType(String snippetType) {
        this.snippetType = snippetType;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The isExternal
     */
    @JsonProperty("is_external")
    public Boolean getIsExternal() {
        return isExternal;
    }

    /**
     * 
     * (Required)
     * 
     * @param isExternal
     *     The is_external
     */
    @JsonProperty("is_external")
    public void setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The reference
     */
    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    /**
     * 
     * (Required)
     * 
     * @param reference
     *     The reference
     */
    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The referenceSchema
     */
    @JsonProperty("reference_schema")
    public String getReferenceSchema() {
        return referenceSchema;
    }

    /**
     * 
     * (Required)
     * 
     * @param referenceSchema
     *     The reference_schema
     */
    @JsonProperty("reference_schema")
    public void setReferenceSchema(String referenceSchema) {
        this.referenceSchema = referenceSchema;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(snippetType).append(isExternal).append(reference).append(referenceSchema).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BimSnippet) == false) {
            return false;
        }
        BimSnippet rhs = ((BimSnippet) other);
        return new EqualsBuilder().append(snippetType, rhs.snippetType).append(isExternal, rhs.isExternal).append(reference, rhs.reference).append(referenceSchema, rhs.referenceSchema).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
