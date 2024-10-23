package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * WebhookConf
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class WebhookConf {

  @JsonProperty("id")
  private Object id;

  /**
   * The events the webhook is listening to
   */
  public enum EventsEnum {
    CREATED("SUBSCRIPTION_CREATED"),
    
    CANCELLED("SUBSCRIPTION_CANCELLED");

    private String value;

    EventsEnum(String value) {
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
    public static EventsEnum fromValue(String value) {
      for (EventsEnum b : EventsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("events")
  @Valid
  private List<EventsEnum> events = null;

  @JsonProperty("url")
  private String url;

  @JsonProperty("whsec")
  private String whsec;

  @JsonProperty("authorization")
  private String authorization;

  @JsonProperty("headers")
  @Valid
  private Map<String, String> headers = null;

  public WebhookConf id(Object id) {
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

  public WebhookConf events(List<EventsEnum> events) {
    this.events = events;
    return this;
  }

  public WebhookConf addEventsItem(EventsEnum eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * The events the webhook is listening to
   * @return events
  */
  
  @Schema(name = "events", description = "The events the webhook is listening to", required = false)
  public List<EventsEnum> getEvents() {
    return events;
  }

  public void setEvents(List<EventsEnum> events) {
    this.events = events;
  }

  public WebhookConf url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The url of the webhook
   * @return url
  */
  
  @Schema(name = "url", description = "The url of the webhook", required = false)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public WebhookConf whsec(String whsec) {
    this.whsec = whsec;
    return this;
  }

  /**
   * The secret of the webhook
   * @return whsec
  */
  
  @Schema(name = "whsec", description = "The secret of the webhook", required = false)
  public String getWhsec() {
    return whsec;
  }

  public void setWhsec(String whsec) {
    this.whsec = whsec;
  }

  public WebhookConf authorization(String authorization) {
    this.authorization = authorization;
    return this;
  }

  /**
   * The authorization header of the webhook
   * @return authorization
  */
  
  @Schema(name = "authorization", description = "The authorization header of the webhook", required = false)
  public String getAuthorization() {
    return authorization;
  }

  public void setAuthorization(String authorization) {
    this.authorization = authorization;
  }

  public WebhookConf headers(Map<String, String> headers) {
    this.headers = headers;
    return this;
  }

  public WebhookConf putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * The headers of the webhook
   * @return headers
  */
  
  @Schema(name = "headers", description = "The headers of the webhook", required = false)
  public Map<String, String> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookConf webhookConf = (WebhookConf) o;
    return Objects.equals(this.id, webhookConf.id) &&
        Objects.equals(this.events, webhookConf.events) &&
        Objects.equals(this.url, webhookConf.url) &&
        Objects.equals(this.whsec, webhookConf.whsec) &&
        Objects.equals(this.authorization, webhookConf.authorization) &&
        Objects.equals(this.headers, webhookConf.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, events, url, whsec, authorization, headers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookConf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    whsec: ").append(toIndentedString(whsec)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

