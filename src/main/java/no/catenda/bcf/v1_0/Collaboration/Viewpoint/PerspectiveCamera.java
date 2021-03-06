
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
    "camera_view_point",
    "camera_direction",
    "camera_up_vector",
    "field_of_view"
})
public class PerspectiveCamera {

    @JsonProperty("camera_view_point")
    private CameraViewPoint cameraViewPoint;
    @JsonProperty("camera_direction")
    private CameraDirection cameraDirection;
    @JsonProperty("camera_up_vector")
    private CameraUpVector cameraUpVector;
    @JsonProperty("field_of_view")
    private Double fieldOfView;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The cameraViewPoint
     */
    @JsonProperty("camera_view_point")
    public CameraViewPoint getCameraViewPoint() {
        return cameraViewPoint;
    }

    /**
     * 
     * @param cameraViewPoint
     *     The camera_view_point
     */
    @JsonProperty("camera_view_point")
    public void setCameraViewPoint(CameraViewPoint cameraViewPoint) {
        this.cameraViewPoint = cameraViewPoint;
    }

    /**
     * 
     * @return
     *     The cameraDirection
     */
    @JsonProperty("camera_direction")
    public CameraDirection getCameraDirection() {
        return cameraDirection;
    }

    /**
     * 
     * @param cameraDirection
     *     The camera_direction
     */
    @JsonProperty("camera_direction")
    public void setCameraDirection(CameraDirection cameraDirection) {
        this.cameraDirection = cameraDirection;
    }

    /**
     * 
     * @return
     *     The cameraUpVector
     */
    @JsonProperty("camera_up_vector")
    public CameraUpVector getCameraUpVector() {
        return cameraUpVector;
    }

    /**
     * 
     * @param cameraUpVector
     *     The camera_up_vector
     */
    @JsonProperty("camera_up_vector")
    public void setCameraUpVector(CameraUpVector cameraUpVector) {
        this.cameraUpVector = cameraUpVector;
    }

    /**
     * 
     * @return
     *     The fieldOfView
     */
    @JsonProperty("field_of_view")
    public Double getFieldOfView() {
        return fieldOfView;
    }

    /**
     * 
     * @param fieldOfView
     *     The field_of_view
     */
    @JsonProperty("field_of_view")
    public void setFieldOfView(Double fieldOfView) {
        this.fieldOfView = fieldOfView;
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
        return new HashCodeBuilder().append(cameraViewPoint).append(cameraDirection).append(cameraUpVector).append(fieldOfView).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PerspectiveCamera) == false) {
            return false;
        }
        PerspectiveCamera rhs = ((PerspectiveCamera) other);
        return new EqualsBuilder().append(cameraViewPoint, rhs.cameraViewPoint).append(cameraDirection, rhs.cameraDirection).append(cameraUpVector, rhs.cameraUpVector).append(fieldOfView, rhs.fieldOfView).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
