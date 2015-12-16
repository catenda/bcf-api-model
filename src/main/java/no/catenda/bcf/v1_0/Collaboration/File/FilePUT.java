
package no.catenda.bcf.v1_0.Collaboration.File;

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
 * file_PUT
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "ifc_project",
    "ifc_spatial_structure_element",
    "file_name",
    "date",
    "reference"
})
public class FilePUT {

    @JsonProperty("ifc_project")
    private String ifcProject;
    @JsonProperty("ifc_spatial_structure_element")
    private String ifcSpatialStructureElement;
    @JsonProperty("file_name")
    private String fileName;
    @JsonProperty("date")
    private String date;
    @JsonProperty("reference")
    private String reference;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The ifcProject
     */
    @JsonProperty("ifc_project")
    public String getIfcProject() {
        return ifcProject;
    }

    /**
     * 
     * @param ifcProject
     *     The ifc_project
     */
    @JsonProperty("ifc_project")
    public void setIfcProject(String ifcProject) {
        this.ifcProject = ifcProject;
    }

    /**
     * 
     * @return
     *     The ifcSpatialStructureElement
     */
    @JsonProperty("ifc_spatial_structure_element")
    public String getIfcSpatialStructureElement() {
        return ifcSpatialStructureElement;
    }

    /**
     * 
     * @param ifcSpatialStructureElement
     *     The ifc_spatial_structure_element
     */
    @JsonProperty("ifc_spatial_structure_element")
    public void setIfcSpatialStructureElement(String ifcSpatialStructureElement) {
        this.ifcSpatialStructureElement = ifcSpatialStructureElement;
    }

    /**
     * 
     * @return
     *     The fileName
     */
    @JsonProperty("file_name")
    public String getFileName() {
        return fileName;
    }

    /**
     * 
     * @param fileName
     *     The file_name
     */
    @JsonProperty("file_name")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
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
     * @param date
     *     The date
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The reference
     */
    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    /**
     * 
     * @param reference
     *     The reference
     */
    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
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
        return new HashCodeBuilder().append(ifcProject).append(ifcSpatialStructureElement).append(fileName).append(date).append(reference).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FilePUT) == false) {
            return false;
        }
        FilePUT rhs = ((FilePUT) other);
        return new EqualsBuilder().append(ifcProject, rhs.ifcProject).append(ifcSpatialStructureElement, rhs.ifcSpatialStructureElement).append(fileName, rhs.fileName).append(date, rhs.date).append(reference, rhs.reference).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
