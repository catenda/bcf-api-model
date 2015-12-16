
package no.catenda.bcf.v1_0.Collaboration.RelatedTopic;

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
 * related_topic_PATCH
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "related_topic_guid"
})
public class RelatedTopicPATCH {

    @JsonProperty("related_topic_guid")
    private String relatedTopicGuid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The relatedTopicGuid
     */
    @JsonProperty("related_topic_guid")
    public String getRelatedTopicGuid() {
        return relatedTopicGuid;
    }

    /**
     * 
     * @param relatedTopicGuid
     *     The related_topic_guid
     */
    @JsonProperty("related_topic_guid")
    public void setRelatedTopicGuid(String relatedTopicGuid) {
        this.relatedTopicGuid = relatedTopicGuid;
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
        return new HashCodeBuilder().append(relatedTopicGuid).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RelatedTopicPATCH) == false) {
            return false;
        }
        RelatedTopicPATCH rhs = ((RelatedTopicPATCH) other);
        return new EqualsBuilder().append(relatedTopicGuid, rhs.relatedTopicGuid).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
