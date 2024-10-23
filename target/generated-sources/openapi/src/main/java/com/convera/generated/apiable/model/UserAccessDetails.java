package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Access details and role that the invited user will have
 */

@Schema(name = "UserAccessDetails", description = "Access details and role that the invited user will have")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class UserAccessDetails {

  /**
   * Gets or Sets roleName
   */
  public enum RoleNameEnum {
    ADMIN("ADMIN"),
    
    READ_ONLY("READ_ONLY"),
    
    RESTRICTED("RESTRICTED");

    private String value;

    RoleNameEnum(String value) {
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
    public static RoleNameEnum fromValue(String value) {
      for (RoleNameEnum b : RoleNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("roleName")
  private RoleNameEnum roleName;

  /**
   * Gets or Sets apiKeys
   */
  public enum ApiKeysEnum {
    NONE("NONE"),
    
    READ("READ"),
    
    FULL("FULL");

    private String value;

    ApiKeysEnum(String value) {
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
    public static ApiKeysEnum fromValue(String value) {
      for (ApiKeysEnum b : ApiKeysEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("apiKeys")
  private ApiKeysEnum apiKeys;

  /**
   * Gets or Sets billing
   */
  public enum BillingEnum {
    NONE("NONE"),
    
    READ("READ"),
    
    FULL("FULL");

    private String value;

    BillingEnum(String value) {
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
    public static BillingEnum fromValue(String value) {
      for (BillingEnum b : BillingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("billing")
  private BillingEnum billing;

  /**
   * Gets or Sets teams
   */
  public enum TeamsEnum {
    NONE("NONE"),
    
    READ("READ"),
    
    FULL("FULL");

    private String value;

    TeamsEnum(String value) {
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
    public static TeamsEnum fromValue(String value) {
      for (TeamsEnum b : TeamsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("teams")
  private TeamsEnum teams;

  public UserAccessDetails roleName(RoleNameEnum roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Get roleName
   * @return roleName
  */
  
  @Schema(name = "roleName", required = false)
  public RoleNameEnum getRoleName() {
    return roleName;
  }

  public void setRoleName(RoleNameEnum roleName) {
    this.roleName = roleName;
  }

  public UserAccessDetails apiKeys(ApiKeysEnum apiKeys) {
    this.apiKeys = apiKeys;
    return this;
  }

  /**
   * Get apiKeys
   * @return apiKeys
  */
  
  @Schema(name = "apiKeys", required = false)
  public ApiKeysEnum getApiKeys() {
    return apiKeys;
  }

  public void setApiKeys(ApiKeysEnum apiKeys) {
    this.apiKeys = apiKeys;
  }

  public UserAccessDetails billing(BillingEnum billing) {
    this.billing = billing;
    return this;
  }

  /**
   * Get billing
   * @return billing
  */
  
  @Schema(name = "billing", required = false)
  public BillingEnum getBilling() {
    return billing;
  }

  public void setBilling(BillingEnum billing) {
    this.billing = billing;
  }

  public UserAccessDetails teams(TeamsEnum teams) {
    this.teams = teams;
    return this;
  }

  /**
   * Get teams
   * @return teams
  */
  
  @Schema(name = "teams", required = false)
  public TeamsEnum getTeams() {
    return teams;
  }

  public void setTeams(TeamsEnum teams) {
    this.teams = teams;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAccessDetails userAccessDetails = (UserAccessDetails) o;
    return Objects.equals(this.roleName, userAccessDetails.roleName) &&
        Objects.equals(this.apiKeys, userAccessDetails.apiKeys) &&
        Objects.equals(this.billing, userAccessDetails.billing) &&
        Objects.equals(this.teams, userAccessDetails.teams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleName, apiKeys, billing, teams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccessDetails {\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    apiKeys: ").append(toIndentedString(apiKeys)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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

