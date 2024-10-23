package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.Auth;
import com.convera.generated.apiable.model.CustomProperty;
import com.convera.generated.apiable.model.IdentifiableObjectId;
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
 * Subscription
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class Subscription {

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

  @JsonProperty("name")
  private String name;

  /**
   * The status of the subscription
   */
  public enum StatusEnum {
    PENDING_PAYMENT("PENDING_PAYMENT"),
    
    PAYMENT_FAILED("PAYMENT_FAILED"),
    
    PENDING("PENDING"),
    
    ACTIVE("ACTIVE"),
    
    REJECTED("REJECTED"),
    
    CANCELLED("CANCELLED"),
    
    EXPIRED("EXPIRED");

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

  @JsonProperty("approvalEmailSent")
  private Boolean approvalEmailSent;

  @JsonProperty("plan")
  private IdentifiableObjectId plan;

  @JsonProperty("team")
  private IdentifiableObjectId team;

  @JsonProperty("expires")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime expires;

  @JsonProperty("integrationId")
  private String integrationId;

  @JsonProperty("auth")
  private Auth auth;

  @JsonProperty("lastAuth")
  private Auth lastAuth;

  @JsonProperty("cancelled")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime cancelled;

  @JsonProperty("checkoutSession")
  private String checkoutSession;

  @JsonProperty("stripeSubscriptionId")
  private String stripeSubscriptionId;

  @JsonProperty("priceIds")
  @Valid
  private List<String> priceIds = null;

  @JsonProperty("usageMeter")
  private String usageMeter;

  @JsonProperty("owner")
  private IdentifiableObjectId owner;

  @JsonProperty("email")
  private String email;

  @JsonProperty("customProperties")
  @Valid
  private List<CustomProperty> customProperties = null;

  public Subscription version(Integer version) {
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

  public Subscription created(LocalDateTime created) {
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

  public Subscription updated(LocalDateTime updated) {
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

  public Subscription id(Object id) {
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

  public Subscription name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the subscription
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the subscription", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Subscription status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the subscription
   * @return status
  */
  
  @Schema(name = "status", description = "The status of the subscription", required = false)
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Subscription approvalEmailSent(Boolean approvalEmailSent) {
    this.approvalEmailSent = approvalEmailSent;
    return this;
  }

  /**
   * Flag to indicate if an email has been sent to the approval group for this subscription
   * @return approvalEmailSent
  */
  
  @Schema(name = "approvalEmailSent", description = "Flag to indicate if an email has been sent to the approval group for this subscription", required = false)
  public Boolean getApprovalEmailSent() {
    return approvalEmailSent;
  }

  public void setApprovalEmailSent(Boolean approvalEmailSent) {
    this.approvalEmailSent = approvalEmailSent;
  }

  public Subscription plan(IdentifiableObjectId plan) {
    this.plan = plan;
    return this;
  }

  /**
   * Get plan
   * @return plan
  */
  @Valid 
  @Schema(name = "plan", required = false)
  public IdentifiableObjectId getPlan() {
    return plan;
  }

  public void setPlan(IdentifiableObjectId plan) {
    this.plan = plan;
  }

  public Subscription team(IdentifiableObjectId team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
  */
  @Valid 
  @Schema(name = "team", required = false)
  public IdentifiableObjectId getTeam() {
    return team;
  }

  public void setTeam(IdentifiableObjectId team) {
    this.team = team;
  }

  public Subscription expires(LocalDateTime expires) {
    this.expires = expires;
    return this;
  }

  /**
   * The date the subscription will expire
   * @return expires
  */
  @Valid 
  @Schema(name = "expires", description = "The date the subscription will expire", required = false)
  public LocalDateTime getExpires() {
    return expires;
  }

  public void setExpires(LocalDateTime expires) {
    this.expires = expires;
  }

  public Subscription integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  /**
   * Integration ID of the subscription in the API Gateway
   * @return integrationId
  */
  
  @Schema(name = "integrationId", description = "Integration ID of the subscription in the API Gateway", required = false)
  public String getIntegrationId() {
    return integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }

  public Subscription auth(Auth auth) {
    this.auth = auth;
    return this;
  }

  /**
   * Get auth
   * @return auth
  */
  @Valid 
  @Schema(name = "auth", required = false)
  public Auth getAuth() {
    return auth;
  }

  public void setAuth(Auth auth) {
    this.auth = auth;
  }

  public Subscription lastAuth(Auth lastAuth) {
    this.lastAuth = lastAuth;
    return this;
  }

  /**
   * Get lastAuth
   * @return lastAuth
  */
  @Valid 
  @Schema(name = "lastAuth", required = false)
  public Auth getLastAuth() {
    return lastAuth;
  }

  public void setLastAuth(Auth lastAuth) {
    this.lastAuth = lastAuth;
  }

  public Subscription cancelled(LocalDateTime cancelled) {
    this.cancelled = cancelled;
    return this;
  }

  /**
   * The date the subscription was marked as cancelled
   * @return cancelled
  */
  @Valid 
  @Schema(name = "cancelled", description = "The date the subscription was marked as cancelled", required = false)
  public LocalDateTime getCancelled() {
    return cancelled;
  }

  public void setCancelled(LocalDateTime cancelled) {
    this.cancelled = cancelled;
  }

  public Subscription checkoutSession(String checkoutSession) {
    this.checkoutSession = checkoutSession;
    return this;
  }

  /**
   * Checkout session ID for the subscription, only used when the subscription is created through the checkout
   * @return checkoutSession
  */
  
  @Schema(name = "checkoutSession", description = "Checkout session ID for the subscription, only used when the subscription is created through the checkout", required = false)
  public String getCheckoutSession() {
    return checkoutSession;
  }

  public void setCheckoutSession(String checkoutSession) {
    this.checkoutSession = checkoutSession;
  }

  public Subscription stripeSubscriptionId(String stripeSubscriptionId) {
    this.stripeSubscriptionId = stripeSubscriptionId;
    return this;
  }

  /**
   * Integration ID of the subscription in the Monetization service provider
   * @return stripeSubscriptionId
  */
  
  @Schema(name = "stripeSubscriptionId", description = "Integration ID of the subscription in the Monetization service provider", required = false)
  public String getStripeSubscriptionId() {
    return stripeSubscriptionId;
  }

  public void setStripeSubscriptionId(String stripeSubscriptionId) {
    this.stripeSubscriptionId = stripeSubscriptionId;
  }

  public Subscription priceIds(List<String> priceIds) {
    this.priceIds = priceIds;
    return this;
  }

  public Subscription addPriceIdsItem(String priceIdsItem) {
    if (this.priceIds == null) {
      this.priceIds = new ArrayList<>();
    }
    this.priceIds.add(priceIdsItem);
    return this;
  }

  /**
   * The monetization service price IDs of the subscription
   * @return priceIds
  */
  
  @Schema(name = "priceIds", description = "The monetization service price IDs of the subscription", required = false)
  public List<String> getPriceIds() {
    return priceIds;
  }

  public void setPriceIds(List<String> priceIds) {
    this.priceIds = priceIds;
  }

  public Subscription usageMeter(String usageMeter) {
    this.usageMeter = usageMeter;
    return this;
  }

  /**
   * The monetization service usage meter ID of the subscription
   * @return usageMeter
  */
  
  @Schema(name = "usageMeter", description = "The monetization service usage meter ID of the subscription", required = false)
  public String getUsageMeter() {
    return usageMeter;
  }

  public void setUsageMeter(String usageMeter) {
    this.usageMeter = usageMeter;
  }

  public Subscription owner(IdentifiableObjectId owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @Valid 
  @Schema(name = "owner", required = false)
  public IdentifiableObjectId getOwner() {
    return owner;
  }

  public void setOwner(IdentifiableObjectId owner) {
    this.owner = owner;
  }

  public Subscription email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email of the subscription owner
   * @return email
  */
  
  @Schema(name = "email", description = "The email of the subscription owner", required = false)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Subscription customProperties(List<CustomProperty> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public Subscription addCustomPropertiesItem(CustomProperty customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new ArrayList<>();
    }
    this.customProperties.add(customPropertiesItem);
    return this;
  }

  /**
   * The custom properties of the subscription
   * @return customProperties
  */
  @Valid 
  @Schema(name = "customProperties", description = "The custom properties of the subscription", required = false)
  public List<CustomProperty> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(List<CustomProperty> customProperties) {
    this.customProperties = customProperties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.version, subscription.version) &&
        Objects.equals(this.created, subscription.created) &&
        Objects.equals(this.updated, subscription.updated) &&
        Objects.equals(this.id, subscription.id) &&
        Objects.equals(this.name, subscription.name) &&
        Objects.equals(this.status, subscription.status) &&
        Objects.equals(this.approvalEmailSent, subscription.approvalEmailSent) &&
        Objects.equals(this.plan, subscription.plan) &&
        Objects.equals(this.team, subscription.team) &&
        Objects.equals(this.expires, subscription.expires) &&
        Objects.equals(this.integrationId, subscription.integrationId) &&
        Objects.equals(this.auth, subscription.auth) &&
        Objects.equals(this.lastAuth, subscription.lastAuth) &&
        Objects.equals(this.cancelled, subscription.cancelled) &&
        Objects.equals(this.checkoutSession, subscription.checkoutSession) &&
        Objects.equals(this.stripeSubscriptionId, subscription.stripeSubscriptionId) &&
        Objects.equals(this.priceIds, subscription.priceIds) &&
        Objects.equals(this.usageMeter, subscription.usageMeter) &&
        Objects.equals(this.owner, subscription.owner) &&
        Objects.equals(this.email, subscription.email) &&
        Objects.equals(this.customProperties, subscription.customProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, created, updated, id, name, status, approvalEmailSent, plan, team, expires, integrationId, auth, lastAuth, cancelled, checkoutSession, stripeSubscriptionId, priceIds, usageMeter, owner, email, customProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    approvalEmailSent: ").append(toIndentedString(approvalEmailSent)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    lastAuth: ").append(toIndentedString(lastAuth)).append("\n");
    sb.append("    cancelled: ").append(toIndentedString(cancelled)).append("\n");
    sb.append("    checkoutSession: ").append(toIndentedString(checkoutSession)).append("\n");
    sb.append("    stripeSubscriptionId: ").append(toIndentedString(stripeSubscriptionId)).append("\n");
    sb.append("    priceIds: ").append(toIndentedString(priceIds)).append("\n");
    sb.append("    usageMeter: ").append(toIndentedString(usageMeter)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
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

