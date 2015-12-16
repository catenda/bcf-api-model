
package no.catenda.bcf.v1_0.Collaboration.Comment;

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
 * comment_GET
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "guid",
    "verbal_status",
    "status",
    "date",
    "author",
    "comment",
    "topic_guid",
    "viewpoint_guid",
    "reply_to_comment_guid",
    "modified_date",
    "modified_author"
})
public class CommentGET {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("guid")
    @NotNull
    private String guid;
    @JsonProperty("verbal_status")
    private String verbalStatus;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    @NotNull
    private String status;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    @NotNull
    private String date;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("author")
    @NotNull
    private String author;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("comment")
    @NotNull
    private String comment;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("topic_guid")
    @NotNull
    private String topicGuid;
    @JsonProperty("viewpoint_guid")
    private String viewpointGuid;
    @JsonProperty("reply_to_comment_guid")
    private String replyToCommentGuid;
    @JsonProperty("modified_date")
    private String modifiedDate;
    @JsonProperty("modified_author")
    private String modifiedAuthor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
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
     * (Required)
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
     *     The verbalStatus
     */
    @JsonProperty("verbal_status")
    public String getVerbalStatus() {
        return verbalStatus;
    }

    /**
     * 
     * @param verbalStatus
     *     The verbal_status
     */
    @JsonProperty("verbal_status")
    public void setVerbalStatus(String verbalStatus) {
        this.verbalStatus = verbalStatus;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * (Required)
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The date
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * 
     * (Required)
     * 
     * @param date
     *     The date
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The author
     */
    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    /**
     * 
     * (Required)
     * 
     * @param author
     *     The author
     */
    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The comment
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * 
     * (Required)
     * 
     * @param comment
     *     The comment
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The topicGuid
     */
    @JsonProperty("topic_guid")
    public String getTopicGuid() {
        return topicGuid;
    }

    /**
     * 
     * (Required)
     * 
     * @param topicGuid
     *     The topic_guid
     */
    @JsonProperty("topic_guid")
    public void setTopicGuid(String topicGuid) {
        this.topicGuid = topicGuid;
    }

    /**
     * 
     * @return
     *     The viewpointGuid
     */
    @JsonProperty("viewpoint_guid")
    public String getViewpointGuid() {
        return viewpointGuid;
    }

    /**
     * 
     * @param viewpointGuid
     *     The viewpoint_guid
     */
    @JsonProperty("viewpoint_guid")
    public void setViewpointGuid(String viewpointGuid) {
        this.viewpointGuid = viewpointGuid;
    }

    /**
     * 
     * @return
     *     The replyToCommentGuid
     */
    @JsonProperty("reply_to_comment_guid")
    public String getReplyToCommentGuid() {
        return replyToCommentGuid;
    }

    /**
     * 
     * @param replyToCommentGuid
     *     The reply_to_comment_guid
     */
    @JsonProperty("reply_to_comment_guid")
    public void setReplyToCommentGuid(String replyToCommentGuid) {
        this.replyToCommentGuid = replyToCommentGuid;
    }

    /**
     * 
     * @return
     *     The modifiedDate
     */
    @JsonProperty("modified_date")
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * 
     * @param modifiedDate
     *     The modified_date
     */
    @JsonProperty("modified_date")
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * 
     * @return
     *     The modifiedAuthor
     */
    @JsonProperty("modified_author")
    public String getModifiedAuthor() {
        return modifiedAuthor;
    }

    /**
     * 
     * @param modifiedAuthor
     *     The modified_author
     */
    @JsonProperty("modified_author")
    public void setModifiedAuthor(String modifiedAuthor) {
        this.modifiedAuthor = modifiedAuthor;
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
        return new HashCodeBuilder().append(guid).append(verbalStatus).append(status).append(date).append(author).append(comment).append(topicGuid).append(viewpointGuid).append(replyToCommentGuid).append(modifiedDate).append(modifiedAuthor).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommentGET) == false) {
            return false;
        }
        CommentGET rhs = ((CommentGET) other);
        return new EqualsBuilder().append(guid, rhs.guid).append(verbalStatus, rhs.verbalStatus).append(status, rhs.status).append(date, rhs.date).append(author, rhs.author).append(comment, rhs.comment).append(topicGuid, rhs.topicGuid).append(viewpointGuid, rhs.viewpointGuid).append(replyToCommentGuid, rhs.replyToCommentGuid).append(modifiedDate, rhs.modifiedDate).append(modifiedAuthor, rhs.modifiedAuthor).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
