package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.CustomProperty;
import com.convera.generated.apiable.model.NumberCustomPropertyAllOf;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NumberCustomProperty
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class NumberCustomProperty extends CustomProperty {

  @JsonProperty("value")
  private BigDecimal value;

  public NumberCustomProperty value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the custom property
   * @return value
  */
  @Valid 
  @Schema(name = "value", description = "The value of the custom property", required = false)
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public NumberCustomProperty required(Boolean required) {
    super.setRequired(required);
    return this;
  }

  public NumberCustomProperty readOnly(Boolean readOnly) {
    super.setReadOnly(readOnly);
    return this;
  }

  public NumberCustomProperty description(String description) {
    super.setDescription(description);
    return this;
  }

  public NumberCustomProperty type(TypeEnum type) {
    super.setType(type);
    return this;
  }

  public NumberCustomProperty id(Object id) {
    super.setId(id);
    return this;
  }

  public NumberCustomProperty includeInSubscriptionWizard(Boolean includeInSubscriptionWizard) {
    super.setIncludeInSubscriptionWizard(includeInSubscriptionWizard);
    return this;
  }

  public NumberCustomProperty display(String display) {
    super.setDisplay(display);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberCustomProperty numberCustomProperty = (NumberCustomProperty) o;
    return Objects.equals(this.value, numberCustomProperty.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberCustomProperty {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

