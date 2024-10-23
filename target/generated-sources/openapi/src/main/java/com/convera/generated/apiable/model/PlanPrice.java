package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.LabelOverrides;
import com.convera.generated.apiable.model.MatchingCriteria;
import com.convera.generated.apiable.model.MonetizationVolumeTier;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PlanPrice
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class PlanPrice {

  @JsonProperty("amount")
  private Double amount;

  @JsonProperty("currency")
  private String currency;

  @JsonProperty("integrationId")
  private String integrationId;

  @JsonProperty("overageIntegrationId")
  private String overageIntegrationId;

  @JsonProperty("meterId")
  private String meterId;

  @JsonProperty("active")
  private Boolean active;

  @JsonProperty("default")
  private Boolean _default;

  @JsonProperty("tiers")
  @Valid
  private List<MonetizationVolumeTier> tiers = null;

  @JsonProperty("matchingCriteria")
  @Valid
  private List<MatchingCriteria> matchingCriteria = null;

  @JsonProperty("lookupKey")
  private String lookupKey;

  @JsonProperty("includesTax")
  private Boolean includesTax;

  @JsonProperty("labelOverrides")
  private LabelOverrides labelOverrides;

  public PlanPrice amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  */
  
  @Schema(name = "amount", required = false)
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public PlanPrice currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  */
  
  @Schema(name = "currency", required = false)
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PlanPrice integrationId(String integrationId) {
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

  public PlanPrice overageIntegrationId(String overageIntegrationId) {
    this.overageIntegrationId = overageIntegrationId;
    return this;
  }

  /**
   * Get overageIntegrationId
   * @return overageIntegrationId
  */
  
  @Schema(name = "overageIntegrationId", required = false)
  public String getOverageIntegrationId() {
    return overageIntegrationId;
  }

  public void setOverageIntegrationId(String overageIntegrationId) {
    this.overageIntegrationId = overageIntegrationId;
  }

  public PlanPrice meterId(String meterId) {
    this.meterId = meterId;
    return this;
  }

  /**
   * Get meterId
   * @return meterId
  */
  
  @Schema(name = "meterId", required = false)
  public String getMeterId() {
    return meterId;
  }

  public void setMeterId(String meterId) {
    this.meterId = meterId;
  }

  public PlanPrice active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  */
  
  @Schema(name = "active", required = false)
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public PlanPrice _default(Boolean _default) {
    this._default = _default;
    return this;
  }

  /**
   * Get _default
   * @return _default
  */
  
  @Schema(name = "default", required = false)
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public PlanPrice tiers(List<MonetizationVolumeTier> tiers) {
    this.tiers = tiers;
    return this;
  }

  public PlanPrice addTiersItem(MonetizationVolumeTier tiersItem) {
    if (this.tiers == null) {
      this.tiers = new ArrayList<>();
    }
    this.tiers.add(tiersItem);
    return this;
  }

  /**
   * Get tiers
   * @return tiers
  */
  @Valid 
  @Schema(name = "tiers", required = false)
  public List<MonetizationVolumeTier> getTiers() {
    return tiers;
  }

  public void setTiers(List<MonetizationVolumeTier> tiers) {
    this.tiers = tiers;
  }

  public PlanPrice matchingCriteria(List<MatchingCriteria> matchingCriteria) {
    this.matchingCriteria = matchingCriteria;
    return this;
  }

  public PlanPrice addMatchingCriteriaItem(MatchingCriteria matchingCriteriaItem) {
    if (this.matchingCriteria == null) {
      this.matchingCriteria = new ArrayList<>();
    }
    this.matchingCriteria.add(matchingCriteriaItem);
    return this;
  }

  /**
   * Get matchingCriteria
   * @return matchingCriteria
  */
  @Valid 
  @Schema(name = "matchingCriteria", required = false)
  public List<MatchingCriteria> getMatchingCriteria() {
    return matchingCriteria;
  }

  public void setMatchingCriteria(List<MatchingCriteria> matchingCriteria) {
    this.matchingCriteria = matchingCriteria;
  }

  public PlanPrice lookupKey(String lookupKey) {
    this.lookupKey = lookupKey;
    return this;
  }

  /**
   * Get lookupKey
   * @return lookupKey
  */
  
  @Schema(name = "lookupKey", required = false)
  public String getLookupKey() {
    return lookupKey;
  }

  public void setLookupKey(String lookupKey) {
    this.lookupKey = lookupKey;
  }

  public PlanPrice includesTax(Boolean includesTax) {
    this.includesTax = includesTax;
    return this;
  }

  /**
   * Get includesTax
   * @return includesTax
  */
  
  @Schema(name = "includesTax", required = false)
  public Boolean getIncludesTax() {
    return includesTax;
  }

  public void setIncludesTax(Boolean includesTax) {
    this.includesTax = includesTax;
  }

  public PlanPrice labelOverrides(LabelOverrides labelOverrides) {
    this.labelOverrides = labelOverrides;
    return this;
  }

  /**
   * Get labelOverrides
   * @return labelOverrides
  */
  @Valid 
  @Schema(name = "labelOverrides", required = false)
  public LabelOverrides getLabelOverrides() {
    return labelOverrides;
  }

  public void setLabelOverrides(LabelOverrides labelOverrides) {
    this.labelOverrides = labelOverrides;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanPrice planPrice = (PlanPrice) o;
    return Objects.equals(this.amount, planPrice.amount) &&
        Objects.equals(this.currency, planPrice.currency) &&
        Objects.equals(this.integrationId, planPrice.integrationId) &&
        Objects.equals(this.overageIntegrationId, planPrice.overageIntegrationId) &&
        Objects.equals(this.meterId, planPrice.meterId) &&
        Objects.equals(this.active, planPrice.active) &&
        Objects.equals(this._default, planPrice._default) &&
        Objects.equals(this.tiers, planPrice.tiers) &&
        Objects.equals(this.matchingCriteria, planPrice.matchingCriteria) &&
        Objects.equals(this.lookupKey, planPrice.lookupKey) &&
        Objects.equals(this.includesTax, planPrice.includesTax) &&
        Objects.equals(this.labelOverrides, planPrice.labelOverrides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, integrationId, overageIntegrationId, meterId, active, _default, tiers, matchingCriteria, lookupKey, includesTax, labelOverrides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanPrice {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    overageIntegrationId: ").append(toIndentedString(overageIntegrationId)).append("\n");
    sb.append("    meterId: ").append(toIndentedString(meterId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    tiers: ").append(toIndentedString(tiers)).append("\n");
    sb.append("    matchingCriteria: ").append(toIndentedString(matchingCriteria)).append("\n");
    sb.append("    lookupKey: ").append(toIndentedString(lookupKey)).append("\n");
    sb.append("    includesTax: ").append(toIndentedString(includesTax)).append("\n");
    sb.append("    labelOverrides: ").append(toIndentedString(labelOverrides)).append("\n");
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

