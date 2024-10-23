package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Authentication details for the subscription
 */

@Schema(name = "Auth", description = "Authentication details for the subscription")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class Auth {

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    BASIC_API_KEY("BASIC_API_KEY"),
    
    INTERMEDIATE_JWT("INTERMEDIATE_JWT"),
    
    INTERMEDIATE_CLIENT_CREDENTIAL("INTERMEDIATE_CLIENT_CREDENTIAL"),
    
    ADVANCED_CODE_FLOW("ADVANCED_CODE_FLOW"),
    
    EVOLVED_CENTRALIZED_CLAIMS("EVOLVED_CENTRALIZED_CLAIMS");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("id")
  private String id;

  @JsonProperty("integrationId")
  private String integrationId;

  public Auth type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", required = false)
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Auth id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Auth integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  /**
   * Get integrationId
   * @return integrationId
  */
  
  @Schema(name = "integrationId", required = false)
  public String getIntegrationId() {
    return integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auth auth = (Auth) o;
    return Objects.equals(this.type, auth.type) &&
        Objects.equals(this.id, auth.id) &&
        Objects.equals(this.integrationId, auth.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, integrationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auth {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

