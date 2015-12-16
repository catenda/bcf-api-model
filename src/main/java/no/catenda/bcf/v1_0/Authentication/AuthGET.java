
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
 * auth_GET
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "oauth2_auth_url",
    "oauth2_token_url",
    "oauth2_dynamic_client_reg_url"
})
public class AuthGET {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("oauth2_auth_url")
    @NotNull
    private String oauth2AuthUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("oauth2_token_url")
    @NotNull
    private String oauth2TokenUrl;
    @JsonProperty("oauth2_dynamic_client_reg_url")
    private String oauth2DynamicClientRegUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The oauth2AuthUrl
     */
    @JsonProperty("oauth2_auth_url")
    public String getOauth2AuthUrl() {
        return oauth2AuthUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param oauth2AuthUrl
     *     The oauth2_auth_url
     */
    @JsonProperty("oauth2_auth_url")
    public void setOauth2AuthUrl(String oauth2AuthUrl) {
        this.oauth2AuthUrl = oauth2AuthUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The oauth2TokenUrl
     */
    @JsonProperty("oauth2_token_url")
    public String getOauth2TokenUrl() {
        return oauth2TokenUrl;
    }

    /**
     * 
     * (Required)
     * 
     * @param oauth2TokenUrl
     *     The oauth2_token_url
     */
    @JsonProperty("oauth2_token_url")
    public void setOauth2TokenUrl(String oauth2TokenUrl) {
        this.oauth2TokenUrl = oauth2TokenUrl;
    }

    /**
     * 
     * @return
     *     The oauth2DynamicClientRegUrl
     */
    @JsonProperty("oauth2_dynamic_client_reg_url")
    public String getOauth2DynamicClientRegUrl() {
        return oauth2DynamicClientRegUrl;
    }

    /**
     * 
     * @param oauth2DynamicClientRegUrl
     *     The oauth2_dynamic_client_reg_url
     */
    @JsonProperty("oauth2_dynamic_client_reg_url")
    public void setOauth2DynamicClientRegUrl(String oauth2DynamicClientRegUrl) {
        this.oauth2DynamicClientRegUrl = oauth2DynamicClientRegUrl;
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
        return new HashCodeBuilder().append(oauth2AuthUrl).append(oauth2TokenUrl).append(oauth2DynamicClientRegUrl).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuthGET) == false) {
            return false;
        }
        AuthGET rhs = ((AuthGET) other);
        return new EqualsBuilder().append(oauth2AuthUrl, rhs.oauth2AuthUrl).append(oauth2TokenUrl, rhs.oauth2TokenUrl).append(oauth2DynamicClientRegUrl, rhs.oauth2DynamicClientRegUrl).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
