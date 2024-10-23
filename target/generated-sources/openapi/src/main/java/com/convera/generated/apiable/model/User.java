package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.UserMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * User
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class User {

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

  @JsonProperty("providerId")
  private String providerId;

  @JsonProperty("metadata")
  private UserMetadata metadata;

  @JsonProperty("givenName")
  private String givenName;

  @JsonProperty("familyName")
  private String familyName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("name")
  private String name;

  @JsonProperty("active")
  private Boolean active;

  @JsonProperty("company")
  private String company;

  public User version(Integer version) {
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

  public User created(LocalDateTime created) {
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

  public User updated(LocalDateTime updated) {
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

  public User id(Object id) {
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

  public User providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

  /**
   * The provider id of the user
   * @return providerId
  */
  
  @Schema(name = "providerId", description = "The provider id of the user", required = false)
  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  public User metadata(UserMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @Valid 
  @Schema(name = "metadata", required = false)
  public UserMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(UserMetadata metadata) {
    this.metadata = metadata;
  }

  public User givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * The first or given name of the user
   * @return givenName
  */
  
  @Schema(name = "givenName", description = "The first or given name of the user", required = false)
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public User familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * The last or family name of the user
   * @return familyName
  */
  
  @Schema(name = "familyName", description = "The last or family name of the user", required = false)
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email of the user
   * @return email
  */
  
  @Schema(name = "email", description = "The email of the user", required = false)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The full name of the user, read only, constructed from the given and family name
   * @return name
  */
  
  @Schema(name = "name", description = "The full name of the user, read only, constructed from the given and family name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Flag to indicate if the user is active
   * @return active
  */
  
  @Schema(name = "active", description = "Flag to indicate if the user is active", required = false)
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public User company(String company) {
    this.company = company;
    return this;
  }

  /**
   * Name of the company the user is part of, by default it is the domain of the email
   * @return company
  */
  
  @Schema(name = "company", description = "Name of the company the user is part of, by default it is the domain of the email", required = false)
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
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
    User user = (User) o;
    return Objects.equals(this.version, user.version) &&
        Objects.equals(this.created, user.created) &&
        Objects.equals(this.updated, user.updated) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.providerId, user.providerId) &&
        Objects.equals(this.metadata, user.metadata) &&
        Objects.equals(this.givenName, user.givenName) &&
        Objects.equals(this.familyName, user.familyName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.active, user.active) &&
        Objects.equals(this.company, user.company);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, created, updated, id, providerId, metadata, givenName, familyName, email, name, active, company);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

