package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.Criteria;
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
 * MatchingCriteria
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class MatchingCriteria {

  @JsonProperty("api")
  private String api;

  @JsonProperty("criteria")
  @Valid
  private List<Criteria> criteria = null;

  public MatchingCriteria api(String api) {
    this.api = api;
    return this;
  }

  /**
   * Get api
   * @return api
  */
  
  @Schema(name = "api", required = false)
  public String getApi() {
    return api;
  }

  public void setApi(String api) {
    this.api = api;
  }

  public MatchingCriteria criteria(List<Criteria> criteria) {
    this.criteria = criteria;
    return this;
  }

  public MatchingCriteria addCriteriaItem(Criteria criteriaItem) {
    if (this.criteria == null) {
      this.criteria = new ArrayList<>();
    }
    this.criteria.add(criteriaItem);
    return this;
  }

  /**
   * Get criteria
   * @return criteria
  */
  @Valid 
  @Schema(name = "criteria", required = false)
  public List<Criteria> getCriteria() {
    return criteria;
  }

  public void setCriteria(List<Criteria> criteria) {
    this.criteria = criteria;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchingCriteria matchingCriteria = (MatchingCriteria) o;
    return Objects.equals(this.api, matchingCriteria.api) &&
        Objects.equals(this.criteria, matchingCriteria.criteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(api, criteria);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchingCriteria {\n");
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
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

