
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


/**
 * viewpoint_PATCH
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "orthogonal_camera",
    "perspective_camera",
    "lines",
    "clipping_planes",
    "snapshot"
})
public class ViewpointPATCH {

    @JsonProperty("orthogonal_camera")
    private OrthogonalCamera orthogonalCamera;
    @JsonProperty("perspective_camera")
    private PerspectiveCamera perspectiveCamera;
    @JsonProperty("lines")
    private Lines lines;
    @JsonProperty("clipping_planes")
    private ClippingPlanes clippingPlanes;
    @JsonProperty("snapshot")
    private Snapshot snapshot;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The orthogonalCamera
     */
    @JsonProperty("orthogonal_camera")
    public OrthogonalCamera getOrthogonalCamera() {
        return orthogonalCamera;
    }

    /**
     * 
     * @param orthogonalCamera
     *     The orthogonal_camera
     */
    @JsonProperty("orthogonal_camera")
    public void setOrthogonalCamera(OrthogonalCamera orthogonalCamera) {
        this.orthogonalCamera = orthogonalCamera;
    }

    /**
     * 
     * @return
     *     The perspectiveCamera
     */
    @JsonProperty("perspective_camera")
    public PerspectiveCamera getPerspectiveCamera() {
        return perspectiveCamera;
    }

    /**
     * 
     * @param perspectiveCamera
     *     The perspective_camera
     */
    @JsonProperty("perspective_camera")
    public void setPerspectiveCamera(PerspectiveCamera perspectiveCamera) {
        this.perspectiveCamera = perspectiveCamera;
    }

    /**
     * 
     * @return
     *     The lines
     */
    @JsonProperty("lines")
    public Lines getLines() {
        return lines;
    }

    /**
     * 
     * @param lines
     *     The lines
     */
    @JsonProperty("lines")
    public void setLines(Lines lines) {
        this.lines = lines;
    }

    /**
     * 
     * @return
     *     The clippingPlanes
     */
    @JsonProperty("clipping_planes")
    public ClippingPlanes getClippingPlanes() {
        return clippingPlanes;
    }

    /**
     * 
     * @param clippingPlanes
     *     The clipping_planes
     */
    @JsonProperty("clipping_planes")
    public void setClippingPlanes(ClippingPlanes clippingPlanes) {
        this.clippingPlanes = clippingPlanes;
    }

    /**
     * 
     * @return
     *     The snapshot
     */
    @JsonProperty("snapshot")
    public Snapshot getSnapshot() {
        return snapshot;
    }

    /**
     * 
     * @param snapshot
     *     The snapshot
     */
    @JsonProperty("snapshot")
    public void setSnapshot(Snapshot snapshot) {
        this.snapshot = snapshot;
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
        return new HashCodeBuilder().append(orthogonalCamera).append(perspectiveCamera).append(lines).append(clippingPlanes).append(snapshot).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ViewpointPATCH) == false) {
            return false;
        }
        ViewpointPATCH rhs = ((ViewpointPATCH) other);
        return new EqualsBuilder().append(orthogonalCamera, rhs.orthogonalCamera).append(perspectiveCamera, rhs.perspectiveCamera).append(lines, rhs.lines).append(clippingPlanes, rhs.clippingPlanes).append(snapshot, rhs.snapshot).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
