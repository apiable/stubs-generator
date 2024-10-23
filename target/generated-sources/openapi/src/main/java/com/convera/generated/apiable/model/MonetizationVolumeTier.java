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
 * MonetizationVolumeTier
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class MonetizationVolumeTier {

  @JsonProperty("min")
  private Double min;

  @JsonProperty("max")
  private Double max;

  @JsonProperty("perCall")
  private Double perCall;

  @JsonProperty("flatFee")
  private Double flatFee;

  public MonetizationVolumeTier min(Double min) {
    this.min = min;
    return this;
  }

  /**
   * Get min
   * @return min
  */
  
  @Schema(name = "min", required = false)
  public Double getMin() {
    return min;
  }

  public void setMin(Double min) {
    this.min = min;
  }

  public MonetizationVolumeTier max(Double max) {
    this.max = max;
    return this;
  }

  /**
   * Get max
   * @return max
  */
  
  @Schema(name = "max", required = false)
  public Double getMax() {
    return max;
  }

  public void setMax(Double max) {
    this.max = max;
  }

  public MonetizationVolumeTier perCall(Double perCall) {
    this.perCall = perCall;
    return this;
  }

  /**
   * Get perCall
   * @return perCall
  */
  
  @Schema(name = "perCall", required = false)
  public Double getPerCall() {
    return perCall;
  }

  public void setPerCall(Double perCall) {
    this.perCall = perCall;
  }

  public MonetizationVolumeTier flatFee(Double flatFee) {
    this.flatFee = flatFee;
    return this;
  }

  /**
   * Get flatFee
   * @return flatFee
  */
  
  @Schema(name = "flatFee", required = false)
  public Double getFlatFee() {
    return flatFee;
  }

  public void setFlatFee(Double flatFee) {
    this.flatFee = flatFee;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonetizationVolumeTier monetizationVolumeTier = (MonetizationVolumeTier) o;
    return Objects.equals(this.min, monetizationVolumeTier.min) &&
        Objects.equals(this.max, monetizationVolumeTier.max) &&
        Objects.equals(this.perCall, monetizationVolumeTier.perCall) &&
        Objects.equals(this.flatFee, monetizationVolumeTier.flatFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, perCall, flatFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonetizationVolumeTier {\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    perCall: ").append(toIndentedString(perCall)).append("\n");
    sb.append("    flatFee: ").append(toIndentedString(flatFee)).append("\n");
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

