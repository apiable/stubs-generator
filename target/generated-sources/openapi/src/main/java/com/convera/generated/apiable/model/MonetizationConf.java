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
 * MonetizationConf
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class MonetizationConf {

  @JsonProperty("connected")
  private Boolean connected;

  public MonetizationConf connected(Boolean connected) {
    this.connected = connected;
    return this;
  }

  /**
   * Get connected
   * @return connected
  */
  
  @Schema(name = "connected", required = false)
  public Boolean getConnected() {
    return connected;
  }

  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonetizationConf monetizationConf = (MonetizationConf) o;
    return Objects.equals(this.connected, monetizationConf.connected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonetizationConf {\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
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

