package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.IdentifiableObjectId;
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
 * Reference to a feature identifier with value for this plan.
 */

@Schema(name = "FeatureExpanded", description = "Reference to a feature identifier with value for this plan.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class FeatureExpanded {

  @JsonProperty("ref")
  private IdentifiableObjectId ref;

  @JsonProperty("value")
  private String value;

  public FeatureExpanded ref(IdentifiableObjectId ref) {
    this.ref = ref;
    return this;
  }

  /**
   * Get ref
   * @return ref
  */
  @Valid 
  @Schema(name = "ref", required = false)
  public IdentifiableObjectId getRef() {
    return ref;
  }

  public void setRef(IdentifiableObjectId ref) {
    this.ref = ref;
  }

  public FeatureExpanded value(String value) {
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
    FeatureExpanded featureExpanded = (FeatureExpanded) o;
    return Objects.equals(this.ref, featureExpanded.ref) &&
        Objects.equals(this.value, featureExpanded.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ref, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureExpanded {\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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

