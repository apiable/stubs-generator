package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LabelOverrides
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class LabelOverrides {

  @JsonProperty("leadingText")
  private String leadingText;

  @JsonProperty("mainText")
  private String mainText;

  @JsonProperty("trailingText")
  private String trailingText;

  @JsonProperty("detailsTitle")
  private String detailsTitle;

  @JsonProperty("detailsText")
  private String detailsText;

  @JsonProperty("ctaOverrideText")
  private String ctaOverrideText;

  @JsonProperty("ctaOverrideUrl")
  private String ctaOverrideUrl;

  public LabelOverrides leadingText(String leadingText) {
    this.leadingText = leadingText;
    return this;
  }

  /**
   * Get leadingText
   * @return leadingText
  */
  
  @Schema(name = "leadingText", required = false)
  public String getLeadingText() {
    return leadingText;
  }

  public void setLeadingText(String leadingText) {
    this.leadingText = leadingText;
  }

  public LabelOverrides mainText(String mainText) {
    this.mainText = mainText;
    return this;
  }

  /**
   * Get mainText
   * @return mainText
  */
  
  @Schema(name = "mainText", required = false)
  public String getMainText() {
    return mainText;
  }

  public void setMainText(String mainText) {
    this.mainText = mainText;
  }

  public LabelOverrides trailingText(String trailingText) {
    this.trailingText = trailingText;
    return this;
  }

  /**
   * Get trailingText
   * @return trailingText
  */
  
  @Schema(name = "trailingText", required = false)
  public String getTrailingText() {
    return trailingText;
  }

  public void setTrailingText(String trailingText) {
    this.trailingText = trailingText;
  }

  public LabelOverrides detailsTitle(String detailsTitle) {
    this.detailsTitle = detailsTitle;
    return this;
  }

  /**
   * Get detailsTitle
   * @return detailsTitle
  */
  
  @Schema(name = "detailsTitle", required = false)
  public String getDetailsTitle() {
    return detailsTitle;
  }

  public void setDetailsTitle(String detailsTitle) {
    this.detailsTitle = detailsTitle;
  }

  public LabelOverrides detailsText(String detailsText) {
    this.detailsText = detailsText;
    return this;
  }

  /**
   * Get detailsText
   * @return detailsText
  */
  
  @Schema(name = "detailsText", required = false)
  public String getDetailsText() {
    return detailsText;
  }

  public void setDetailsText(String detailsText) {
    this.detailsText = detailsText;
  }

  public LabelOverrides ctaOverrideText(String ctaOverrideText) {
    this.ctaOverrideText = ctaOverrideText;
    return this;
  }

  /**
   * Get ctaOverrideText
   * @return ctaOverrideText
  */
  
  @Schema(name = "ctaOverrideText", required = false)
  public String getCtaOverrideText() {
    return ctaOverrideText;
  }

  public void setCtaOverrideText(String ctaOverrideText) {
    this.ctaOverrideText = ctaOverrideText;
  }

  public LabelOverrides ctaOverrideUrl(String ctaOverrideUrl) {
    this.ctaOverrideUrl = ctaOverrideUrl;
    return this;
  }

  /**
   * Get ctaOverrideUrl
   * @return ctaOverrideUrl
  */
  
  @Schema(name = "ctaOverrideUrl", required = false)
  public String getCtaOverrideUrl() {
    return ctaOverrideUrl;
  }

  public void setCtaOverrideUrl(String ctaOverrideUrl) {
    this.ctaOverrideUrl = ctaOverrideUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelOverrides labelOverrides = (LabelOverrides) o;
    return Objects.equals(this.leadingText, labelOverrides.leadingText) &&
        Objects.equals(this.mainText, labelOverrides.mainText) &&
        Objects.equals(this.trailingText, labelOverrides.trailingText) &&
        Objects.equals(this.detailsTitle, labelOverrides.detailsTitle) &&
        Objects.equals(this.detailsText, labelOverrides.detailsText) &&
        Objects.equals(this.ctaOverrideText, labelOverrides.ctaOverrideText) &&
        Objects.equals(this.ctaOverrideUrl, labelOverrides.ctaOverrideUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leadingText, mainText, trailingText, detailsTitle, detailsText, ctaOverrideText, ctaOverrideUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelOverrides {\n");
    sb.append("    leadingText: ").append(toIndentedString(leadingText)).append("\n");
    sb.append("    mainText: ").append(toIndentedString(mainText)).append("\n");
    sb.append("    trailingText: ").append(toIndentedString(trailingText)).append("\n");
    sb.append("    detailsTitle: ").append(toIndentedString(detailsTitle)).append("\n");
    sb.append("    detailsText: ").append(toIndentedString(detailsText)).append("\n");
    sb.append("    ctaOverrideText: ").append(toIndentedString(ctaOverrideText)).append("\n");
    sb.append("    ctaOverrideUrl: ").append(toIndentedString(ctaOverrideUrl)).append("\n");
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

