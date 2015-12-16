
package no.catenda.bcf.v1_0.Collaboration.Viewpoint;

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
 * viewpoint_GET
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "guid",
    "orthogonal_camera",
    "perspective_camera",
    "lines",
    "clipping_planes",
    "bitmaps"
})
public class ViewpointGET {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("guid")
    @NotNull
    private String guid;
    @JsonProperty("orthogonal_camera")
    private OrthogonalCamera orthogonalCamera;
    @JsonProperty("perspective_camera")
    private PerspectiveCamera perspectiveCamera;
    @JsonProperty("lines")
    private Lines lines;
    @JsonProperty("clipping_planes")
    private ClippingPlanes clippingPlanes;
    @JsonProperty("bitmaps")
    private Bitmaps bitmaps;
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
     *     The bitmaps
     */
    @JsonProperty("bitmaps")
    public Bitmaps getBitmaps() {
        return bitmaps;
    }

    /**
     * 
     * @param bitmaps
     *     The bitmaps
     */
    @JsonProperty("bitmaps")
    public void setBitmaps(Bitmaps bitmaps) {
        this.bitmaps = bitmaps;
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
        return new HashCodeBuilder().append(guid).append(orthogonalCamera).append(perspectiveCamera).append(lines).append(clippingPlanes).append(bitmaps).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ViewpointGET) == false) {
            return false;
        }
        ViewpointGET rhs = ((ViewpointGET) other);
        return new EqualsBuilder().append(guid, rhs.guid).append(orthogonalCamera, rhs.orthogonalCamera).append(perspectiveCamera, rhs.perspectiveCamera).append(lines, rhs.lines).append(clippingPlanes, rhs.clippingPlanes).append(bitmaps, rhs.bitmaps).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
