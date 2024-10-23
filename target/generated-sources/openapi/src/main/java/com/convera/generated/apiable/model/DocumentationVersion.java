package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DocumentationVersion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class DocumentationVersion {

  @JsonProperty("id")
  private Object id;

  @JsonProperty("order")
  private Integer order;

  @JsonProperty("version")
  private String version;

  @JsonProperty("status")
  @Valid
  private List<String> status = null;

  @JsonProperty("active")
  private Boolean active;

  @JsonProperty("visible")
  private Boolean visible;

  /**
   * The retrieval type of the documentation.
   */
  public enum RetrievalTypeEnum {
    MANUAL("MANUAL"),
    
    GATEWAY("GATEWAY"),
    
    CICD("CICD");

    private String value;

    RetrievalTypeEnum(String value) {
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
    public static RetrievalTypeEnum fromValue(String value) {
      for (RetrievalTypeEnum b : RetrievalTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("retrievalType")
  private RetrievalTypeEnum retrievalType;

  @JsonProperty("url")
  private String url;

  @JsonProperty("name")
  private String name;

  @JsonProperty("synced")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime synced;

  @JsonProperty("planId")
  private Object planId;

  /**
   * Documentation level of the documentation.
   */
  public enum PlanDocLevelEnum {
    PLAN("PLAN"),
    
    API("API");

    private String value;

    PlanDocLevelEnum(String value) {
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
    public static PlanDocLevelEnum fromValue(String value) {
      for (PlanDocLevelEnum b : PlanDocLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("planDocLevel")
  private PlanDocLevelEnum planDocLevel;

  @JsonProperty("apiIntegrationId")
  private String apiIntegrationId;

  public DocumentationVersion id(Object id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public Object getId() {
    return id;
  }

  public void setId(Object id) {
    this.id = id;
  }

  public DocumentationVersion order(Integer order) {
    this.order = order;
    return this;
  }

  /**
   * The order of the documentation in the list of documentation for the plan.
   * @return order
  */
  
  @Schema(name = "order", description = "The order of the documentation in the list of documentation for the plan.", required = false)
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public DocumentationVersion version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the documentation.
   * @return version
  */
  
  @Schema(name = "version", description = "The version of the documentation.", required = false)
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public DocumentationVersion status(List<String> status) {
    this.status = status;
    return this;
  }

  public DocumentationVersion addStatusItem(String statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

  /**
   * The status of the documentation.
   * @return status
  */
  
  @Schema(name = "status", description = "The status of the documentation.", required = false)
  public List<String> getStatus() {
    return status;
  }

  public void setStatus(List<String> status) {
    this.status = status;
  }

  public DocumentationVersion active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Flag to indicate if the documentation is active.
   * @return active
  */
  
  @Schema(name = "active", description = "Flag to indicate if the documentation is active.", required = false)
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public DocumentationVersion visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

  /**
   * The visibility of the documentation.
   * @return visible
  */
  
  @Schema(name = "visible", description = "The visibility of the documentation.", required = false)
  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public DocumentationVersion retrievalType(RetrievalTypeEnum retrievalType) {
    this.retrievalType = retrievalType;
    return this;
  }

  /**
   * The retrieval type of the documentation.
   * @return retrievalType
  */
  
  @Schema(name = "retrievalType", description = "The retrieval type of the documentation.", required = false)
  public RetrievalTypeEnum getRetrievalType() {
    return retrievalType;
  }

  public void setRetrievalType(RetrievalTypeEnum retrievalType) {
    this.retrievalType = retrievalType;
  }

  public DocumentationVersion url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL of the documentation.
   * @return url
  */
  
  @Schema(name = "url", description = "The URL of the documentation.", required = false)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public DocumentationVersion name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the documentation.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the documentation.", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DocumentationVersion synced(LocalDateTime synced) {
    this.synced = synced;
    return this;
  }

  /**
   * Timestamp of the last time the documentation was synchronized.
   * @return synced
  */
  @Valid 
  @Schema(name = "synced", description = "Timestamp of the last time the documentation was synchronized.", required = false)
  public LocalDateTime getSynced() {
    return synced;
  }

  public void setSynced(LocalDateTime synced) {
    this.synced = synced;
  }

  public DocumentationVersion planId(Object planId) {
    this.planId = planId;
    return this;
  }

  /**
   * Get planId
   * @return planId
  */
  
  @Schema(name = "planId", accessMode = Schema.AccessMode.READ_ONLY, required = false)
  public Object getPlanId() {
    return planId;
  }

  public void setPlanId(Object planId) {
    this.planId = planId;
  }

  public DocumentationVersion planDocLevel(PlanDocLevelEnum planDocLevel) {
    this.planDocLevel = planDocLevel;
    return this;
  }

  /**
   * Documentation level of the documentation.
   * @return planDocLevel
  */
  
  @Schema(name = "planDocLevel", accessMode = Schema.AccessMode.READ_ONLY, description = "Documentation level of the documentation.", required = false)
  public PlanDocLevelEnum getPlanDocLevel() {
    return planDocLevel;
  }

  public void setPlanDocLevel(PlanDocLevelEnum planDocLevel) {
    this.planDocLevel = planDocLevel;
  }

  public DocumentationVersion apiIntegrationId(String apiIntegrationId) {
    this.apiIntegrationId = apiIntegrationId;
    return this;
  }

  /**
   * Reference to the API if the documentation is bound to an API object.
   * @return apiIntegrationId
  */
  
  @Schema(name = "apiIntegrationId", accessMode = Schema.AccessMode.READ_ONLY, description = "Reference to the API if the documentation is bound to an API object.", required = false)
  public String getApiIntegrationId() {
    return apiIntegrationId;
  }

  public void setApiIntegrationId(String apiIntegrationId) {
    this.apiIntegrationId = apiIntegrationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentationVersion documentationVersion = (DocumentationVersion) o;
    return Objects.equals(this.id, documentationVersion.id) &&
        Objects.equals(this.order, documentationVersion.order) &&
        Objects.equals(this.version, documentationVersion.version) &&
        Objects.equals(this.status, documentationVersion.status) &&
        Objects.equals(this.active, documentationVersion.active) &&
        Objects.equals(this.visible, documentationVersion.visible) &&
        Objects.equals(this.retrievalType, documentationVersion.retrievalType) &&
        Objects.equals(this.url, documentationVersion.url) &&
        Objects.equals(this.name, documentationVersion.name) &&
        Objects.equals(this.synced, documentationVersion.synced) &&
        Objects.equals(this.planId, documentationVersion.planId) &&
        Objects.equals(this.planDocLevel, documentationVersion.planDocLevel) &&
        Objects.equals(this.apiIntegrationId, documentationVersion.apiIntegrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, order, version, status, active, visible, retrievalType, url, name, synced, planId, planDocLevel, apiIntegrationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentationVersion {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    retrievalType: ").append(toIndentedString(retrievalType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    synced: ").append(toIndentedString(synced)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planDocLevel: ").append(toIndentedString(planDocLevel)).append("\n");
    sb.append("    apiIntegrationId: ").append(toIndentedString(apiIntegrationId)).append("\n");
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

