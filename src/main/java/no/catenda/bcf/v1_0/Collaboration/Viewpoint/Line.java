
package no.catenda.bcf.v1_0.Collaboration.Viewpoint;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "start_point",
    "end_point"
})
public class Line {

    @JsonProperty("start_point")
    private StartPoint startPoint;
    @JsonProperty("end_point")
    private EndPoint endPoint;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The startPoint
     */
    @JsonProperty("start_point")
    public StartPoint getStartPoint() {
        return startPoint;
    }

    /**
     * 
     * @param startPoint
     *     The start_point
     */
    @JsonProperty("start_point")
    public void setStartPoint(StartPoint startPoint) {
        this.startPoint = startPoint;
    }

    /**
     * 
     * @return
     *     The endPoint
     */
    @JsonProperty("end_point")
    public EndPoint getEndPoint() {
        return endPoint;
    }

    /**
     * 
     * @param endPoint
     *     The end_point
     */
    @JsonProperty("end_point")
    public void setEndPoint(EndPoint endPoint) {
        this.endPoint = endPoint;
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
        return new HashCodeBuilder().append(startPoint).append(endPoint).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Line) == false) {
            return false;
        }
        Line rhs = ((Line) other);
        return new EqualsBuilder().append(startPoint, rhs.startPoint).append(endPoint, rhs.endPoint).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
