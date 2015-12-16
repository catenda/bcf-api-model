
package no.catenda.bcf.v1_0.Collaboration.Component;

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
 * component_GET
 * <p>
 * Schema for single component GET, BCF REST API.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "ifc_guid",
    "selected",
    "visible",
    "color",
    "originating_system",
    "authoring_tool_id"
})
public class ComponentGET {

    @JsonProperty("ifc_guid")
    private String ifcGuid;
    @JsonProperty("selected")
    private Boolean selected;
    @JsonProperty("visible")
    private Boolean visible;
    @JsonProperty("color")
    private String color;
    @JsonProperty("originating_system")
    private String originatingSystem;
    @JsonProperty("authoring_tool_id")
    private String authoringToolId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The ifcGuid
     */
    @JsonProperty("ifc_guid")
    public String getIfcGuid() {
        return ifcGuid;
    }

    /**
     * 
     * @param ifcGuid
     *     The ifc_guid
     */
    @JsonProperty("ifc_guid")
    public void setIfcGuid(String ifcGuid) {
        this.ifcGuid = ifcGuid;
    }

    /**
     * 
     * @return
     *     The selected
     */
    @JsonProperty("selected")
    public Boolean getSelected() {
        return selected;
    }

    /**
     * 
     * @param selected
     *     The selected
     */
    @JsonProperty("selected")
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    /**
     * 
     * @return
     *     The visible
     */
    @JsonProperty("visible")
    public Boolean getVisible() {
        return visible;
    }

    /**
     * 
     * @param visible
     *     The visible
     */
    @JsonProperty("visible")
    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    /**
     * 
     * @return
     *     The color
     */
    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    /**
     * 
     * @param color
     *     The color
     */
    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 
     * @return
     *     The originatingSystem
     */
    @JsonProperty("originating_system")
    public String getOriginatingSystem() {
        return originatingSystem;
    }

    /**
     * 
     * @param originatingSystem
     *     The originating_system
     */
    @JsonProperty("originating_system")
    public void setOriginatingSystem(String originatingSystem) {
        this.originatingSystem = originatingSystem;
    }

    /**
     * 
     * @return
     *     The authoringToolId
     */
    @JsonProperty("authoring_tool_id")
    public String getAuthoringToolId() {
        return authoringToolId;
    }

    /**
     * 
     * @param authoringToolId
     *     The authoring_tool_id
     */
    @JsonProperty("authoring_tool_id")
    public void setAuthoringToolId(String authoringToolId) {
        this.authoringToolId = authoringToolId;
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
        return new HashCodeBuilder().append(ifcGuid).append(selected).append(visible).append(color).append(originatingSystem).append(authoringToolId).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComponentGET) == false) {
            return false;
        }
        ComponentGET rhs = ((ComponentGET) other);
        return new EqualsBuilder().append(ifcGuid, rhs.ifcGuid).append(selected, rhs.selected).append(visible, rhs.visible).append(color, rhs.color).append(originatingSystem, rhs.originatingSystem).append(authoringToolId, rhs.authoringToolId).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
