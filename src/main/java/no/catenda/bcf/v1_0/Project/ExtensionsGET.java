
package no.catenda.bcf.v1_0.Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * extensions_GET
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "topic_type",
    "topic_status",
    "topic_label",
    "snippet_type",
    "priority",
    "user_id_type"
})
public class ExtensionsGET {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("topic_type")
    @NotNull
    private List<String> topicType = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("topic_status")
    @NotNull
    private List<String> topicStatus = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("topic_label")
    @NotNull
    private List<String> topicLabel = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("snippet_type")
    @NotNull
    private List<String> snippetType = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("priority")
    @NotNull
    private List<String> priority = new ArrayList<String>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("user_id_type")
    @NotNull
    private List<String> userIdType = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The topicType
     */
    @JsonProperty("topic_type")
    public List<String> getTopicType() {
        return topicType;
    }

    /**
     * 
     * (Required)
     * 
     * @param topicType
     *     The topic_type
     */
    @JsonProperty("topic_type")
    public void setTopicType(List<String> topicType) {
        this.topicType = topicType;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The topicStatus
     */
    @JsonProperty("topic_status")
    public List<String> getTopicStatus() {
        return topicStatus;
    }

    /**
     * 
     * (Required)
     * 
     * @param topicStatus
     *     The topic_status
     */
    @JsonProperty("topic_status")
    public void setTopicStatus(List<String> topicStatus) {
        this.topicStatus = topicStatus;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The topicLabel
     */
    @JsonProperty("topic_label")
    public List<String> getTopicLabel() {
        return topicLabel;
    }

    /**
     * 
     * (Required)
     * 
     * @param topicLabel
     *     The topic_label
     */
    @JsonProperty("topic_label")
    public void setTopicLabel(List<String> topicLabel) {
        this.topicLabel = topicLabel;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The snippetType
     */
    @JsonProperty("snippet_type")
    public List<String> getSnippetType() {
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
    public void setSnippetType(List<String> snippetType) {
        this.snippetType = snippetType;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The priority
     */
    @JsonProperty("priority")
    public List<String> getPriority() {
        return priority;
    }

    /**
     * 
     * (Required)
     * 
     * @param priority
     *     The priority
     */
    @JsonProperty("priority")
    public void setPriority(List<String> priority) {
        this.priority = priority;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The userIdType
     */
    @JsonProperty("user_id_type")
    public List<String> getUserIdType() {
        return userIdType;
    }

    /**
     * 
     * (Required)
     * 
     * @param userIdType
     *     The user_id_type
     */
    @JsonProperty("user_id_type")
    public void setUserIdType(List<String> userIdType) {
        this.userIdType = userIdType;
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
        return new HashCodeBuilder().append(topicType).append(topicStatus).append(topicLabel).append(snippetType).append(priority).append(userIdType).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExtensionsGET) == false) {
            return false;
        }
        ExtensionsGET rhs = ((ExtensionsGET) other);
        return new EqualsBuilder().append(topicType, rhs.topicType).append(topicStatus, rhs.topicStatus).append(topicLabel, rhs.topicLabel).append(snippetType, rhs.snippetType).append(priority, rhs.priority).append(userIdType, rhs.userIdType).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
