
package no.catenda.bcf.v1_0.Authentication;

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
 * dyn_reg_client_GET
 * <p>
 * Dynamic Client Meta Data
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "client_id",
    "client_secret"
})
public class DynRegClientGET {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_id")
    @NotNull
    private String clientId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_secret")
    @NotNull
    private String clientSecret;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The clientId
     */
    @JsonProperty("client_id")
    public String getClientId() {
        return clientId;
    }

    /**
     * 
     * (Required)
     * 
     * @param clientId
     *     The client_id
     */
    @JsonProperty("client_id")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The clientSecret
     */
    @JsonProperty("client_secret")
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * 
     * (Required)
     * 
     * @param clientSecret
     *     The client_secret
     */
    @JsonProperty("client_secret")
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
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
        return new HashCodeBuilder().append(clientId).append(clientSecret).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DynRegClientGET) == false) {
            return false;
        }
        DynRegClientGET rhs = ((DynRegClientGET) other);
        return new EqualsBuilder().append(clientId, rhs.clientId).append(clientSecret, rhs.clientSecret).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
