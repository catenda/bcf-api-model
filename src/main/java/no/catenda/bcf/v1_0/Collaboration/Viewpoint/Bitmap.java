
package no.catenda.bcf.v1_0.Collaboration.Viewpoint;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "guid",
    "bitmap_type",
    "location",
    "normal",
    "up",
    "height"
})
public class Bitmap {

    @JsonProperty("guid")
    private String guid;
    @JsonProperty("bitmap_type")
    private Bitmap.BitmapType bitmapType;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("normal")
    private Normal normal;
    @JsonProperty("up")
    private Up up;
    @JsonProperty("height")
    private Integer height;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
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
     *     The bitmapType
     */
    @JsonProperty("bitmap_type")
    public Bitmap.BitmapType getBitmapType() {
        return bitmapType;
    }

    /**
     * 
     * @param bitmapType
     *     The bitmap_type
     */
    @JsonProperty("bitmap_type")
    public void setBitmapType(Bitmap.BitmapType bitmapType) {
        this.bitmapType = bitmapType;
    }

    /**
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The normal
     */
    @JsonProperty("normal")
    public Normal getNormal() {
        return normal;
    }

    /**
     * 
     * @param normal
     *     The normal
     */
    @JsonProperty("normal")
    public void setNormal(Normal normal) {
        this.normal = normal;
    }

    /**
     * 
     * @return
     *     The up
     */
    @JsonProperty("up")
    public Up getUp() {
        return up;
    }

    /**
     * 
     * @param up
     *     The up
     */
    @JsonProperty("up")
    public void setUp(Up up) {
        this.up = up;
    }

    /**
     * 
     * @return
     *     The height
     */
    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
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
        return new HashCodeBuilder().append(guid).append(bitmapType).append(location).append(normal).append(up).append(height).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Bitmap) == false) {
            return false;
        }
        Bitmap rhs = ((Bitmap) other);
        return new EqualsBuilder().append(guid, rhs.guid).append(bitmapType, rhs.bitmapType).append(location, rhs.location).append(normal, rhs.normal).append(up, rhs.up).append(height, rhs.height).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum BitmapType {

        _0("0"),
        _1("1"),
        _2("2");
        private final String value;
        private static Map<String, Bitmap.BitmapType> constants = new HashMap<String, Bitmap.BitmapType>();

        static {
            for (Bitmap.BitmapType c: values()) {
                constants.put(c.value, c);
            }
        }

        private BitmapType(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Bitmap.BitmapType fromValue(String value) {
            Bitmap.BitmapType constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
