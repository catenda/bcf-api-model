
package no.catenda.bcf.v1_0.Collaboration.Topic;

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
 * topic_POST
 * <p>
 * Schema for topic POST, BCF REST API.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "topic_type",
    "topic_status",
    "reference_link",
    "title",
    "priority",
    "index",
    "labels",
    "assigned_to",
    "description",
    "bim_snippet"
})
public class TopicPOST {

    @JsonProperty("topic_type")
    private String topicType;
    @JsonProperty("topic_status")
    private String topicStatus;
    @JsonProperty("reference_link")
    private String referenceLink;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("title")
    @NotNull
    private String title;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("index")
    private Integer index;
    @JsonProperty("labels")
    private List<String> labels = new ArrayList<String>();
    @JsonProperty("assigned_to")
    private String assignedTo;
    @JsonProperty("description")
    private String description;
    /**
     * bim_snippet
     * <p>
     * 
     * 
     */
    @JsonProperty("bim_snippet")
    private BimSnippet bimSnippet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The topicType
     */
    @JsonProperty("topic_type")
    public String getTopicType() {
        return topicType;
    }

    /**
     * 
     * @param topicType
     *     The topic_type
     */
    @JsonProperty("topic_type")
    public void setTopicType(String topicType) {
        this.topicType = topicType;
    }

    /**
     * 
     * @return
     *     The topicStatus
     */
    @JsonProperty("topic_status")
    public String getTopicStatus() {
        return topicStatus;
    }

    /**
     * 
     * @param topicStatus
     *     The topic_status
     */
    @JsonProperty("topic_status")
    public void setTopicStatus(String topicStatus) {
        this.topicStatus = topicStatus;
    }

    /**
     * 
     * @return
     *     The referenceLink
     */
    @JsonProperty("reference_link")
    public String getReferenceLink() {
        return referenceLink;
    }

    /**
     * 
     * @param referenceLink
     *     The reference_link
     */
    @JsonProperty("reference_link")
    public void setReferenceLink(String referenceLink) {
        this.referenceLink = referenceLink;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * (Required)
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The priority
     */
    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    /**
     * 
     * @param priority
     *     The priority
     */
    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * 
     * @return
     *     The index
     */
    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    /**
     * 
     * @param index
     *     The index
     */
    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * 
     * @return
     *     The labels
     */
    @JsonProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    /**
     * 
     * @param labels
     *     The labels
     */
    @JsonProperty("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    /**
     * 
     * @return
     *     The assignedTo
     */
    @JsonProperty("assigned_to")
    public String getAssignedTo() {
        return assignedTo;
    }

    /**
     * 
     * @param assignedTo
     *     The assigned_to
     */
    @JsonProperty("assigned_to")
    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
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

    /**
     * bim_snippet
     * <p>
     * 
     * 
     * @return
     *     The bimSnippet
     */
    @JsonProperty("bim_snippet")
    public BimSnippet getBimSnippet() {
        return bimSnippet;
    }

    /**
     * bim_snippet
     * <p>
     * 
     * 
     * @param bimSnippet
     *     The bim_snippet
     */
    @JsonProperty("bim_snippet")
    public void setBimSnippet(BimSnippet bimSnippet) {
        this.bimSnippet = bimSnippet;
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
        return new HashCodeBuilder().append(topicType).append(topicStatus).append(referenceLink).append(title).append(priority).append(index).append(labels).append(assignedTo).append(description).append(bimSnippet).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopicPOST) == false) {
            return false;
        }
        TopicPOST rhs = ((TopicPOST) other);
        return new EqualsBuilder().append(topicType, rhs.topicType).append(topicStatus, rhs.topicStatus).append(referenceLink, rhs.referenceLink).append(title, rhs.title).append(priority, rhs.priority).append(index, rhs.index).append(labels, rhs.labels).append(assignedTo, rhs.assignedTo).append(description, rhs.description).append(bimSnippet, rhs.bimSnippet).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
