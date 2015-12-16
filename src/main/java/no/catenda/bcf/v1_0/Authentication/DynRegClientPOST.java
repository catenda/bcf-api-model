
package no.catenda.bcf.v1_0.Authentication;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
 * dyn_reg_client_POST
 * <p>
 * Dynamic Client Meta Data
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "client_name",
    "client_description",
    "client_url",
    "redirect_url"
})
public class DynRegClientPOST {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_name")
    @NotNull
    @Size(max = 60)
    private String clientName;
    /**
     * 
     */
    @JsonProperty("client_description")
    @Size(max = 4000)
    private String clientDescription;
    /**
     * 
     */
    @JsonProperty("client_url")
    private String clientUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("redirect_url")
    @NotNull
    private String redirectUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The clientName
     */
    @JsonProperty("client_name")
    public String getClientName() {
        return clientName;
    }

    /**
     * 
     * (Required)
     * 
     * @param clientName
     *     The client_name
     */
    @JsonProperty("client_name")
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * 
     * @return
     *     The clientDescription
     */
    @JsonProperty("client_description")
    public String getClientDescription() {
        return clientDescription;
    }

    /**
     * 
     * @param clientDescription
     *     The client_description
     */
    @JsonProperty("client_description")
    public void setClientDescription(String clientDescription) {
        this.clientDescription = clientDescription;
    }

    /**
     * 
     * @return
     *     The clientUrl
     */
    @JsonProperty("client_url")
    public String getClientUrl() {
        return clientUrl;
    }

    /**
     * 
     * @param clientUrl
     *     The client_url
     */
    @JsonProperty("client_url")
    public void setClientUrl(String clientUrl) {
        this.clientUrl = clientUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The redirectUrl
     */
    @JsonProperty("redirect_url")
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param redirectUrl
     *     The redirect_url
     */
    @JsonProperty("redirect_url")
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
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
        return new HashCodeBuilder().append(clientName).append(clientDescription).append(clientUrl).append(redirectUrl).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DynRegClientPOST) == false) {
            return false;
        }
        DynRegClientPOST rhs = ((DynRegClientPOST) other);
        return new EqualsBuilder().append(clientName, rhs.clientName).append(clientDescription, rhs.clientDescription).append(clientUrl, rhs.clientUrl).append(redirectUrl, rhs.redirectUrl).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
