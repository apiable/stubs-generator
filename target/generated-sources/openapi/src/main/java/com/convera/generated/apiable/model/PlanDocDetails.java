package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.DocumentationVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PlanDocDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class PlanDocDetails implements FindById21200Response {

  @JsonProperty("id")
  private String id;

  /**
   * Gets or Sets documentationLevel
   */
  public enum DocumentationLevelEnum {
    PLAN("PLAN"),
    
    API("API");

    private String value;

    DocumentationLevelEnum(String value) {
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
    public static DocumentationLevelEnum fromValue(String value) {
      for (DocumentationLevelEnum b : DocumentationLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("documentationLevel")
  private DocumentationLevelEnum documentationLevel;

  @JsonProperty("documentationPublic")
  private Boolean documentationPublic;

  @JsonProperty("planLevelDocs")
  @Valid
  private List<DocumentationVersion> planLevelDocs = null;

  @JsonProperty("apiLevelDocs")
  @Valid
  private List<DocumentationVersion> apiLevelDocs = null;

  public PlanDocDetails id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PlanDocDetails documentationLevel(DocumentationLevelEnum documentationLevel) {
    this.documentationLevel = documentationLevel;
    return this;
  }

  /**
   * Get documentationLevel
   * @return documentationLevel
  */
  
  @Schema(name = "documentationLevel", required = false)
  public DocumentationLevelEnum getDocumentationLevel() {
    return documentationLevel;
  }

  public void setDocumentationLevel(DocumentationLevelEnum documentationLevel) {
    this.documentationLevel = documentationLevel;
  }

  public PlanDocDetails documentationPublic(Boolean documentationPublic) {
    this.documentationPublic = documentationPublic;
    return this;
  }

  /**
   * Get documentationPublic
   * @return documentationPublic
  */
  
  @Schema(name = "documentationPublic", required = false)
  public Boolean getDocumentationPublic() {
    return documentationPublic;
  }

  public void setDocumentationPublic(Boolean documentationPublic) {
    this.documentationPublic = documentationPublic;
  }

  public PlanDocDetails planLevelDocs(List<DocumentationVersion> planLevelDocs) {
    this.planLevelDocs = planLevelDocs;
    return this;
  }

  public PlanDocDetails addPlanLevelDocsItem(DocumentationVersion planLevelDocsItem) {
    if (this.planLevelDocs == null) {
      this.planLevelDocs = new ArrayList<>();
    }
    this.planLevelDocs.add(planLevelDocsItem);
    return this;
  }

  /**
   * Get planLevelDocs
   * @return planLevelDocs
  */
  @Valid 
  @Schema(name = "planLevelDocs", required = false)
  public List<DocumentationVersion> getPlanLevelDocs() {
    return planLevelDocs;
  }

  public void setPlanLevelDocs(List<DocumentationVersion> planLevelDocs) {
    this.planLevelDocs = planLevelDocs;
  }

  public PlanDocDetails apiLevelDocs(List<DocumentationVersion> apiLevelDocs) {
    this.apiLevelDocs = apiLevelDocs;
    return this;
  }

  public PlanDocDetails addApiLevelDocsItem(DocumentationVersion apiLevelDocsItem) {
    if (this.apiLevelDocs == null) {
      this.apiLevelDocs = new ArrayList<>();
    }
    this.apiLevelDocs.add(apiLevelDocsItem);
    return this;
  }

  /**
   * Get apiLevelDocs
   * @return apiLevelDocs
  */
  @Valid 
  @Schema(name = "apiLevelDocs", required = false)
  public List<DocumentationVersion> getApiLevelDocs() {
    return apiLevelDocs;
  }

  public void setApiLevelDocs(List<DocumentationVersion> apiLevelDocs) {
    this.apiLevelDocs = apiLevelDocs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanDocDetails planDocDetails = (PlanDocDetails) o;
    return Objects.equals(this.id, planDocDetails.id) &&
        Objects.equals(this.documentationLevel, planDocDetails.documentationLevel) &&
        Objects.equals(this.documentationPublic, planDocDetails.documentationPublic) &&
        Objects.equals(this.planLevelDocs, planDocDetails.planLevelDocs) &&
        Objects.equals(this.apiLevelDocs, planDocDetails.apiLevelDocs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, documentationLevel, documentationPublic, planLevelDocs, apiLevelDocs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanDocDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    documentationLevel: ").append(toIndentedString(documentationLevel)).append("\n");
    sb.append("    documentationPublic: ").append(toIndentedString(documentationPublic)).append("\n");
    sb.append("    planLevelDocs: ").append(toIndentedString(planLevelDocs)).append("\n");
    sb.append("    apiLevelDocs: ").append(toIndentedString(apiLevelDocs)).append("\n");
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

