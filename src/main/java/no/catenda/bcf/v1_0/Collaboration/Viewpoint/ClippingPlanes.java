
package no.catenda.bcf.v1_0.Collaboration.Viewpoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "clipping_plane"
})
public class ClippingPlanes {

    @JsonProperty("clipping_plane")
    private List<ClippingPlane> clippingPlane = new ArrayList<ClippingPlane>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The clippingPlane
     */
    @JsonProperty("clipping_plane")
    public List<ClippingPlane> getClippingPlane() {
        return clippingPlane;
    }

    /**
     * 
     * @param clippingPlane
     *     The clipping_plane
     */
    @JsonProperty("clipping_plane")
    public void setClippingPlane(List<ClippingPlane> clippingPlane) {
        this.clippingPlane = clippingPlane;
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
        return new HashCodeBuilder().append(clippingPlane).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClippingPlanes) == false) {
            return false;
        }
        ClippingPlanes rhs = ((ClippingPlanes) other);
        return new EqualsBuilder().append(clippingPlane, rhs.clippingPlane).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
