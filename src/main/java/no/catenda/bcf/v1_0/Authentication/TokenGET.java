
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
 * token_GET
 * <p>
 * Access Token in BCF REST API.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "access_token",
    "token_type",
    "expires_in",
    "refresh_token"
})
public class TokenGET {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("access_token")
    @NotNull
    private String accessToken;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("token_type")
    @NotNull
    private String tokenType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("expires_in")
    @NotNull
    private Integer expiresIn;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("refresh_token")
    @NotNull
    private String refreshToken;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The accessToken
     */
    @JsonProperty("access_token")
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * 
     * (Required)
     * 
     * @param accessToken
     *     The access_token
     */
    @JsonProperty("access_token")
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The tokenType
     */
    @JsonProperty("token_type")
    public String getTokenType() {
        return tokenType;
    }

    /**
     * 
     * (Required)
     * 
     * @param tokenType
     *     The token_type
     */
    @JsonProperty("token_type")
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The expiresIn
     */
    @JsonProperty("expires_in")
    public Integer getExpiresIn() {
        return expiresIn;
    }

    /**
     * 
     * (Required)
     * 
     * @param expiresIn
     *     The expires_in
     */
    @JsonProperty("expires_in")
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The refreshToken
     */
    @JsonProperty("refresh_token")
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * 
     * (Required)
     * 
     * @param refreshToken
     *     The refresh_token
     */
    @JsonProperty("refresh_token")
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
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
        return new HashCodeBuilder().append(accessToken).append(tokenType).append(expiresIn).append(refreshToken).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TokenGET) == false) {
            return false;
        }
        TokenGET rhs = ((TokenGET) other);
        return new EqualsBuilder().append(accessToken, rhs.accessToken).append(tokenType, rhs.tokenType).append(expiresIn, rhs.expiresIn).append(refreshToken, rhs.refreshToken).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
