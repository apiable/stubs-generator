package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.ConfGeneral;
import com.convera.generated.apiable.model.MonetizationConf;
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
 * Custom menu items for this product.
 */

@Schema(name = "Conf", description = "Custom menu items for this product.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class Conf {

  @JsonProperty("general")
  private ConfGeneral general;

  @JsonProperty("authorized")
  private ConfGeneral authorized;

  @JsonProperty("monetization")
  private MonetizationConf monetization;

  public Conf general(ConfGeneral general) {
    this.general = general;
    return this;
  }

  /**
   * Get general
   * @return general
  */
  @Valid 
  @Schema(name = "general", required = false)
  public ConfGeneral getGeneral() {
    return general;
  }

  public void setGeneral(ConfGeneral general) {
    this.general = general;
  }

  public Conf authorized(ConfGeneral authorized) {
    this.authorized = authorized;
    return this;
  }

  /**
   * Get authorized
   * @return authorized
  */
  @Valid 
  @Schema(name = "authorized", required = false)
  public ConfGeneral getAuthorized() {
    return authorized;
  }

  public void setAuthorized(ConfGeneral authorized) {
    this.authorized = authorized;
  }

  public Conf monetization(MonetizationConf monetization) {
    this.monetization = monetization;
    return this;
  }

  /**
   * Get monetization
   * @return monetization
  */
  @Valid 
  @Schema(name = "monetization", required = false)
  public MonetizationConf getMonetization() {
    return monetization;
  }

  public void setMonetization(MonetizationConf monetization) {
    this.monetization = monetization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conf conf = (Conf) o;
    return Objects.equals(this.general, conf.general) &&
        Objects.equals(this.authorized, conf.authorized) &&
        Objects.equals(this.monetization, conf.monetization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(general, authorized, monetization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conf {\n");
    sb.append("    general: ").append(toIndentedString(general)).append("\n");
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
    sb.append("    monetization: ").append(toIndentedString(monetization)).append("\n");
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

