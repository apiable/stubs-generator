package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.NotFoundExceptionCause;
import com.convera.generated.apiable.model.NotFoundExceptionCauseStackTraceInner;
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
 * NotFoundException
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class NotFoundException {

  @JsonProperty("cause")
  private NotFoundExceptionCause cause;

  @JsonProperty("stackTrace")
  @Valid
  private List<NotFoundExceptionCauseStackTraceInner> stackTrace = null;

  @JsonProperty("message")
  private String message;

  @JsonProperty("suppressed")
  @Valid
  private List<NotFoundExceptionCause> suppressed = null;

  @JsonProperty("localizedMessage")
  private String localizedMessage;

  public NotFoundException cause(NotFoundExceptionCause cause) {
    this.cause = cause;
    return this;
  }

  /**
   * Get cause
   * @return cause
  */
  @Valid 
  @Schema(name = "cause", required = false)
  public NotFoundExceptionCause getCause() {
    return cause;
  }

  public void setCause(NotFoundExceptionCause cause) {
    this.cause = cause;
  }

  public NotFoundException stackTrace(List<NotFoundExceptionCauseStackTraceInner> stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  public NotFoundException addStackTraceItem(NotFoundExceptionCauseStackTraceInner stackTraceItem) {
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

  public NotFoundException message(String message) {
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

  public NotFoundException suppressed(List<NotFoundExceptionCause> suppressed) {
    this.suppressed = suppressed;
    return this;
  }

  public NotFoundException addSuppressedItem(NotFoundExceptionCause suppressedItem) {
    if (this.suppressed == null) {
      this.suppressed = new ArrayList<>();
    }
    this.suppressed.add(suppressedItem);
    return this;
  }

  /**
   * Get suppressed
   * @return suppressed
  */
  @Valid 
  @Schema(name = "suppressed", required = false)
  public List<NotFoundExceptionCause> getSuppressed() {
    return suppressed;
  }

  public void setSuppressed(List<NotFoundExceptionCause> suppressed) {
    this.suppressed = suppressed;
  }

  public NotFoundException localizedMessage(String localizedMessage) {
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
    NotFoundException notFoundException = (NotFoundException) o;
    return Objects.equals(this.cause, notFoundException.cause) &&
        Objects.equals(this.stackTrace, notFoundException.stackTrace) &&
        Objects.equals(this.message, notFoundException.message) &&
        Objects.equals(this.suppressed, notFoundException.suppressed) &&
        Objects.equals(this.localizedMessage, notFoundException.localizedMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, stackTrace, message, suppressed, localizedMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotFoundException {\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    suppressed: ").append(toIndentedString(suppressed)).append("\n");
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

