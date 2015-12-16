
package no.catenda.bcf.v1_0.Collaboration.DocumentReference;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
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
 * document_reference_PUT
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "guid",
    "referenced_document",
    "description"
})
public class DocumentReferencePUT {

    @JsonProperty("guid")
    private String guid;
    @JsonProperty("referenced_document")
    private String referencedDocument;
    @JsonProperty("description")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The guid
     */
    @JsonProperty("guid")
    public String getGuid() {
        return guid;
    }

    /**
     * 
     * @param guid
     *     The guid
     */
    @JsonProperty("guid")
    public void setGuid(String guid) {
        this.guid = guid;
    }

    /**
     * 
     * @return
     *     The referencedDocument
     */
    @JsonProperty("referenced_document")
    public String getReferencedDocument() {
        return referencedDocument;
    }

    /**
     * 
     * @param referencedDocument
     *     The referenced_document
     */
    @JsonProperty("referenced_document")
    public void setReferencedDocument(String referencedDocument) {
        this.referencedDocument = referencedDocument;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
        return new HashCodeBuilder().append(guid).append(referencedDocument).append(description).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentReferencePUT) == false) {
            return false;
        }
        DocumentReferencePUT rhs = ((DocumentReferencePUT) other);
        return new EqualsBuilder().append(guid, rhs.guid).append(referencedDocument, rhs.referencedDocument).append(description, rhs.description).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
