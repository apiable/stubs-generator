package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.DocumentationVersion;
import com.convera.generated.apiable.model.Resource;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * API item
 */

@Schema(name = "Api", description = "API item")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class Api {

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    KONG("KONG"),
    
    AMAZON("AMAZON"),
    
    AMAZONEE("AMAZONEE"),
    
    AZURE("AZURE"),
    
    APIGEE("APIGEE");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("name")
  private String name;

  @JsonProperty("resources")
  @Valid
  private List<Resource> resources = null;

  @JsonProperty("integrationId")
  private String integrationId;

  @JsonProperty("documentations")
  @Valid
  private List<DocumentationVersion> documentations = null;

  @JsonProperty("url")
  private String url;

  @JsonProperty("serviceIntegrationId")
  private String serviceIntegrationId;

  public Api type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", required = false)
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Api name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Api resources(List<Resource> resources) {
    this.resources = resources;
    return this;
  }

  public Api addResourcesItem(Resource resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * Get resources
   * @return resources
  */
  @Valid 
  @Schema(name = "resources", required = false)
  public List<Resource> getResources() {
    return resources;
  }

  public void setResources(List<Resource> resources) {
    this.resources = resources;
  }

  public Api integrationId(String integrationId) {
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

  public Api documentations(List<DocumentationVersion> documentations) {
    this.documentations = documentations;
    return this;
  }

  public Api addDocumentationsItem(DocumentationVersion documentationsItem) {
    if (this.documentations == null) {
      this.documentations = new ArrayList<>();
    }
    this.documentations.add(documentationsItem);
    return this;
  }

  /**
   * Get documentations
   * @return documentations
  */
  @Valid 
  @Schema(name = "documentations", required = false)
  public List<DocumentationVersion> getDocumentations() {
    return documentations;
  }

  public void setDocumentations(List<DocumentationVersion> documentations) {
    this.documentations = documentations;
  }

  public Api url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "url", required = false)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Api serviceIntegrationId(String serviceIntegrationId) {
    this.serviceIntegrationId = serviceIntegrationId;
    return this;
  }

  /**
   * Get serviceIntegrationId
   * @return serviceIntegrationId
  */
  
  @Schema(name = "serviceIntegrationId", required = false)
  public String getServiceIntegrationId() {
    return serviceIntegrationId;
  }

  public void setServiceIntegrationId(String serviceIntegrationId) {
    this.serviceIntegrationId = serviceIntegrationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Api api = (Api) o;
    return Objects.equals(this.type, api.type) &&
        Objects.equals(this.name, api.name) &&
        Objects.equals(this.resources, api.resources) &&
        Objects.equals(this.integrationId, api.integrationId) &&
        Objects.equals(this.documentations, api.documentations) &&
        Objects.equals(this.url, api.url) &&
        Objects.equals(this.serviceIntegrationId, api.serviceIntegrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, resources, integrationId, documentations, url, serviceIntegrationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Api {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    documentations: ").append(toIndentedString(documentations)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    serviceIntegrationId: ").append(toIndentedString(serviceIntegrationId)).append("\n");
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

