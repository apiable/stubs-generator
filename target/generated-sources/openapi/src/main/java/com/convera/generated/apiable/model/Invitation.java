package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.IdentifiableObjectId;
import com.convera.generated.apiable.model.UserAccessDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Invitation
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class Invitation {

  @JsonProperty("version")
  private Integer version;

  @JsonProperty("created")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime created;

  @JsonProperty("updated")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime updated;

  @JsonProperty("id")
  private Object id;

  @JsonProperty("invitorEmail")
  private String invitorEmail;

  @JsonProperty("accessDetails")
  private UserAccessDetails accessDetails;

  @JsonProperty("team")
  private IdentifiableObjectId team;

  /**
   * The status of the invitation
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    ACCEPTED("ACCEPTED"),
    
    ARCHIVED("ARCHIVED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("expires")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime expires;

  @JsonProperty("invitee")
  private String invitee;

  @JsonProperty("invitor")
  private IdentifiableObjectId invitor;

  public Invitation version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "version", required = false)
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Invitation created(LocalDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  */
  @Valid 
  @Schema(name = "created", required = false)
  public LocalDateTime getCreated() {
    return created;
  }

  public void setCreated(LocalDateTime created) {
    this.created = created;
  }

  public Invitation updated(LocalDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
  */
  @Valid 
  @Schema(name = "updated", required = false)
  public LocalDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(LocalDateTime updated) {
    this.updated = updated;
  }

  public Invitation id(Object id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public Object getId() {
    return id;
  }

  public void setId(Object id) {
    this.id = id;
  }

  public Invitation invitorEmail(String invitorEmail) {
    this.invitorEmail = invitorEmail;
    return this;
  }

  /**
   * The email of the invitor
   * @return invitorEmail
  */
  
  @Schema(name = "invitorEmail", description = "The email of the invitor", required = false)
  public String getInvitorEmail() {
    return invitorEmail;
  }

  public void setInvitorEmail(String invitorEmail) {
    this.invitorEmail = invitorEmail;
  }

  public Invitation accessDetails(UserAccessDetails accessDetails) {
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

  public Invitation team(IdentifiableObjectId team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
  */
  @Valid 
  @Schema(name = "team", required = false)
  public IdentifiableObjectId getTeam() {
    return team;
  }

  public void setTeam(IdentifiableObjectId team) {
    this.team = team;
  }

  public Invitation status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the invitation
   * @return status
  */
  
  @Schema(name = "status", description = "The status of the invitation", required = false)
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Invitation expires(LocalDateTime expires) {
    this.expires = expires;
    return this;
  }

  /**
   * The expiration date of the invitation
   * @return expires
  */
  @Valid 
  @Schema(name = "expires", description = "The expiration date of the invitation", required = false)
  public LocalDateTime getExpires() {
    return expires;
  }

  public void setExpires(LocalDateTime expires) {
    this.expires = expires;
  }

  public Invitation invitee(String invitee) {
    this.invitee = invitee;
    return this;
  }

  /**
   * The user that is invited
   * @return invitee
  */
  
  @Schema(name = "invitee", description = "The user that is invited", required = false)
  public String getInvitee() {
    return invitee;
  }

  public void setInvitee(String invitee) {
    this.invitee = invitee;
  }

  public Invitation invitor(IdentifiableObjectId invitor) {
    this.invitor = invitor;
    return this;
  }

  /**
   * Get invitor
   * @return invitor
  */
  @Valid 
  @Schema(name = "invitor", required = false)
  public IdentifiableObjectId getInvitor() {
    return invitor;
  }

  public void setInvitor(IdentifiableObjectId invitor) {
    this.invitor = invitor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invitation invitation = (Invitation) o;
    return Objects.equals(this.version, invitation.version) &&
        Objects.equals(this.created, invitation.created) &&
        Objects.equals(this.updated, invitation.updated) &&
        Objects.equals(this.id, invitation.id) &&
        Objects.equals(this.invitorEmail, invitation.invitorEmail) &&
        Objects.equals(this.accessDetails, invitation.accessDetails) &&
        Objects.equals(this.team, invitation.team) &&
        Objects.equals(this.status, invitation.status) &&
        Objects.equals(this.expires, invitation.expires) &&
        Objects.equals(this.invitee, invitation.invitee) &&
        Objects.equals(this.invitor, invitation.invitor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, created, updated, id, invitorEmail, accessDetails, team, status, expires, invitee, invitor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invitation {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invitorEmail: ").append(toIndentedString(invitorEmail)).append("\n");
    sb.append("    accessDetails: ").append(toIndentedString(accessDetails)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    invitee: ").append(toIndentedString(invitee)).append("\n");
    sb.append("    invitor: ").append(toIndentedString(invitor)).append("\n");
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

