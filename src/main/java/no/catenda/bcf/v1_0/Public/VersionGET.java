
package no.catenda.bcf.v1_0.Public;

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
 * version_GET
 * <p>
 * Schema for Version
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "version_id",
    "detailed_version"
})
public class VersionGET {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version_id")
    @NotNull
    private String versionId;
    /**
     * 
     */
    @JsonProperty("detailed_version")
    private String detailedVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The versionId
     */
    @JsonProperty("version_id")
    public String getVersionId() {
        return versionId;
    }

    /**
     * 
     * (Required)
     * 
     * @param versionId
     *     The version_id
     */
    @JsonProperty("version_id")
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * 
     * @return
     *     The detailedVersion
     */
    @JsonProperty("detailed_version")
    public String getDetailedVersion() {
        return detailedVersion;
    }

    /**
     * 
     * @param detailedVersion
     *     The detailed_version
     */
    @JsonProperty("detailed_version")
    public void setDetailedVersion(String detailedVersion) {
        this.detailedVersion = detailedVersion;
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
        return new HashCodeBuilder().append(versionId).append(detailedVersion).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VersionGET) == false) {
            return false;
        }
        VersionGET rhs = ((VersionGET) other);
        return new EqualsBuilder().append(versionId, rhs.versionId).append(detailedVersion, rhs.detailedVersion).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
