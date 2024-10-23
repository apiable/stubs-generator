package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
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
 * Resource
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class Resource {

  @JsonProperty("path")
  private String path;

  @JsonProperty("method")
  private String method;

  @JsonProperty("integrationId")
  private String integrationId;

  public Resource path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  
  @Schema(name = "path", required = false)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Resource method(String method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  */
  
  @Schema(name = "method", required = false)
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public Resource integrationId(String integrationId) {
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
    Resource resource = (Resource) o;
    return Objects.equals(this.path, resource.path) &&
        Objects.equals(this.method, resource.method) &&
        Objects.equals(this.integrationId, resource.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, method, integrationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

