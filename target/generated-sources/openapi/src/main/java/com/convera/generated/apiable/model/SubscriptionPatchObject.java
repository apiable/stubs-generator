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
 * SubscriptionPatchObject
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class SubscriptionPatchObject {

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
    
    EXPIRES("/expires"),
    
    STRIPESUBSCRIPTIONID("/stripeSubscriptionId"),
    
    PRICEIDS("/priceIds"),
    
    USAGEMETER("/usageMeter"),
    
    OWNER("/owner"),
    
    EMAIL("/email");

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
  private String value;

  public SubscriptionPatchObject op(OpEnum op) {
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

  public SubscriptionPatchObject path(PathEnum path) {
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

  public SubscriptionPatchObject value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  
  @Schema(name = "value", required = false)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
    SubscriptionPatchObject subscriptionPatchObject = (SubscriptionPatchObject) o;
    return Objects.equals(this.op, subscriptionPatchObject.op) &&
        Objects.equals(this.path, subscriptionPatchObject.path) &&
        Objects.equals(this.value, subscriptionPatchObject.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPatchObject {\n");
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

