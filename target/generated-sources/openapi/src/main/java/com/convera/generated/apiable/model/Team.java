package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.IdentifiableObjectId;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Team
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class Team {

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

  @JsonProperty("name")
  private String name;

  @JsonProperty("users")
  @Valid
  private List<IdentifiableObjectId> users = null;

  @JsonProperty("internal")
  private Boolean internal;

  @JsonProperty("company")
  private IdentifiableObjectId company;

  public Team version(Integer version) {
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

  public Team created(LocalDateTime created) {
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

  public Team updated(LocalDateTime updated) {
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

  public Team id(Object id) {
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

  public Team name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the team
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the team", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Team users(List<IdentifiableObjectId> users) {
    this.users = users;
    return this;
  }

  public Team addUsersItem(IdentifiableObjectId usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * List of users in the team
   * @return users
  */
  @Valid 
  @Schema(name = "users", description = "List of users in the team", required = false)
  public List<IdentifiableObjectId> getUsers() {
    return users;
  }

  public void setUsers(List<IdentifiableObjectId> users) {
    this.users = users;
  }

  public Team internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

  /**
   * The internal status of the team
   * @return internal
  */
  
  @Schema(name = "internal", description = "The internal status of the team", required = false)
  public Boolean getInternal() {
    return internal;
  }

  public void setInternal(Boolean internal) {
    this.internal = internal;
  }

  public Team company(IdentifiableObjectId company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
  */
  @Valid 
  @Schema(name = "company", required = false)
  public IdentifiableObjectId getCompany() {
    return company;
  }

  public void setCompany(IdentifiableObjectId company) {
    this.company = company;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Team team = (Team) o;
    return Objects.equals(this.version, team.version) &&
        Objects.equals(this.created, team.created) &&
        Objects.equals(this.updated, team.updated) &&
        Objects.equals(this.id, team.id) &&
        Objects.equals(this.name, team.name) &&
        Objects.equals(this.users, team.users) &&
        Objects.equals(this.internal, team.internal) &&
        Objects.equals(this.company, team.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, created, updated, id, name, users, internal, company);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Team {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
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

