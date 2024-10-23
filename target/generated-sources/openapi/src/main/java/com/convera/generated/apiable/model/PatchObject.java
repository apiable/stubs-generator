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
 * PatchObject
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class PatchObject {

  /**
   * Operation to perform on the path
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

  @JsonProperty("path")
  private String path;

  @JsonProperty("value")
  private Object value;

  public PatchObject op(OpEnum op) {
    this.op = op;
    return this;
  }

  /**
   * Operation to perform on the path
   * @return op
  */
  
  @Schema(name = "op", description = "Operation to perform on the path", required = false)
  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }

  public PatchObject path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path to the field to be patched
   * @return path
  */
  
  @Schema(name = "path", description = "Path to the field to be patched", required = false)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public PatchObject value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Value to be patched
   * @return value
  */
  
  @Schema(name = "value", description = "Value to be patched", required = false)
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
    PatchObject patchObject = (PatchObject) o;
    return Objects.equals(this.op, patchObject.op) &&
        Objects.equals(this.path, patchObject.path) &&
        Objects.equals(this.value, patchObject.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchObject {\n");
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

