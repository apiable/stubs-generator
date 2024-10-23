package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.CustomProperty;
import com.convera.generated.apiable.model.StringCustomPropertyAllOf;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TextCustomProperty
 */


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class TextCustomProperty extends CustomProperty {

  @JsonProperty("value")
  private String value;

  public TextCustomProperty value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the custom property
   * @return value
  */
  
  @Schema(name = "value", description = "The value of the custom property", required = false)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public TextCustomProperty required(Boolean required) {
    super.setRequired(required);
    return this;
  }

  public TextCustomProperty readOnly(Boolean readOnly) {
    super.setReadOnly(readOnly);
    return this;
  }

  public TextCustomProperty description(String description) {
    super.setDescription(description);
    return this;
  }

  public TextCustomProperty type(TypeEnum type) {
    super.setType(type);
    return this;
  }

  public TextCustomProperty id(Object id) {
    super.setId(id);
    return this;
  }

  public TextCustomProperty includeInSubscriptionWizard(Boolean includeInSubscriptionWizard) {
    super.setIncludeInSubscriptionWizard(includeInSubscriptionWizard);
    return this;
  }

  public TextCustomProperty display(String display) {
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
    TextCustomProperty textCustomProperty = (TextCustomProperty) o;
    return Objects.equals(this.value, textCustomProperty.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextCustomProperty {\n");
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

