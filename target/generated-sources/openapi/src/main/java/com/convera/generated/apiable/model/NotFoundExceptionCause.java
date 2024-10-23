package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.NotFoundExceptionCauseStackTraceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * NotFoundExceptionCause
 */

@JsonTypeName("NotFoundException_cause")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class NotFoundExceptionCause {

  @JsonProperty("stackTrace")
  @Valid
  private List<NotFoundExceptionCauseStackTraceInner> stackTrace = null;

  @JsonProperty("message")
  private String message;

  @JsonProperty("localizedMessage")
  private String localizedMessage;

  public NotFoundExceptionCause stackTrace(List<NotFoundExceptionCauseStackTraceInner> stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  public NotFoundExceptionCause addStackTraceItem(NotFoundExceptionCauseStackTraceInner stackTraceItem) {
    if (this.stackTrace == null) {
      this.stackTrace = new ArrayList<>();
    }
    this.stackTrace.add(stackTraceItem);
    return this;
  }

  /**
   * Get stackTrace
   * @return stackTrace
  */
  @Valid 
  @Schema(name = "stackTrace", required = false)
  public List<NotFoundExceptionCauseStackTraceInner> getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(List<NotFoundExceptionCauseStackTraceInner> stackTrace) {
    this.stackTrace = stackTrace;
  }

  public NotFoundExceptionCause message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
  @Schema(name = "message", required = false)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public NotFoundExceptionCause localizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
    return this;
  }

  /**
   * Get localizedMessage
   * @return localizedMessage
  */
  
  @Schema(name = "localizedMessage", required = false)
  public String getLocalizedMessage() {
    return localizedMessage;
  }

  public void setLocalizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotFoundExceptionCause notFoundExceptionCause = (NotFoundExceptionCause) o;
    return Objects.equals(this.stackTrace, notFoundExceptionCause.stackTrace) &&
        Objects.equals(this.message, notFoundExceptionCause.message) &&
        Objects.equals(this.localizedMessage, notFoundExceptionCause.localizedMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stackTrace, message, localizedMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotFoundExceptionCause {\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    localizedMessage: ").append(toIndentedString(localizedMessage)).append("\n");
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

