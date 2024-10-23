package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.UserAccessDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The role and permissions that a user has in a team
 */

@Schema(name = "TeamRole", description = "The role and permissions that a user has in a team")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class TeamRole {

  @JsonProperty("teamId")
  private Object teamId;

  @JsonProperty("accessDetails")
  private UserAccessDetails accessDetails;

  public TeamRole teamId(Object teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Get teamId
   * @return teamId
  */
  
  @Schema(name = "teamId", required = false)
  public Object getTeamId() {
    return teamId;
  }

  public void setTeamId(Object teamId) {
    this.teamId = teamId;
  }

  public TeamRole accessDetails(UserAccessDetails accessDetails) {
    this.accessDetails = accessDetails;
    return this;
  }

  /**
   * Get accessDetails
   * @return accessDetails
  */
  @Valid 
  @Schema(name = "accessDetails", required = false)
  public UserAccessDetails getAccessDetails() {
    return accessDetails;
  }

  public void setAccessDetails(UserAccessDetails accessDetails) {
    this.accessDetails = accessDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamRole teamRole = (TeamRole) o;
    return Objects.equals(this.teamId, teamRole.teamId) &&
        Objects.equals(this.accessDetails, teamRole.accessDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, accessDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamRole {\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    accessDetails: ").append(toIndentedString(accessDetails)).append("\n");
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

