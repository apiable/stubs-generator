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
 * TeamPatchObject
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class TeamPatchObject {

  /**
   * Gets or Sets op
   */
  public enum OpEnum {
    REPLACE("replace");

    private String value;

    OpEnum(String value) {
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
    public static OpEnum fromValue(String value) {
      for (OpEnum b : OpEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("op")
  private OpEnum op;

  /**
   * Gets or Sets path
   */
  public enum PathEnum {
    NAME("/name"),
    
    INTERNAL("/internal");

    private String value;

    PathEnum(String value) {
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
    public static PathEnum fromValue(String value) {
      for (PathEnum b : PathEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("path")
  private PathEnum path;

  @JsonProperty("value")
  private Object value;

  public TeamPatchObject op(OpEnum op) {
    this.op = op;
    return this;
  }

  /**
   * Get op
   * @return op
  */
  
  @Schema(name = "op", required = false)
  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }

  public TeamPatchObject path(PathEnum path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  
  @Schema(name = "path", required = false)
  public PathEnum getPath() {
    return path;
  }

  public void setPath(PathEnum path) {
    this.path = path;
  }

  public TeamPatchObject value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  
  @Schema(name = "value", required = false)
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamPatchObject teamPatchObject = (TeamPatchObject) o;
    return Objects.equals(this.op, teamPatchObject.op) &&
        Objects.equals(this.path, teamPatchObject.path) &&
        Objects.equals(this.value, teamPatchObject.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamPatchObject {\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

