package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.Api;
import com.convera.generated.apiable.model.CustomProperty;
import com.convera.generated.apiable.model.DocumentationVersion;
import com.convera.generated.apiable.model.FeatureExpanded;
import com.convera.generated.apiable.model.IdentifiableObjectId;
import com.convera.generated.apiable.model.Monetization;
import com.convera.generated.apiable.model.RateLimit;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Plan
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class Plan implements FindById21200Response {

  @JsonProperty("version")
  private Integer version;

  @JsonProperty("created")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime created;

  @JsonProperty("updated")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime updated;

  @JsonProperty("id")
  private Object id;

  @JsonProperty("order")
  private Integer order;

  /**
   * The status of the plan
   */
  public enum StatusEnum {
    INACTIVE("INACTIVE"),
    
    ACTIVE("ACTIVE"),
    
    ARCHIVED("ARCHIVED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("product")
  private IdentifiableObjectId product;

  @JsonProperty("apis")
  @Valid
  private List<Api> apis = null;

  @JsonProperty("gateway")
  private IdentifiableObjectId gateway;

  @JsonProperty("integrationId")
  private String integrationId;

  @JsonProperty("approvalGroupIdRef")
  private String approvalGroupIdRef;

  /**
   * The documentation level of the plan. Used to decide what level of documentation should be displayed on the portal.
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

  @JsonProperty("documentations")
  @Valid
  private List<DocumentationVersion> documentations = null;

  @JsonProperty("features")
  @Valid
  private List<FeatureExpanded> features = null;

  @JsonProperty("duration")
  private Integer duration;

  /**
   * The security level authorization type of the plan.
   */
  public enum SecurityLevelEnum {
    BASIC_API_KEY("BASIC_API_KEY"),
    
    INTERMEDIATE_JWT("INTERMEDIATE_JWT"),
    
    INTERMEDIATE_CLIENT_CREDENTIAL("INTERMEDIATE_CLIENT_CREDENTIAL"),
    
    ADVANCED_CODE_FLOW("ADVANCED_CODE_FLOW"),
    
    EVOLVED_CENTRALIZED_CLAIMS("EVOLVED_CENTRALIZED_CLAIMS");

    private String value;

    SecurityLevelEnum(String value) {
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
    public static SecurityLevelEnum fromValue(String value) {
      for (SecurityLevelEnum b : SecurityLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("securityLevel")
  private SecurityLevelEnum securityLevel;

  @JsonProperty("enableUsageEvents")
  private Boolean enableUsageEvents;

  @JsonProperty("propertiesTabName")
  private String propertiesTabName;

  @JsonProperty("propertiesDescription")
  private String propertiesDescription;

  @JsonProperty("customProperties")
  @Valid
  private List<CustomProperty> customProperties = null;

  @JsonProperty("numberOfAllowedSubscriptions")
  private Integer numberOfAllowedSubscriptions;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("rateLimit")
  private RateLimit rateLimit;

  @JsonProperty("monetization")
  private Monetization monetization;

  public Plan version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "version", required = false)
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Plan created(LocalDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  */
  @Valid 
  @Schema(name = "created", required = false)
  public LocalDateTime getCreated() {
    return created;
  }

  public void setCreated(LocalDateTime created) {
    this.created = created;
  }

  public Plan updated(LocalDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
  */
  @Valid 
  @Schema(name = "updated", required = false)
  public LocalDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(LocalDateTime updated) {
    this.updated = updated;
  }

  public Plan id(Object id) {
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

  public Plan order(Integer order) {
    this.order = order;
    return this;
  }

  /**
   * The order of the plan in the list of plans for the product.
   * @return order
  */
  
  @Schema(name = "order", description = "The order of the plan in the list of plans for the product.", required = false)
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public Plan status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the plan
   * @return status
  */
  
  @Schema(name = "status", description = "The status of the plan", required = false)
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Plan product(IdentifiableObjectId product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  */
  @Valid 
  @Schema(name = "product", required = false)
  public IdentifiableObjectId getProduct() {
    return product;
  }

  public void setProduct(IdentifiableObjectId product) {
    this.product = product;
  }

  public Plan apis(List<Api> apis) {
    this.apis = apis;
    return this;
  }

  public Plan addApisItem(Api apisItem) {
    if (this.apis == null) {
      this.apis = new ArrayList<>();
    }
    this.apis.add(apisItem);
    return this;
  }

  /**
   * List of APIs included in the plan.
   * @return apis
  */
  @Valid 
  @Schema(name = "apis", description = "List of APIs included in the plan.", required = false)
  public List<Api> getApis() {
    return apis;
  }

  public void setApis(List<Api> apis) {
    this.apis = apis;
  }

  public Plan gateway(IdentifiableObjectId gateway) {
    this.gateway = gateway;
    return this;
  }

  /**
   * Get gateway
   * @return gateway
  */
  @Valid 
  @Schema(name = "gateway", required = false)
  public IdentifiableObjectId getGateway() {
    return gateway;
  }

  public void setGateway(IdentifiableObjectId gateway) {
    this.gateway = gateway;
  }

  public Plan integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  /**
   * Integration ID of the plan in the gateway. Used to identify the plan in the gateway. For example, with Amazon API Gateway, this would be the Usage Plan ID.
   * @return integrationId
  */
  
  @Schema(name = "integrationId", description = "Integration ID of the plan in the gateway. Used to identify the plan in the gateway. For example, with Amazon API Gateway, this would be the Usage Plan ID.", required = false)
  public String getIntegrationId() {
    return integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }

  public Plan approvalGroupIdRef(String approvalGroupIdRef) {
    this.approvalGroupIdRef = approvalGroupIdRef;
    return this;
  }

  /**
   * The approval group ID reference for the plan.
   * @return approvalGroupIdRef
  */
  
  @Schema(name = "approvalGroupIdRef", description = "The approval group ID reference for the plan.", required = false)
  public String getApprovalGroupIdRef() {
    return approvalGroupIdRef;
  }

  public void setApprovalGroupIdRef(String approvalGroupIdRef) {
    this.approvalGroupIdRef = approvalGroupIdRef;
  }

  public Plan documentationLevel(DocumentationLevelEnum documentationLevel) {
    this.documentationLevel = documentationLevel;
    return this;
  }

  /**
   * The documentation level of the plan. Used to decide what level of documentation should be displayed on the portal.
   * @return documentationLevel
  */
  
  @Schema(name = "documentationLevel", description = "The documentation level of the plan. Used to decide what level of documentation should be displayed on the portal.", required = false)
  public DocumentationLevelEnum getDocumentationLevel() {
    return documentationLevel;
  }

  public void setDocumentationLevel(DocumentationLevelEnum documentationLevel) {
    this.documentationLevel = documentationLevel;
  }

  public Plan documentationPublic(Boolean documentationPublic) {
    this.documentationPublic = documentationPublic;
    return this;
  }

  /**
   * Whether the documentation is public or not.
   * @return documentationPublic
  */
  
  @Schema(name = "documentationPublic", description = "Whether the documentation is public or not.", required = false)
  public Boolean getDocumentationPublic() {
    return documentationPublic;
  }

  public void setDocumentationPublic(Boolean documentationPublic) {
    this.documentationPublic = documentationPublic;
  }

  public Plan documentations(List<DocumentationVersion> documentations) {
    this.documentations = documentations;
    return this;
  }

  public Plan addDocumentationsItem(DocumentationVersion documentationsItem) {
    if (this.documentations == null) {
      this.documentations = new ArrayList<>();
    }
    this.documentations.add(documentationsItem);
    return this;
  }

  /**
   * List of documentation versions for the plan.
   * @return documentations
  */
  @Valid 
  @Schema(name = "documentations", description = "List of documentation versions for the plan.", required = false)
  public List<DocumentationVersion> getDocumentations() {
    return documentations;
  }

  public void setDocumentations(List<DocumentationVersion> documentations) {
    this.documentations = documentations;
  }

  public Plan features(List<FeatureExpanded> features) {
    this.features = features;
    return this;
  }

  public Plan addFeaturesItem(FeatureExpanded featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

  /**
   * List of feature references for the plan.
   * @return features
  */
  @Valid 
  @Schema(name = "features", description = "List of feature references for the plan.", required = false)
  public List<FeatureExpanded> getFeatures() {
    return features;
  }

  public void setFeatures(List<FeatureExpanded> features) {
    this.features = features;
  }

  public Plan duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * The duration of the plan in days.
   * @return duration
  */
  
  @Schema(name = "duration", description = "The duration of the plan in days.", required = false)
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Plan securityLevel(SecurityLevelEnum securityLevel) {
    this.securityLevel = securityLevel;
    return this;
  }

  /**
   * The security level authorization type of the plan.
   * @return securityLevel
  */
  
  @Schema(name = "securityLevel", description = "The security level authorization type of the plan.", required = false)
  public SecurityLevelEnum getSecurityLevel() {
    return securityLevel;
  }

  public void setSecurityLevel(SecurityLevelEnum securityLevel) {
    this.securityLevel = securityLevel;
  }

  public Plan enableUsageEvents(Boolean enableUsageEvents) {
    this.enableUsageEvents = enableUsageEvents;
    return this;
  }

  /**
   * Flag to enable usage events for the plan.
   * @return enableUsageEvents
  */
  
  @Schema(name = "enableUsageEvents", description = "Flag to enable usage events for the plan.", required = false)
  public Boolean getEnableUsageEvents() {
    return enableUsageEvents;
  }

  public void setEnableUsageEvents(Boolean enableUsageEvents) {
    this.enableUsageEvents = enableUsageEvents;
  }

  public Plan propertiesTabName(String propertiesTabName) {
    this.propertiesTabName = propertiesTabName;
    return this;
  }

  /**
   * The name of the tab to display the properties of the plan.
   * @return propertiesTabName
  */
  
  @Schema(name = "propertiesTabName", description = "The name of the tab to display the properties of the plan.", required = false)
  public String getPropertiesTabName() {
    return propertiesTabName;
  }

  public void setPropertiesTabName(String propertiesTabName) {
    this.propertiesTabName = propertiesTabName;
  }

  public Plan propertiesDescription(String propertiesDescription) {
    this.propertiesDescription = propertiesDescription;
    return this;
  }

  /**
   * The description of the properties of the plan.
   * @return propertiesDescription
  */
  
  @Schema(name = "propertiesDescription", description = "The description of the properties of the plan.", required = false)
  public String getPropertiesDescription() {
    return propertiesDescription;
  }

  public void setPropertiesDescription(String propertiesDescription) {
    this.propertiesDescription = propertiesDescription;
  }

  public Plan customProperties(List<CustomProperty> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public Plan addCustomPropertiesItem(CustomProperty customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new ArrayList<>();
    }
    this.customProperties.add(customPropertiesItem);
    return this;
  }

  /**
   * List of available custom properties of the plan.
   * @return customProperties
  */
  @Valid 
  @Schema(name = "customProperties", description = "List of available custom properties of the plan.", required = false)
  public List<CustomProperty> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(List<CustomProperty> customProperties) {
    this.customProperties = customProperties;
  }

  public Plan numberOfAllowedSubscriptions(Integer numberOfAllowedSubscriptions) {
    this.numberOfAllowedSubscriptions = numberOfAllowedSubscriptions;
    return this;
  }

  /**
   * The number of allowed subscriptions allowed for the plan.
   * @return numberOfAllowedSubscriptions
  */
  
  @Schema(name = "numberOfAllowedSubscriptions", description = "The number of allowed subscriptions allowed for the plan.", required = false)
  public Integer getNumberOfAllowedSubscriptions() {
    return numberOfAllowedSubscriptions;
  }

  public void setNumberOfAllowedSubscriptions(Integer numberOfAllowedSubscriptions) {
    this.numberOfAllowedSubscriptions = numberOfAllowedSubscriptions;
  }

  public Plan name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the plan
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the plan", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Plan description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A brief, optional description of the plan to present to end user to help them select the correct plan.
   * @return description
  */
  
  @Schema(name = "description", description = "A brief, optional description of the plan to present to end user to help them select the correct plan.", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Plan rateLimit(RateLimit rateLimit) {
    this.rateLimit = rateLimit;
    return this;
  }

  /**
   * Get rateLimit
   * @return rateLimit
  */
  @Valid 
  @Schema(name = "rateLimit", required = false)
  public RateLimit getRateLimit() {
    return rateLimit;
  }

  public void setRateLimit(RateLimit rateLimit) {
    this.rateLimit = rateLimit;
  }

  public Plan monetization(Monetization monetization) {
    this.monetization = monetization;
    return this;
  }

  /**
   * Get monetization
   * @return monetization
  */
  @Valid 
  @Schema(name = "monetization", required = false)
  public Monetization getMonetization() {
    return monetization;
  }

  public void setMonetization(Monetization monetization) {
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
    Plan plan = (Plan) o;
    return Objects.equals(this.version, plan.version) &&
        Objects.equals(this.created, plan.created) &&
        Objects.equals(this.updated, plan.updated) &&
        Objects.equals(this.id, plan.id) &&
        Objects.equals(this.order, plan.order) &&
        Objects.equals(this.status, plan.status) &&
        Objects.equals(this.product, plan.product) &&
        Objects.equals(this.apis, plan.apis) &&
        Objects.equals(this.gateway, plan.gateway) &&
        Objects.equals(this.integrationId, plan.integrationId) &&
        Objects.equals(this.approvalGroupIdRef, plan.approvalGroupIdRef) &&
        Objects.equals(this.documentationLevel, plan.documentationLevel) &&
        Objects.equals(this.documentationPublic, plan.documentationPublic) &&
        Objects.equals(this.documentations, plan.documentations) &&
        Objects.equals(this.features, plan.features) &&
        Objects.equals(this.duration, plan.duration) &&
        Objects.equals(this.securityLevel, plan.securityLevel) &&
        Objects.equals(this.enableUsageEvents, plan.enableUsageEvents) &&
        Objects.equals(this.propertiesTabName, plan.propertiesTabName) &&
        Objects.equals(this.propertiesDescription, plan.propertiesDescription) &&
        Objects.equals(this.customProperties, plan.customProperties) &&
        Objects.equals(this.numberOfAllowedSubscriptions, plan.numberOfAllowedSubscriptions) &&
        Objects.equals(this.name, plan.name) &&
        Objects.equals(this.description, plan.description) &&
        Objects.equals(this.rateLimit, plan.rateLimit) &&
        Objects.equals(this.monetization, plan.monetization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, created, updated, id, order, status, product, apis, gateway, integrationId, approvalGroupIdRef, documentationLevel, documentationPublic, documentations, features, duration, securityLevel, enableUsageEvents, propertiesTabName, propertiesDescription, customProperties, numberOfAllowedSubscriptions, name, description, rateLimit, monetization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plan {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    apis: ").append(toIndentedString(apis)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    approvalGroupIdRef: ").append(toIndentedString(approvalGroupIdRef)).append("\n");
    sb.append("    documentationLevel: ").append(toIndentedString(documentationLevel)).append("\n");
    sb.append("    documentationPublic: ").append(toIndentedString(documentationPublic)).append("\n");
    sb.append("    documentations: ").append(toIndentedString(documentations)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
    sb.append("    enableUsageEvents: ").append(toIndentedString(enableUsageEvents)).append("\n");
    sb.append("    propertiesTabName: ").append(toIndentedString(propertiesTabName)).append("\n");
    sb.append("    propertiesDescription: ").append(toIndentedString(propertiesDescription)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    numberOfAllowedSubscriptions: ").append(toIndentedString(numberOfAllowedSubscriptions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
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

