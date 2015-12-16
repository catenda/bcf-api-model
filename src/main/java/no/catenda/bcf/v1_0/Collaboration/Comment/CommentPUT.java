
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
 * comment_PUT
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "verbal_status",
    "status",
    "comment",
    "viewpoint_guid",
    "reply_to_comment_guid"
})
public class CommentPUT {

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
    @JsonProperty("comment")
    @NotNull
    private String comment;
    @JsonProperty("viewpoint_guid")
    private String viewpointGuid;
    @JsonProperty("reply_to_comment_guid")
    private String replyToCommentGuid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
        return new HashCodeBuilder().append(verbalStatus).append(status).append(comment).append(viewpointGuid).append(replyToCommentGuid).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CommentPUT) == false) {
            return false;
        }
        CommentPUT rhs = ((CommentPUT) other);
        return new EqualsBuilder().append(verbalStatus, rhs.verbalStatus).append(status, rhs.status).append(comment, rhs.comment).append(viewpointGuid, rhs.viewpointGuid).append(replyToCommentGuid, rhs.replyToCommentGuid).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
